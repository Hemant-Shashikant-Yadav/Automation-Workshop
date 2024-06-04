package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public Base() {
        try {
            prop = new Properties();
            FileInputStream fs = new FileInputStream("E:\\Coding\\Automation\\DemoTest1\\src\\test\\resources\\config.properties");
            prop.load(fs);
        } catch (Exception e) {

        }
    }

        public static void initialize() throws InterruptedException {
            String browser = prop.getProperty("browser");
            if(browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/"+"chromedriver.exe");
                driver = new ChromeDriver();
            } else if(browser.equals("firefox")){

            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.get(prop.getProperty("appURL"));

            Thread.sleep(5000);
        }

        public void closeDriver(){
        if(driver!=null){
            driver.quit();
        }
        }
}
