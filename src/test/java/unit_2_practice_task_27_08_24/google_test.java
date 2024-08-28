package unit_2_practice_task_27_08_24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class google_test extends base_code {
    //Paths
    private final By search_path = By.xpath("//textarea[@id]");
    private final By path_ilovePDF =By.xpath("//*[contains(@href,'https://www.ilovepdf.com/es')]/h3[contains(text(), 'Convierte tus PDF a WORD editable')]");
    private final By path_uploadPDF = By.xpath("//*[@id='pickfiles']");
    private final By upload_button = By.xpath("//button[@id='processTask']");

    //Strings
    private final String search_youtube = "youtube";
    private final String search_convertPDF ="convertidor pdf";
    private final String PDF_name = "PDF.pdf";
    private final String PDF_path = FILE_LOCATION+PDF_name;


@Test
public void googlesearch(){
    WebElement search_bar = driver.findElement(search_path);
    search_bar.sendKeys(search_youtube);
    search_bar.sendKeys(Keys.ENTER);
    driver.navigate().back();
    search_bar.sendKeys(search_convertPDF);
    search_bar.sendKeys(Keys.ENTER);
    driver.findElement(path_ilovePDF).click();
    File fileToUpload = new File(PDF_path);
    driver.findElement(path_uploadPDF).sendKeys(fileToUpload.getAbsolutePath());
    driver.findElement(upload_button).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }
}
