package utils;

public class RunExcel {

	public static void main(String[] args) 
	{
		ExcelUtils ExUtil = new ExcelUtils("D:\\\\eclipse-workspace\\\\TestNGDemo\\\\src\\\\Excel\\\\ExcelTestData.xlsx","Sheet1");
		//ExUtil.getRowCount();
		ExUtil.getAllCellData();
		//ExUtil.getCellValue(2,3);
	}

}
