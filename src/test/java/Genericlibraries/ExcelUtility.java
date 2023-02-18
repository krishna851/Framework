package Genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook wb;
	/**
	 * this method is used to initialize excel workbook
	 * @param excelpath
	 */
	public void excelInitialization(String excelpath) {
		FileInputStream fis = null;
		try {
			 fis=new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		try {
			wb=WorkbookFactory.create(fis);
			
		}catch(EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}
public String fecthDataFromExcel(String sheetName, int rowNum, int CellNum) {
	return wb.getSheet(sheetName).getRow(rowNum).getCell(CellNum).getStringCellValue();
	
}
public List<String> fecthDataFromExcel (String sheetname){
	List<String> dataList=new ArrayList<>();
	Sheet sheet=wb.getSheet(sheetname);
	for(int i=0;i<=sheet.getLastRowNum();i++) {
		String data=sheet.getRow(i).getCell(1).getStringCellValue();
		dataList.add(data);
		
	}
return dataList;
}
/**
 * this method 
 */
public void closeexcel() {
	try {
		
		
		wb.close();
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}
}

}
