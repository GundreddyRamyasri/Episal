package com.Episal.Genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	

	public  String readpropdata(String propPath, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect Key");
		return propValue;
	}
	
	public String readExcelData(String path,String Sheet,int row,int cell) throws Throwable
	{
      FileInputStream fis = new FileInputStream(path);
    Workbook wb = WorkbookFactory.create(fis);
   String excelValue = wb.getSheet(Sheet).getRow(row).getCell(cell).toString();
    return excelValue;
	}
	
	public void writeExcelData(String path,String Sheet,int row,int cell,String data) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheet).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
	}
	
	public int getRowCount(String path,String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
		
	}

}
	

