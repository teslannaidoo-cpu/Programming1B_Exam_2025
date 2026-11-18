package com.teslan.question1practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    // Test 1: Check total sales
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales product = new ProductSales();

        assertEquals(2200, product.TotalSales(sales));
    }

    // Test 2: Check average sales
    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales product = new ProductSales();

        assertEquals(366.67, product.AverageSales(sales), 0.01);
    }
}