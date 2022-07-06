package steps;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jobsearchsteps {

    public  static WebDriver driver;
    //WebDriverManager.chromedriver().setup();

    @Before
    static void setupClass() {



    }
    @After
    public void tearDown()
    {
        driver.close();
    }

    @Given("user launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        System.out.println("job search---user launch chrome browser");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Given("user open url as {string}")
    public void user_open_url_as(String url) throws InterruptedException {
        System.out.println("job search---user open open url:  "+url);

        //WebDriverManager.chromedriver().setup();
        //driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(5000);
        //driver.close();

    }

}
