package ReadFileData;

import com.excel.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {

ExcelDataConfig excel = new ExcelDataConfig("C:\\ExcelData\\TestData.xlsx");
System.out.println(excel.getData(0, 0, 0));

}
}
