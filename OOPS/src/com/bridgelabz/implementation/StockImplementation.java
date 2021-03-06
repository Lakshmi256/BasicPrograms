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

import com.bridgelabz.model.StockModel;
import com.bridgelabz.service.StockService;
import com.bridgelabz.utillity.Util;
public class StockImplementation implements StockService{
	JSONArray array=new JSONArray();
	private static StockModel obj;
	public static StockModel setObj()
	{
		obj=new StockModel();
		return obj;
	}
	
	public void readfile(String s1) {
		// TODO Auto-generated method stub
		
	}

	public void addStock(File f)throws JSONException,IOException {
		// TODO Auto-generated method stub
		StockModel ob=setObj();
		System.out.println("enter the number of Stock");
		int n=Util.readInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the Share name ");
			String name=Util.readString();
			ob.setName(name);
			System.out.println("enter the number of shares");
			float a=Util.readfloat();
			ob.setPrice(a);
			System.out.println("enter the price of shares ");
			int b=Util.readInt();
			ob.setQty(b);
			JSONObject object=new JSONObject(); 
			object.put("Share name",ob.getName());
	        object.put("Price of share",ob.getPrice());
	        object.put("Number of shares",ob.getQty());
	        array.put(object);
		    }
		  PrintWriter pw=new PrintWriter(f);
	        pw.write(array.toString());
	        pw.flush();
	        pw.close();
		}	

	public void createFile(String file) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(file);
		FileWriter fr=new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
	}

	public void calculate(File f) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		Integer prod=0;
			fr=new FileReader(f);
			int gt=0;
			JSONArray arr=null;
			try
			{
			
			JSONParser parser=new JSONParser();
			array=new JSONArray(parser.parse(fr).toString());
		    arr=new JSONArray();
			for(int i=0;i<array.length();i++)
			{
			   JSONObject ob=array.getJSONObject(i);
		     
		      prod=(Integer)ob.get("Price of share")*(Integer)ob.get("Number of shares");
		       gt=gt+prod;
		       arr.put(prod);			
			
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
			newOb.put("Stock Total",(Integer)gt);
		
	        array.put(newOb);
	        JSONObject obNew=new JSONObject();
	        obNew.put("Shares Total ",arr);
	        array.put(obNew);
		
	        PrintWriter pw=new PrintWriter(f);
	        pw.write(array.toString());
	        pw.flush();
	        pw.close();
		}

	@Override
	public void printStock(File f) throws IOException, ParseException, JSONException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcTotal(File f) throws IOException, JSONException, ParseException {
		// TODO Auto-generated method stub
		
	}

	}