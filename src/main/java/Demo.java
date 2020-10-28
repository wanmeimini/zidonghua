import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File file = new File("C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");

        String title = driver.getTitle();
        System.out.printf(title);
//        driver.close();
    }
}