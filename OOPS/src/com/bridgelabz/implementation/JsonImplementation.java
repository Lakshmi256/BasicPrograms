package com.bridgelabz.implementation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.JsonModel;
import com.bridgelabz.service.JsonService;
import com.bridgelabz.utillity.Util;
public class JsonImplementation implements JsonService {
	JSONArray array=new JSONArray();
	private static JsonModel obj;
	public static JsonModel setObj()
	{
		obj=new JsonModel();
		return obj;
	}
	public void addItems(File f) throws IOException, Exception {
		JsonModel ob=setObj();
	    System.out.print("Enter the number of items");
	    int num=Util.readInt();
	    for(int i=0;i<num;i++)
	    {
		System.out.println("Enter the Item Name :");
		String name=Util.bufferScanner();
		ob.setName(name);
		System.out.println("Enter the Weight(Kg):");
		float weight=Util.readfloat();
		ob.setWeight(weight);
		System.out.println("Enter the Price/Kg");
		float addr=Util.readfloat();
		ob.setPrice(addr);
		JSONObject object=new JSONObject();
        object.put("Item name",ob.getName());
        object.put("Weight",ob.getWeight());
        object.put("Price",ob.getPrice());
        array.put(object);
	    }
        PrintWriter pw=new PrintWriter(f);
        pw.write(array.toString());
        pw.flush();
        pw.close();
	}
	public void printItems(File f) throws IOException, ParseException, JSONException {
		FileReader fr=null;
		try
		{
		fr=new FileReader(f);
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
	        System.out.print(ob+" ");
		}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fr.close();
		}		
	}
	public void createFile(String file) throws IOException {
		File f=new File(file);
		FileWriter fr=new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
	}
	@Override
	public void grandTotal(String s) throws JSONException, IOException, ParseException, ClassCastException {
		
			FileReader fr=null;
			File f=null;
			f=new File(s);
			fr=new FileReader(f);
			int gt=0;
			try
			{
			
			JSONParser parser=new JSONParser();
			array=new JSONArray(parser.parse(fr).toString());
		    
			for(int i=0;i<array.length();i++)
			{
			   JSONObject ob=array.getJSONObject(i);
		     
		      Integer prod=(Integer)ob.get("Price")*(Integer)ob.get("Weight");
		       gt=gt+prod;   
			}
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				fr.close();
			}
		
		   JSONObject newOb=new JSONObject();
			newOb.put("Grand Total",(Integer)gt);
		
	       array.put(newOb);
		
	       PrintWriter pw=new PrintWriter(f);
	       pw.write(array.toString());
	       pw.flush();
	       pw.close();
		

	}

}
