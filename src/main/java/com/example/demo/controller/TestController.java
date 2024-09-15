package com.example.demo.controller;


import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController("/test")
public class TestController {


    @RequestMapping("test")
    public  void  test(){


        System.out.println(System.currentTimeMillis());

    }

    public static void parseExcel(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            if (row.getRowNum() == 0) { // Skip header row
                continue;
            }

            Cell miIdCell = row.getCell(0);
            Cell oaIdCell = row.getCell(1);
            System.out.println(miIdCell);

        }

    }


    @Test

    public void test1() throws IOException {

        parseExcel("/Users/ablejuan/Downloads/code/demo/src/main/resources/用户数据测试版.xlsx");
    }
}
