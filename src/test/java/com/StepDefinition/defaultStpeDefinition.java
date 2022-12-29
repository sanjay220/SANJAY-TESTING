package com.StepDefinition;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class defaultStpeDefinition {
	//variable declaration
	private static XSSFWorkbook workBook=null;
	private static XSSFSheet sheet=null;
	private static String testDataId="";
	
	
	@Before
	public void readScenarioName(Scenario scenario) {
		testDataId=scenario.getName();
		//System.out.println("testid "+testDataId);
	}
	
	 @Given("^A workbook named \"([^\"]*)\" and sheet named \"([^\"]*)\" is read$")
	    public synchronized void a_workbook_named_something_and_sheet_named_something_is_read(String excelName, String sheetName) throws IOException {
	        workBook=new XSSFWorkbook("src//main//java//data//"+excelName+".xlsx");
	        sheet=workBook.getSheet(sheetName);
	        
	    }

public static String dataRead(String columnName) {
	
	String value="";
	for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getRow(i).getCell(1).toString());
		System.out.println(testDataId);
		System.out.println(sheet.getRow(i).getCell(1).toString().equalsIgnoreCase(testDataId.toString()));
		if(sheet.getRow(i).getCell(1).toString().equalsIgnoreCase(testDataId)) {
			for(int j=0;j<sheet.getRow(0).getPhysicalNumberOfCells();j++) {
				System.out.println(sheet.getRow(0).getCell(j).toString());
				if(sheet.getRow(0).getCell(j).toString().equalsIgnoreCase(columnName)) {
					value=sheet.getRow(i).getCell(j).toString();
				}
			}
		}
	}return value;
	
	
}
}
