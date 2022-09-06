package com.DataDriven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		
	
		XSSFWorkbook xs=new XSSFWorkbook("D:\\driven\\datadriven.xlsx");

		XSSFSheet sheet=  xs.getSheetAt(0);
		//System.out.println(sheet.getRow(1).getCell(1));


		for (int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		Row r =sheet.getRow(i);
		for(int a=0;a<r.getPhysicalNumberOfCells();a++) {
		System.out.println(r.getCell(a));
	

	}
		}

	}
}
