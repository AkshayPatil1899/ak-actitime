package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	
	public  String  getPropertyData(String key) throws IOException {
		FileInputStream f= new FileInputStream("./data/commondata.property");
		Properties p= new  Properties();
		p.load(f);
		String data = p.getProperty(key);
		return data ;
	}
	public String getExcelData(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f= new FileInputStream("./data/TestScript.xls");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	
	
}
	/*public void setExcelData(String sheetname, int row, int cell, String value) throws EncryptedDocumentException, IOException {
		FileInputStream f= new FileInputStream("./data/TestScript");
		Workbook wb = WorkbookFactory.create(f);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fo= new FileOutputStream("./data/TestScript");
		wb.write(fo);
		wb.close();
	}
}
*/