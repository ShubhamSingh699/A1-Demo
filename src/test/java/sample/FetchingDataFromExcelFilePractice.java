package sample;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFilePractice {

	public static void main(String[] args) throws Exception{
		ExcelUtility eUtil = new ExcelUtility();
		String value = eUtil.getDataFromExcelFile("Animal", 5, 0);
		String value1 = eUtil.getDataFromExcelFile("Bird", 5, 0);
		System.out.println(value);
		System.out.println(value1);
	}

}
