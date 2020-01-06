package com.BridgeLabz.StockMangement;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface Service {
	public void addStock(File f) throws JSONException, IOException;
	public void printStock(File f) throws IOException,ParseException, JSONException;
	public void createFile(String file) throws IOException;
	public void calcTotal(File f) throws IOException, JSONException, ParseException;

	}
