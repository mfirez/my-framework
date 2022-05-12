package com.saucedemo.tests.day1;

import com.saucedemo.page.ProductsPage;
import com.saucedemo.tests.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductSortTest extends TestBase {

    @Test
    public void sortListTest()  {

        ProductsPage productsPage =  new ProductsPage();

        productsPage.login();

        String actualPageTittle = productsPage.productPageTittle.getText();
        String expectedPageTittle = "PRODUCTS";

        Assert.assertEquals(actualPageTittle,expectedPageTittle,"verify that Product Page");

        Select dropDownList = new Select(productsPage.selectDropDown);


        List<WebElement> sortList = dropDownList.getOptions();

        for (WebElement sort : sortList) {

            System.out.println("sort = " + sort.getText());

            Assert.assertTrue(sort.isDisplayed());

        }

        productsPage.sort("Price (low to high)");

        String actualSort = dropDownList.getFirstSelectedOption().getText();

        String expectedSort = "Price (low to high)";

        Assert.assertEquals(actualSort,expectedSort,"verify that sort list");


    }

}
