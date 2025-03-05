package FileUtilityVT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExel 
{
	 public static String propertyData(String sh, int row, int colom)
			   throws EncryptedDocumentException, IOException, InterruptedException {
			  FileInputStream fis = new FileInputStream("D:\\selenium\\FinalMockAutomation\\src\\test\\resources\\VishalOrganizationVT.xlsx");
			  Workbook wb = WorkbookFactory.create(fis);
			  Sheet sheet = wb.getSheet("sheet1");
			  Thread.sleep(2000);
			  String data = sheet.getRow(row).getCell(colom).toString();
			  return data;
}
}