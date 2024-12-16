package com.go1percent.util;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestUtil {
    public static Object[][] getExcelData(String excelFilePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        DataFormatter formatter = new DataFormatter();

        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];
        for (int i = 1; i <= rowCount; i++) { // Start from 1 to skip header row
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = formatter.formatCellValue(row.getCell(j));
            }
        }
        workbook.close();
        return data;
    }
}
