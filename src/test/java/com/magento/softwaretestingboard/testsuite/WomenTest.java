package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.HomePage;
import com.magento.softwaretestingboard.pages.ProductPage;
import com.magento.softwaretestingboard.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyTheSortByProductNameFilter()  {
        //* Mouse Hover on Women Menu
      homePage.mouseHoverOnWomenTab();
        //* Mouse Hover on Tops
      homePage.mouseHoverOnTopsInWomenTab();
        //* Click on Jackets
      homePage.mouseHoverAndClickOnJacketsInWomen();
        //* Select Sort By filter “Product Name”
        //* Verify the products name display in alphabetical order
      productPage.verifySortingOfProductsInAscendingOrder("Product Name");
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //  Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenTab();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTopsInWomenTab();
        //* Click on Jackets
        homePage.mouseHoverAndClickOnJacketsInWomen();
        //  Select Sort By filter “Price”
        //* Verify the products price display in Low to High
        productPage.verifySortingOfPriceInAscendingOrder("Price");
    }
}
