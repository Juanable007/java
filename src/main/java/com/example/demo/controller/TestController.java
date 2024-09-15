package com.example.demo.controller;


import com.example.demo.entity.User;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {


    @GetMapping("/hello")
    public  void  test(){

       /*
       1. boolean empty = list.isEmpty();
        list.isEmpty() 是 Java 中集合类的一个方法，用于判断集合是否为空。
        由于 list 被初始化为一个新的 ArrayList，此时 list 是一个空列表，虽然没有元素，但它不为 null。因此：
        empty 的值为 true，因为 list 此时确实是空的，没有任何元素。
        2. boolean b = list == null;
        list == null 用来检查 list 是否为 null。
        由于你已经使用 new ArrayList<>() 初始化了 list，它已经指向了一个有效的对象。因此：
        b 的值为 false，因为 list 不为 null。
        */
        User user = new User();
        List<User> list = new ArrayList<>();
        boolean empty = list.isEmpty();
        boolean b = list == null;

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
