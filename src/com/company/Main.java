package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so dong cua ma tran: ");
        m=scanner.nextInt();
        System.out.println("nhap vao so cot cua ma tran: ");
        n=scanner.nextInt();
        int Array[][]=new int[m][n];

        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Array["+i+"]["+j+"]=");
                Array[i][j]=scanner.nextInt();
            }
        }
        int Max=Array[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (Max<Array[i][j]){
                    Max=Array[i][j];
                }
            }

        }
        System.out.println("phan tu lon nhat trong ma tram = "+Max);
    }

}
