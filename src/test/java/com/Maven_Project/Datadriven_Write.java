package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_Data() throws Throwable {

		File f = new File("C:\\Users\\asus\\eclipse-workspace_8\\Maven_Project\\src\\test\\java\\com\\Maven_Project\\Datadriven_Write.java");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("User Info");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Ganesh");
		
		w.getSheet("User Info").getRow(0).createCell(1).setCellValue("123");
		
		w.getSheet("User Info").createRow(1).createCell(0).setCellValue("Ranjith");
		
		w.getSheet("User Info").getRow(1).createCell(1).setCellValue("456");
		
		w.getSheet("User Info").createRow(2).createCell(0).setCellValue("Saravanan");
		
		w.getSheet("User Info").getRow(2).createCell(1).setCellValue("789");
		
		w.getSheet("User Info").createRow(3).createCell(0).setCellValue("Javid");
		
		w.getSheet("User Info").getRow(3).createCell(1).setCellValue("367");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_Data();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
