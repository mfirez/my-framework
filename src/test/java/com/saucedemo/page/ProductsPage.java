package com.saucedemo.page;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class ProductsPage extends LoginPage{


    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productPageTittle;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement selectDropDown;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement addToCartSauceLabsBackPack;

    public void sort(String sort){

        Select select = new Select(selectDropDown);

        select.selectByVisibleText(sort);

    }

    public void randomAddToCart(){
        Random random = new Random();
        int randomProduct = random.nextInt(6)+1;

        WebElement randomAdd = Driver.get().findElement(By.xpath("(//button[text()='Add to cart'])["+randomProduct+"]"));
        randomAdd.click();

    }



}
