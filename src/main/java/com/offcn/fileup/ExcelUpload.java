package com.offcn.fileup;

import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.mapper.MobileMapper;
import com.offcn.pojo.Mobile;

public class ExcelUpload {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
		MobileMapper mapper = context.getBean(MobileMapper.class);
		
		Workbook workbook = new WorkbookFactory().create(new File("E:\\page\\five\\Mobile.xls"));
		
		int sheets = workbook.getNumberOfSheets();
		
		for (int i = 0; i < sheets; i++) {
			
			Sheet sheet = workbook.getSheetAt(i);
			
			int rows = sheet.getPhysicalNumberOfRows();
			
			for (int j = 0; j < rows; j++) {
				
				Row row = sheet.getRow(j);
				
				if (j == 0) {
					
					continue;
					
				}
				Mobile mobile = new Mobile();
				
				mobile.setMobileNumber(row.getCell(1).getStringCellValue());
				mobile.setMobileArea(row.getCell(2).getStringCellValue());
				mobile.setMobileType(row.getCell(3).getStringCellValue());
				mobile.setAreaCode(row.getCell(4).getStringCellValue());
				mobile.setPostCode(row.getCell(5).getStringCellValue());
				
				mapper.save(mobile);
			}
		}
		workbook.close();
	}

}
