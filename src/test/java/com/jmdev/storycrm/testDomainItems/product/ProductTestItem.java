package com.jmdev.storycrm.testDomainItems.product;

import com.jmdev.storycrm.testDomainItems.manufacturer.ManufacturerTestItem;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductTestItem {

    private Long id;
    private String name;
    private ManufacturerTestItem manufacturerTestItem;
    private ProductTypeTestItem productTypeTestItem;
    private ProductDestinationTestItem productDestinationTestItemn;
    private ProductMainCategoryTestItem productMainCategoryTestItem;
    private ProductSubCategoryTestItem productSubCategoryTestItem;
    private List<ProductTestItem> relatedProductTestItems;
    private PictureTestItem mainPictureTestItem;
    private List<PictureTestItem> productGalleryTestItems;
    private VideoTestItem mainVideoTestItem;
    private List<VideoTestItem> videoTestItemList;
    private BigDecimal netPrice;
    private Boolean showPrice;

    public ProductTestItem(){

    }

    public static ProductTestItem buildTestItem(){

        List<PictureTestItem> testPictureGallery = new ArrayList<>();
        testPictureGallery.add(PictureTestItem.buildTestItemNo2());
        testPictureGallery.add(PictureTestItem.buildTestItemNo3());
        testPictureGallery.add(PictureTestItem.buildTestItemNo4());

        List<ProductTestItem> relatedProductsTestItems = new ArrayList<>();

        List<VideoTestItem> videoTestGallery = new ArrayList<>();
        videoTestGallery.add(VideoTestItem.buildTestItemNo2());
        videoTestGallery.add(VideoTestItem.buildTestItemNo3());
        videoTestGallery.add(VideoTestItem.buildTestItemNo4());

        ProductTestItem testItem = new ProductTestItem();
        testItem.setId(1L);
        testItem.setName("SP60");
        testItem.setManufacturerTestItem(ManufacturerTestItem.buildTestItem());
        testItem.setProductTypeTestItem(ProductTypeTestItem.buildTestItem());
        testItem.setProductDestinationTestItemn(ProductDestinationTestItem.buildTestItem());
        testItem.setProductMainCategoryTestItem(ProductMainCategoryTestItem.buildTestItem());
        testItem.setProductSubCategoryTestItem(ProductSubCategoryTestItem.buildTestItem());
        testItem.setRelatedProductTestItems(relatedProductsTestItems);
        testItem.setMainPictureTestItem(PictureTestItem.buildTestItemNo1());
        testItem.setProductGalleryTestItems(testPictureGallery);
        testItem.setMainVideoTestItem(VideoTestItem.buildTestItemNo1());
        testItem.setVideoTestItemList(videoTestGallery);
        testItem.setNetPrice(BigDecimal.valueOf(29900.00));
        testItem.setShowPrice(false);
        return testItem;
    }

}
