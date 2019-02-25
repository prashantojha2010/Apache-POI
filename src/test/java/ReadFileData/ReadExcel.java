package ReadFileData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static void main(String[] args) throws Exception {

File src= new File("C:\\ExcelData\\TestData.xlsx");

FileInputStream fis = new FileInputStream(src);

XSSFWorkbook wb= new XSSFWorkbook(fis);

XSSFSheet sheet1= wb.getSheetAt(0);

String data0= sheet1.getRow(14).getCell(1).getStringCellValue();

System.out.println("Data from Excel: "+  data0);

wb.close();

}
}
