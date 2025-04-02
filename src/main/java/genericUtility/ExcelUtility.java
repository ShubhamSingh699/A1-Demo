package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
/**
 * This is a generic method to fetch Cell data from Excel file	
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @return 
 * @throws IOException
 */
public String getDataFromExcelFile(String sheetName, int rowIndex, int cellIndex) throws Exception
{
	FileInputStream fis = new FileInputStream(IpathUtility.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row r = sh.getRow(rowIndex);
	Cell c = r.getCell(cellIndex);
	DataFormatter df = new DataFormatter();
	String value = df.formatCellValue(c);
	return value;
}
/**
 * This is a generic method to fetch data from different Excel File
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @return
 * @throws IOException
 */

public String getDataFromExcelFile1(String sheetName, int rowIndex, int cellIndex) throws IOException
{
	FileInputStream fis = new FileInputStream(IpathUtility.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row r = sh.getRow(rowIndex);
	Cell c = r.getCell(cellIndex);
	DataFormatter df = new DataFormatter(); 
	String value1 = df.formatCellValue(c);
	return value1;
}

/**
 * This is a generic method to fetch multiple data from Excel file
 * @param sheetName
 * @param rowIndex
 * @param CellIndex
 * @param StartrowIndex
 * @return
 * @throws Exception
 */
public List<String> getMultipleDataFromExcelFile(String sheetName, int rowIndex, int CellIndex, int StartrowIndex) throws Exception
{
	FileInputStream fis = new FileInputStream(IpathUtility.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	DataFormatter df = new DataFormatter();
	List<String> list = new ArrayList<String>();
	for(int i=StartrowIndex; i<=sh.getLastRowNum(); i++)
	{
		Row r1= sh.getRow(i);
		for(int j=0; j<r1.getLastCellNum(); j++)
		{
			Cell c1 = r1.getCell(j);
			String value = df.formatCellValue(c1);
			list.add(value);
			System.out.println(value+"");
		}
		System.out.println();
	}
	return list;
}

/**
 * This is a generic method to write a data to excel file from script
 * @param sheetName
 * @param rowIndex
 * @param CellIndex
 * @param value
 * @throws Exception
 */
public void writeDatatoExcelFile(String sheetName, int rowIndex, int CellIndex, String value) throws Exception
{
	FileInputStream fis = new FileInputStream(IpathUtility.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row= sh.createRow(rowIndex);
	Cell c= row.createCell(CellIndex);
	c.setCellValue(value);
	FileOutputStream fos = new FileOutputStream(IpathUtility.excelpath);
	wb.write(fos);
	
	Random random = new Random();
	int value1 = random.nextInt(10000);
	System.out.println(value1);
}
}