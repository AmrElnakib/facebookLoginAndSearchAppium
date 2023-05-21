import io.appium.java_client.android.AndroidBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest {
    // Add the setup() and tearDown() methods here

    @Test
    public void testLogin() {
        // Click the "Continue as [Name]" button on the welcome screen
        AndroidElement continueButton = driver.findElement(AndroidBy.id("u_0_4"));
        continueButton.click();

        // Enter the emailand password and click the login button
        AndroidElement emailField = driver.findElement(AndroidBy.id("m_login_email"));
        emailField.sendKeys("your_email_address");
        AndroidElement passwordField = driver.findElement(AndroidBy.id("m_login_password"));
        passwordField.sendKeys("your_password");
        AndroidElement loginButton = driver.findElement(AndroidBy.id("u_0_b"));
        loginButton.click();

        // Wait for the login to complete and verify that the News Feed screen is
        // displayed
        AndroidElement newsFeed = driver.findElement(AndroidBy.id("news_feed_tab"));
        Assert.assertTrue(newsFeed.isDisplayed());
    }

    @Test
    public void testSearch() {
        // Click the search button and enter a search query
        AndroidElement searchButton = driver.findElement(AndroidBy.id("search_button"));
        searchButton.click();
        AndroidElement searchBox = driver.findElement(AndroidBy.id("search_edit_text"));
        searchBox.sendKeys("Facebook for Android");
        driver.pressKeyCode(AndroidKeyCode.ENTER);

        // Verify that the search results are displayed
        AndroidElement searchResults = driver.findElement(AndroidBy.id("search_results"));
        Assert.assertTrue(searchResults.isDisplayed());
    }

    @Test
    public void testPost() {
        // Click the "What's on your mind?" box and enter a post
        AndroidElement postBox = driver.findElement(AndroidBy.id("feed_composer_placeholder_text_view"));
        postBox.click();
        AndroidElement postField = driver.findElement(AndroidBy.id("status_text_area"));
        postField.sendKeys("This is a test post from Appium!");
        AndroidElement postButton = driver.findElement(AndroidBy.id("fb_composer_publish_btn"));
        postButton.click();

        // Wait for the post to be published and verify that it's displayed on the News
        // Feed screen
        AndroidElement newsFeedTab = driver.findElement(AndroidBy.id("news_feed_tab"));
        newsFeedTab.click();
        AndroidElement postText = driver.findElement(
                AndroidBy.xpath("//android.widget.TextView[contains(@text, 'This is a test post from Appium!')]"));
        Assert.assertTrue(postText.isDisplayed());
    }
}