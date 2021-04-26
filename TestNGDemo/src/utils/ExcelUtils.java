package utils;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.SheetType;

public class ExcelUtils 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String path,String sheetName)
	{
		try
		{
			workbook 	= new XSSFWorkbook(path);
			//"D:\\eclipse-workspace\\TestNGDemo\\src\\Excel\\ExcelTestData.xlsx"----> path
			sheet 		= workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void main(String[] args)
	{
		//getRowCount();
		getAllCellData();
		//getCellValue(3,2);
		
	}
	public static void getRowCount() 
	{
		try 
		{
			int rowCount 	= sheet.getPhysicalNumberOfRows();
			System.out.println("Total no of rows are: "+rowCount);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		
	}
	
	public static void getAllCellData() 
	{
		try 
		{		
			int rowCount 		= sheet.getPhysicalNumberOfRows();
			int coloumnCount 	= sheet.getRow(0).getLastCellNum();
			System.out.println("Row: "+rowCount);
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<coloumnCount;j++)
			{
				String cellvalue= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellvalue);
			}
			System.out.println("---------------------------------");
		}
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
	}
	public static void getCellValue(int row,int coloumn)
	{
		try
		{
			String cellValue = sheet.getRow(row).getCell(coloumn).getStringCellValue();
			System.out.println(cellValue);
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			e.getStackTrace();
		}
	}
		
}