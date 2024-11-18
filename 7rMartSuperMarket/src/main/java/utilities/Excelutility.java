package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class Excelutility {
	static FileInputStream f;

	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String getstringdata(int a, int b, String sheet) throws IOException {
		String testdatafile = Constant.FILEPATH;
		f = new FileInputStream(testdatafile);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getintegerdata(int a, int b, String sheet) throws IOException {

		String testdatafile = Constant.FILEPATH;
		f = new FileInputStream(testdatafile);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int) c.getNumericCellValue();
		return String.valueOf(x);
	}

}