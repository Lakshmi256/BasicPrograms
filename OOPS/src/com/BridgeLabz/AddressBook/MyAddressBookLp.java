package com.BridgeLabz.AddressBook;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.BridgeLabz.Utility.Utils;
public class MyAddressBookLp {
	JSONArray array=new JSONArray();
	String fileName;
	private static service obj;
	public static service setObj()
	{
		obj=new service();
		return obj;
			
	}
	public void addRecord() throws JSONException, FileNotFoundException {
		// TODO Auto-generated method stub
		service ob=setObj();
		System.out.println("Enter the First Name :");
	String first_name=Utils.readString();
		boolean b=false;
		try 
		{
			b=checkRecord(first_name);
		} 
		catch (IOException | NullPointerException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b==true)
			System.out.println("Record already exists!");
		else
		{
		ob.setFname(first_name);
		System.out.println("Enter the Last Name :");
		String last_name=Utils.readString();
		ob.setLname(last_name);
		System.out.println("Enter the Address");
		String addr=Utils.readString();
		ob.setAddress(addr);
		System.out.println("Enter the City :");
		String city_name=Utils.readString();
		ob.setCity(city_name);
		System.out.println("Enter the State :");
		String state_name=Utils.readString();
		ob.setState(state_name);
		System.out.println("Enter the Pin");
		int zip_code=Utils.readInt();
		ob.setZip(zip_code);
		System.out.println("Enter the Phone Number:");
		long phno=Utils.readlong();
		ob.setPhoneno(phno);
		JSONObject object=new JSONObject();
        object.put("firstname",first_name);
        object.put("lastname",last_name);
        object.put("address",addr);
        object.put("city",city_name);
        object.put("state",state_name);
        object.put("zip",zip_code);
        object.put("Phone Number",phno);
        array.put(object);
        PrintWriter pw=new PrintWriter("AddressBook.json");
        pw.write(array.toString());
        pw.flush();
        pw.close();

		}
	}
	private boolean checkRecord(String first_name) throws IOException {
		// TODO Auto-generated method stub
		boolean flag=false;
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		if(first_name.equals(ob.getString("firstname")))
			flag=true;
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception is thrown");
			flag=false;
		}
		finally
		{
			fr.close();
		}
		return flag;
		
	}
	public void printRecord() throws JSONException, IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
	        System.out.println(ob);
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

	public boolean match(String fname) {
		// TODO Auto-generated method stub
		{
			boolean b=false;
		try
		{
			b=checkRecord(fname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
			return b;
		}
	}

	public void deleteRecord(String fname) throws JSONException, IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
			array.remove(i);
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

	public void updateRecord(String fname) throws JSONException, IOException, ParseException {
		// TODO Auto-generated method stub

		FileReader fr=null;
		try
		{
		fr=new FileReader("AddressBook.json");
		JSONParser parser=new JSONParser();
		array=new JSONArray(parser.parse(fr).toString());
		boolean b=false;
		for(int i=0;i<array.length();i++)
		{
			JSONObject ob=array.getJSONObject(i);
		    if(fname.equals(ob.getString("firstname")))
		    {
		    	b=true;
				System.out.println("Enter the Last Name :");
				String last_name=Utils.readString();
				ob.put("lastname",last_name);
				System.out.println("Enter the Address");
				String addr=Utils.readString();
				ob.put("address", addr);
				System.out.println("Enter the City :");
				String city_name=Utils.readString();
				ob.put("city", city_name);
				System.out.println("Enter the State :");
				String state_name=Utils.readString();
				ob.put("state",state_name);
				System.out.println("Enter the Pin");
				int zip_code=Utils.readInt();
				ob.put("zip",zip_code);
				System.out.println("Enter the Phone Number:");
				long phno=Utils.readlong();
				ob.put("Phone Number",phno);
		        array.put(ob);
		        PrintWriter pw=new PrintWriter("AddressBook.json");
		        pw.write(array.toString());
		        pw.flush();
		        pw.close();	
		    }
		    if(b==true)
		    	break;
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
}
