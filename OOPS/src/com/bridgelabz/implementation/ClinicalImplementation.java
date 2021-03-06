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

import com.bridgelabz.model.DoctorModel;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.service.ClinicalService;
import com.bridgelabz.utillity.Queue;
import com.bridgelabz.utillity.Util;

public class ClinicalImplementation implements ClinicalService {

	JSONArray array = new JSONArray();

	@Override
	public void addDoctors(File f) throws IOException, JSONException {

		DoctorModel d = new DoctorModel();

		System.out.println("Enter the number of doctors you wish to enter");
		int n = Util.readInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the Doctor Name: ");
			String docName = Util.readString();
			d.setDocName(docName);
			System.out.print("Enter the Doctor Id: ");
			String docId = Util.readString();
			d.setDocId(docId);
			System.out.print("Enter the Doctor Specialization: ");
			String docSpec = Util.readString();
			d.setDocSpec(docSpec);
			System.out.print("Enter the Doctor Availability(AM/PM): ");
			String docAvail = Util.readString();
			d.setDocAvail(docAvail);
			Queue<String> queue = new Queue<String>();
			d.setDocQueue(queue);
			d.setDocCount(0);

			JSONObject object = new JSONObject();
			object.put("doc name", d.getDocName());
			object.put("doc id", d.getDocId());
			object.put("doc spec", d.getDocSpec());
			object.put("doc avail", d.getDocAvail());
			object.put("doc app", d.getDocQueue());
			object.put("doc count", d.getDocCount());
			array.put(object);
		}
		PrintWriter pw = new PrintWriter(f);
		pw.write(array.toString());
		pw.flush();
		pw.close();

	}

	@Override
	public void addPatients(File f) throws IOException, JSONException {

		PatientModel p = new PatientModel();
		System.out.println("Enter the number of patients you wish to enter");
		int n = Util.readInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the Patient Name: ");
			String patname = Util.readString();
			p.setPatname(patname);
			System.out.print("Enter the Patient Id: ");
			String patid = Util.readString();
			p.setPatid(patid);
			System.out.print("Enter the Patient Mobile No: ");
			String patmob = Util.readString();
			p.setPatmob(patmob);
			System.out.print("Enter the Patient age: ");
			String patage = Util.readString();
			p.setPatage(patage);

			JSONObject object = new JSONObject();
			object.put("pat name", p.getPatname());
			object.put("pat id", p.getPatid());
			object.put("pat mob", p.getPatmob());
			object.put("pat age", p.getPatage());
			array.put(object);
		}
		PrintWriter pw = new PrintWriter(f);
		pw.write(array.toString());
		pw.flush();
		pw.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean bookAppointment(String s3, String s4, File f, File f2)
			throws IOException, JSONException, ParseException {
		FileReader fr = null;
		boolean flag = false;
		int n = 0;
		Queue<String> queue = null;
		JSONObject ob = null;

		try {
			fr = new FileReader(f);
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				ob = array.getJSONObject(i);
				if ((int) ob.get("doc count") <= 5 && ob.get("doc name").equals(s4)) {
					queue = (Queue<String>) ob.get("doc app");
					queue.enqueue(s3);
					n = (int) ob.get("doc count");
					n++;
					flag = true;
				} else {
					flag = false;
				}
			}
			ob.put("doc app", queue);
			ob.put("doc count", n);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
		if (flag == true) {
			PrintWriter pw = new PrintWriter(f2);
			pw.write(array.toString());
			pw.flush();
			pw.close();
		}
		return flag;
	}

	@Override
	public boolean searchDoctor(String data, File f) throws JSONException, IOException, ParseException {

		FileReader fr = null;
		boolean flag = false;
		try {
			fr = new FileReader(f);
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				if (ob.get("doc name").equals(data) || ob.get("doc id").equals(data) || ob.get("doc spec").equals(data)
						|| ob.get("doc avail").equals(data)) {
					System.out.println("Name: " + ob.get("doc name"));
					System.out.println("Id :" + ob.get("doc id"));
					System.out.println("Spec. :" + ob.get("doc spec"));
					System.out.println("Avail :" + ob.get("doc avail"));
					System.out.println("Appointment :" + ob.get("doc app"));
					System.out.println("Count :" + ob.get("doc count"));

					flag = true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
		return flag;
	}

	@Override
	public boolean searchPatient(String data, File f) throws JSONException, IOException, ParseException {

		FileReader fr = null;
		boolean flag = false;
		try {
			fr = new FileReader(f);
			JSONParser parser = new JSONParser();
			array = new JSONArray(parser.parse(fr).toString());

			for (int i = 0; i < array.length(); i++) {
				JSONObject ob = array.getJSONObject(i);
				if (ob.get("pat name").equals(data) || ob.get("pat id").equals(data) || ob.get("pat mob").equals(data)
						|| ob.get("pat age").equals(data)) {
					System.out.println("Name: " + ob.get("pat name"));
					System.out.println("Id :" + ob.get("pat id"));
					System.out.println("Mob no. :" + ob.get("pat mob"));
					System.out.println("Age :" + ob.get("pat age"));
					flag = true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
		return flag;
	}

	public void createFile(String file) throws IOException {
		File f = new File(file);
		FileWriter fr = new FileWriter(f);
		fr.write("[]");
		fr.flush();
		fr.close();
	}

}