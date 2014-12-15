package test;

import java.util.ArrayList;
import java.util.List;

import Util.CsvToXml;

public class TestCSVToXML {

	public static void main(String[] args) {
		CsvToXml csvToXml = new CsvToXml();
		List<String[]> entries = new ArrayList<String[]>();
		entries = csvToXml.csvToList();
		for (String[] s : entries) {
			for (String ss : s) {
				System.out.println(ss);
			}
			System.out.println("eol");
		}
	}
}
