package com.DataDrivenTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.ExcelDataConfig;

public class DataDrivenTest {

public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");

ExcelDataConfig config = new ExcelDataConfig("C:\\ExcelData\\DataProvider.xlsx");
int rowCount= config.getRowCount(0);
System.out.println("Total No of rows : " + rowCount);

for(int rowNum=1; rowNum<rowCount ; rowNum++)
{	
String firstName= config.getData(0, rowNum, 0);
System.out.println(firstName);

String lastName= config.getData(0, rowNum, 1);
System.out.println(lastName);

String userName= config.getData(0, rowNum, 2);
System.out.println(userName);

String password= config.getData(0, rowNum, 3);
System.out.println(password);

String confirm= config.getData(0, rowNum, 4);
System.out.println(confirm);

driver.findElement(By.name("firstName")).clear();
driver.findElement(By.name("firstName")).sendKeys(firstName);

driver.findElement(By.name("lastName")).clear();
driver.findElement(By.name("lastName")).sendKeys(lastName);

driver.findElement(By.name("Username")).clear();
driver.findElement(By.name("Username")).sendKeys(userName);

driver.findElement(By.name("Passwd")).clear();
driver.findElement(By.name("Passwd")).sendKeys(password);

driver.findElement(By.name("ConfirmPasswd")).clear();
driver.findElement(By.name("ConfirmPasswd")).sendKeys(confirm);


}
}
}
