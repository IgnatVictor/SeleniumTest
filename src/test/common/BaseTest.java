package common;

import common.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



import java.time.Duration;

public abstract class BaseTest  {


    private MainPage mainPage;
    protected WebDriver driver;
    private final String url = "https://accounts.google.com/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
