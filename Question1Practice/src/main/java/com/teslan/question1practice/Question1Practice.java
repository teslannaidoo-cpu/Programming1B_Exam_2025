package com.teslan.question1practice;

public class Question1Practice {

    public static void main(String[] args) {

        // Product sales for 2 years and 3 quarters
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales product = new ProductSales();

        // Display sales data
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------");

        System.out.println("          Q1    Q2    Q3");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("Year %d   ", i + 1);

            for (int sale : sales[i]) {
                System.out.printf("%5d ", sale);
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        // Display calculated results
        System.out.println("Total sales: " + product.TotalSales(sales));
        System.out.printf("Average sales: %.0f%n", product.AverageSales(sales));
        System.out.println("Maximum sale: " + product.MaxSale(sales));
        System.out.println("Minimum sale: " + product.MinSale(sales));
    }
}