package com.bridgelabz.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface StockAccountService {
	public double valueOf();

	public boolean buy(int amount, String symbol, String name)
			throws FileNotFoundException, IOException, JSONException, ParseException;

	public void sell(int amount, String symbol, String name);

	public void addCustomer(File f) throws IOException, JSONException;

	public void addShares(File f) throws IOException, JSONException;
}
