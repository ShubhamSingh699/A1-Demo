package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcelFile
{

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\Animal.xslx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Animal");
		DataFormatter df = new DataFormatter();
		for(int i=1;i<=sh.getLastRowNum();i++) 
		{
			Row r = sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell C = r.getCell(j);
				String value = df.formatCellValue(C);
				System.out.println(value);
			}
		}

	}
}