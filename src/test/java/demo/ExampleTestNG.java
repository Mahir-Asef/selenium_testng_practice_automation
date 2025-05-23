package demo;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class ExampleTestNG {

    @Test(priority = 0)
    public void testCase2() {
        System.out.println("This is the A Normal Test Case 2");
    }
    @Test(priority = 1)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case 1");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }

    @Test(priority = 3)
    public void testAssertion() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(1, 1);
        System.out.println("Pass value");
        softAssert.assertEquals("ab", "ba");
        System.out.println("Pass text");
        softAssert.assertEquals("red", "black");
        System.out.println("Pass color");
        softAssert.assertTrue(true);
        System.out.println("Displayed");
        softAssert.assertFalse(false);
        System.out.println("Not invisible");
        softAssert.assertAll();
    }
}