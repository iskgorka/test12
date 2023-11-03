import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        String searchFieldXpath = "//textarea[@id='APjFqb']";

        WebElement searchElement = driver.findElement(By.xpath(searchFieldXpath));
        searchElement.sendKeys("Google");
        searchElement.submit();

        driver.close();
    }
}
/*
//textarea[@id='APjFqb']

//input[@name='btnK'] - находит 2 элемента

//div[@class='FPdoLc lJ9FBc']//input[@name='btnK'] - находит уже 1 элемент

//div[@class='FPdoLc lJ9FBc']//input[@value='Мне повезёт!'] - 1 елемент
*/