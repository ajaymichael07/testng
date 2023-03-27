package exceldata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	
	XSSFWorkbook excel=new XSSFWorkbook("./Data/empl.xlsx");
	XSSFSheet sheet = excel.getSheet("Sheet1");
	
	int lastRowNum = sheet.getLastRowNum();
	System.out.println("no of row"+lastRowNum);
	
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	System.out.println("no of coloumn"+lastCellNum);
	
	for (int i = 1; i <=lastRowNum ; i++) {
		for (int j = 0; j < 2; j++) {
			String row = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(row);
		}
		
	}
}
}
