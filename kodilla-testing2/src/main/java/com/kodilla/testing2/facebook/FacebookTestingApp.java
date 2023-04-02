package com.kodilla.testing2.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6luv\")]/form/div[5]/a";
    public static final String XPATH_NAME = "//div[contains(@class,\"_5dbb\")]/input";
    public static final String XPATH_LASTNAME = "//div[contains(@class,\"_5dbb\")]/div/input";
    public static final String XPATH_EMAIL = "//input[contains(@name, \"reg_email__\")]";
    public static final String XPATH_EMAIL_CONFIRMATION = "//input[contains(@name, \"reg_email_confirmation__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name, \"reg_passwd__\")]";
    public static final String XPATH_BIRTH_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_BIRTH_MONTH = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_BIRTH_YEAR = "//select[contains(@name, \"birthday_year\")]";
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        TimeUnit.SECONDS.sleep(1);

        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Wieslaw");

        WebElement nameField2 = driver.findElement(By.xpath(XPATH_LASTNAME));
        nameField2.sendKeys("Wieslawski");

        WebElement nameField3 = driver.findElement(By.xpath(XPATH_EMAIL));
        nameField3.sendKeys("Wiesio@gmail.com");

        TimeUnit.SECONDS.sleep(1);

        WebElement nameField4 = driver.findElement(By.xpath(XPATH_EMAIL_CONFIRMATION));
        nameField4.sendKeys("Wiesio@gmail.com");

        WebElement nameField5 = driver.findElement(By.xpath(XPATH_PASSWORD));
        nameField5.sendKeys("Wiesiooo");

        WebElement selectField1 = driver.findElement(By.xpath(XPATH_BIRTH_DAY));
        Select selectDay = new Select(selectField1);
        selectDay.selectByValue("22");

        WebElement selectField2 = driver.findElement(By.xpath(XPATH_BIRTH_MONTH));
        Select selectMonth = new Select(selectField2);
        selectMonth.selectByVisibleText("lip");

        WebElement selectField3 = driver.findElement(By.xpath(XPATH_BIRTH_YEAR));
        Select selectYear = new Select(selectField3);
        selectYear.selectByVisibleText("1993");
    }
}