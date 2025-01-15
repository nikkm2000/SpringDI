package com.example.springDI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Sample {

    public static void main(String[] args) {
        int[] b = {-5, 6, 8, -1, 13, 11, 2, -4};
        int k = 3;
        firstNegative4(b, k);
    }
    public static void firstNegative4(int[] a, int k) {
        int j = 0, i = 0;
        List<Integer> al = new ArrayList<>();
        List<Integer> alWindow = new ArrayList<>();
        while(j<a.length){
            alWindow.add(a[j]);
            if(a[j]<0){
                al.add(a[j]);
            }
            j++;
            if(j-i==k){
                System.out.println(al.get(0));

                alWindow.remove(0);
                if(alWindow.get(i)<0){
                    al.remove(0);
                }
                i++;
            }
        }



    }

    //bruteforce
    public static void firstNegative3(int[] a, int k) {
        for (int i = 0; i <= a.length - k; i++) {
            int count = 0;
            for (int j = i; j < i + k; j++) {
                if (a[j] < 0) {
                    System.out.println(a[j]);
                    break;
                }
                count++;
            }
            if (count == k) {
                System.out.println(0);
            }
        }
    }


    public static void maxSubArray3(int[] a, int k) {
        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (j < a.length) {
            sum = sum + a[j];
            j++;
            if (j - i == k) {
                max = Math.max(max, sum);
                sum = sum - a[i];
                i++;
            }
        }
        System.out.println(max);
    }


    public static void firstNegativeInWindow(int[] a, int k) {
        for (int j = 0; j <= a.length - k; j++) {
            int count = 0;
            for (int i = j; i < j + k; i++) {
                if (a[i] < 0) {
                    System.out.println(a[i]);
                    break;
                }
                count++;
            }
            if (count == 3) {
                System.out.println(0);
            }

        }
    }

    public static void maxSubArray(int[] b) {
//        int[] b={5,6,8,1,13,11,2};
        int k = 3;
        int s = 0;
        int max = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < i + k; i++) {
                s = s + b[j];
            }
            if (max < s) {
                max = s;
            }
        }
        System.out.println(max);
    }

    private static void m1() {
//        FileInputStream fis=null;
        Workbook xlsWorkbook = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\SG0701505\\OneDrive - Sabre\\SabreLoyalty\\Cucumber_OneDrive\\Automation Failures.xlsx");
            xlsWorkbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet xlsSheet = xlsWorkbook.getSheet("article");
        int lastRowNum = xlsSheet.getLastRowNum();
        int secondLastRowNum = lastRowNum - 1;
        Row secondLastRow = xlsSheet.getRow(secondLastRowNum);
        for (Cell myCell : secondLastRow) {
            switch (myCell.getCellType()) {
                case STRING:
                    System.out.println(myCell.getStringCellValue());
                    break;
                case NUMERIC:
                    System.out.println(myCell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    System.out.println(myCell.getBooleanCellValue());
                    break;
            }
        }
    }


    abstract void m2();

}
