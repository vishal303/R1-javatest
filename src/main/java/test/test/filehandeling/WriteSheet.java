package test.test.filehandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteSheet ws = new WriteSheet();
		ws.createExcel("TestFile.xlsx","testSheet");

	}
	
	public void createExcel(String fileNameToBeCreated,String sheetName) {
		
		//Create Blank workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		//Create a blank spreadsheet
		XSSFSheet spreadsheet = workbook.createSheet(sheetName);
		
		
		XSSFRow row = null;//spreadsheet.createRow((short)1);
		XSSFCell cell = null;
		 
		
		Map <String, Object[]> myRecords = new TreeMap<String, Object[]>();
		
		myRecords.put("1", new Object[] {"Name","Phone"});
		myRecords.put("2", new Object[] {"Vishal","9519496699"});
		myRecords.put("3", new Object[] {"Singh","45999483"});
		myRecords.put("4", new Object[] {"Chauhan","839494843"});
		
		Set<String> keySet = myRecords.keySet();
		
		int rowid = 0;
	      for (String key : keySet)
	      {
	         row = spreadsheet.createRow(rowid++);
	         Object [] objectArr = myRecords.get(key);
	         int cellid = 0;
	         for (Object obj : objectArr)
	         {
	            cell = row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	            System.out.println("Row " + rowid + ", Cell "+cellid+ " value is: "+ (String)obj);
	         }
	      }
	      //Write the workbook in file system
	      FileOutputStream out;
		try {
			out = new FileOutputStream(new File(fileNameToBeCreated));
			workbook.write(out);
		    out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	      
	      System.out.println( fileNameToBeCreated + " written successfully" );
	}
	
	public void readExcel(String fileNameToBeCreated,String sheetName) {
		
	}
}

