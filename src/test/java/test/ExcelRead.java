package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception {

        File file = new File("src/SampleData.xlsx");

        System.out.println(file.exists());

        //loads our file to java memory so that we can read and write
        FileInputStream fileInputStream = new FileInputStream(file);
        //Workbook --> Sheet --> Rows --> Cells

        //Loading the workbook to our class

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //Pass the sheet name

        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println(sheet.getRow(2).getCell(1));

        int usedRows = sheet.getPhysicalNumberOfRows();
        int lastUsedRow = sheet.getLastRowNum();

        System.out.println(usedRows);
        System.out.println(lastUsedRow);

        for (int i = 0; i < usedRows; i++) {
            for (int j = 0; j < 2; j++){
                if (sheet.getRow(i).getCell(j).toString().equals("Neena")) {
                    System.out.println(sheet.getRow(i).getCell(j));
                }
        }
    }
        for (int i = 0; i < usedRows; i++){
            if(sheet.getRow(i).getCell(0).toString().equals("Adam")){
                System.out.println("JOB_ID of Adam: " + sheet.getRow(i).getCell(2));
            }
        }


    }
}

