package Library;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public static String  ExcelSheet (int raw , int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream ("D:\\Testing files\\Angleapk.xlsx");
		 String sheet = WorkbookFactory.create(file).getSheet("Sheet1").getRow(raw).getCell(cell).getStringCellValue();
		 return sheet;
	}

}
