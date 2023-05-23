package pages.blogPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class BlogPage {
    public static final By CATEGORIES_NAME = By.xpath
            ("//div[@class='sc-bdfBQB buqMpI']/span/div | //div[@class='sc-hTZgZg lkFCcB']/span/div");

    public BlogPage clickBlogSelectCategory(String categoryName) {
        SelenideElement category = $$(CATEGORIES_NAME).findBy(Condition.text(categoryName));
        category.click();
        return this;
    }

    public BlogPage clickBlogCategory(String categoryName) {
        SelenideElement category = $$(CATEGORIES_NAME).findBy(Condition.text(categoryName));
        category.click();
        return this;
    }
}