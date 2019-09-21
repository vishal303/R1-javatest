package test.test.filehandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;



public class ReadSheet {

	public static void main(String[] args)
    {
		Map<Double,ArrayList> excelMap = new TreeMap<Double,ArrayList>();
		List <String> rowList = new ArrayList<String>();
		Double rowId=0.0;
        try
        {
            FileInputStream fis = new FileInputStream(new File("TestFile.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                    rowList.add(cell.getStringCellValue());
                }
                excelMap.put(rowId++,(ArrayList)rowList );
                rowList.clear();
                System.out.println("");
            }
            System.out.println("Size of Map is : " + excelMap.size());
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
	

}
