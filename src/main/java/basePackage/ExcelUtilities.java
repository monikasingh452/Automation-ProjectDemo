package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	/**
	 * @author Monika Singh
	 * readData() will read data from Excel Sheet.
	 * @param filepath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */
	//public static String filepath;
	
	
	public static String readData(String filepath,String sheet,int row, int cell)   
	{
	 String value= null;
		
		try
		{
			FileInputStream fis=	new FileInputStream(filepath);
			Workbook wb=WorkbookFactory.create(fis);
			
		//Workbook wb= WorkbookFactory.create(new FileInputStream(new File(filepath)));
		//value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		//System.out.println(value);
		/*Sheet sh= wb.getSheetAt(0);
		System.out.println("SheetName"+sh);
		Row rw= sh.getRow(row);
		System.out.println("RowName"+rw);
		Cell cl=rw.getCell(cell);
		System.out.println("CellName"+cl);
		value= cl.getStringCellValue();
		System.out.println(value);*/
		
	
			 Sheet mySheet = wb.getSheetAt(0);
		       Cell cl = mySheet.getRow(row).getCell(cell);
		         value = cl.getStringCellValue();
		         System.out.println(value);
		       
		   
		        
		      /*  Sheet mySheet = wb.getSheetAt(0);
		        Iterator<Row> rowIter = mySheet.rowIterator();
		        for ( Iterator<Row> rowIterator = mySheet.rowIterator() ;rowIterator.hasNext(); )
		        {
		            for (  Iterator<Cell> cellIterator = ((Row)rowIterator.next()).cellIterator() ; cellIterator.hasNext() ;  ) 
		            {
		            	value= ( (Cell)cellIterator.next() ).toString() ;
		            	System.out.println(value);
		            }
		            System.out.println( " **************************************************************** ");
		        }*/
		
		
		
		//sheet.getRow().getCell().getNumericCellValue();
	                
	            }
		catch(EncryptedDocumentException e)
		{
		   e.printStackTrace();	
		}
		
		catch(InvalidFormatException e)
		{
			e.printStackTrace();		
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();	
		}
		
		catch(IOException e)
		{
			e.printStackTrace();	
		}
		return value;
		
		//return value;

}
	
	
}