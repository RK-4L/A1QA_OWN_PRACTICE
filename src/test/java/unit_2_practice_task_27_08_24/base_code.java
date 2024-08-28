package unit_2_practice_task_27_08_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_code {
    protected static final String URL = "https://google.com/";
	protected static final int MAX_WAIT = 10;
	protected static final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
	protected static final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
	protected static final String FILE_LOCATION = "src/resources/";
	protected WebDriver driver;
	protected WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
        driver.get(URL);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

