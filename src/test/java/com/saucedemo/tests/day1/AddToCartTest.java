package com.saucedemo.tests.day1;

import com.saucedemo.page.ProductsPage;
import com.saucedemo.tests.TestBase;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCartTest() {

        ProductsPage productsPage = new ProductsPage();
        productsPage.login();
        productsPage.randomAddToCart();


    }





}
