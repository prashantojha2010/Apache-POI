package WriteFileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

public static void main(String[] args) throws IOException {
	
File src= new File("C:\\ExcelData\\TestData.xlsx");
FileInputStream fis = new FileInputStream(src);

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1= wb.getSheetAt(0);

sheet1.getRow(0).createCell(2).setCellValue("Status");
sheet1.getRow(1).createCell(2).setCellValue("Pass");
sheet1.getRow(2).createCell(2).setCellValue("fail");
sheet1.getRow(3).createCell(2).setCellValue(10.43);

FileOutputStream fout= new FileOutputStream(src);
wb.write(fout);
wb.close();

}
}
