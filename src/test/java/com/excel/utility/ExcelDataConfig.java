package com.excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {	
	
static XSSFWorkbook wb;

static XSSFSheet sheet1;

static FileOutputStream fout;

public  ExcelDataConfig(String excelPath)
{
	
try 
{
   File src= new File(excelPath);
	FileInputStream fis = new FileInputStream(src);
	
	wb= new XSSFWorkbook(fis);
	
	fout= new FileOutputStream(src);
	
} 
catch (IOException e)
{
	System.out.println(e.getMessage());
}

}
public String getData(int sheetNum, int row, int Col) {
sheet1= wb.getSheetAt(sheetNum);
String data= sheet1.getRow(row).getCell(Col).getStringCellValue();
return data;	
}

public int getRowCount(int sheetNum) {
	
sheet1=wb.getSheetAt(sheetNum);
Integer rowCount= sheet1.getLastRowNum();
rowCount= rowCount+1;
return rowCount;	
}


public void setData(int sheetNum , int row, int col, String value) throws IOException {

sheet1= wb.getSheetAt(sheetNum);

sheet1.getRow(row).createCell(col).setCellValue(value);

wb.write(fout);

}
}


