package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.domain.product.Picture;
import com.jmdev.storycrm.domain.product.Product;
import com.jmdev.storycrm.domain.product.Video;
import com.jmdev.storycrm.testDomainItems.manufacturer.ManufacturerTestItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductTestItem {

    public static Product buildTestItem(){

        List<Picture> testPictureGallery = new ArrayList<>();
        testPictureGallery.add(PictureTestItem.buildTestItemNo2());
        testPictureGallery.add(PictureTestItem.buildTestItemNo3());
        testPictureGallery.add(PictureTestItem.buildTestItemNo4());

        List<Product> relatedProductsTestItems = new ArrayList<>();

        List<Video> videoTestGallery = new ArrayList<>();
        videoTestGallery.add(VideoTestItem.buildTestItemNo2());
        videoTestGallery.add(VideoTestItem.buildTestItemNo3());
        videoTestGallery.add(VideoTestItem.buildTestItemNo4());

        Product testItem = new Product();
        testItem.setId(1L);
        testItem.setName("SP60");
        testItem.setManufacturer(ManufacturerTestItem.buildTestItem());
        testItem.setProductType(ProductTypeTestItem.buildTestItem());
        testItem.setProductDestination(ProductDestinationTestItem.buildTestItem());
        testItem.setProductMainCategory(ProductMainCategoryTestItem.buildTestItem());
        testItem.setProductSubCategory(ProductSubCategoryTestItem.buildTestItem());
        testItem.setRelatedProducts(relatedProductsTestItems);
        testItem.setMainPicture(PictureTestItem.buildTestItemNo1());
        testItem.setProductGallery(testPictureGallery);
        testItem.setMainVideo(VideoTestItem.buildTestItemNo1());
        testItem.setVideoList(videoTestGallery);
        testItem.setNetPrice(BigDecimal.valueOf(29900.00));
        testItem.setShowPrice(false);
        return testItem;
    }

}
