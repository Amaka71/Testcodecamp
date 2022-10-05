import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class SeleniumWebSignupTest {


    //Import the selenium WebDriver
    private WebDriver driver;


    @BeforeTest
    public void start() throws InterruptedException {
        //locate where the geckodriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

    driver = new ChromeDriver();

        //1 Open your chrome browser
        driver = new ChromeDriver();

        //2.Input your Selenium DemoPage URL (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com");
        //Test 1. Verify user is directed to landing page
        if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com/"))
        //Pass
            System.out.println("Correct Landing Page");
        else
            //Fail
            System.out.println("Wrong Landing Page");


        //3.Maximize the browser
        driver.manage().window().maximize();

        //4. Click on SignUp button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(3000);
         }


         @Test (priority = 0)
        public void PositiveTest() throws InterruptedException {
        //Test 2. Verify user can sign up with valid details
        //5. Locate the username field and input your username.
        driver.findElement(By.id("user_username")).sendKeys("rose58");
        Thread.sleep(5000);

        //6. Locate the email address field and Input your email address
        driver.findElement(By.id("user_email")).sendKeys("rossey5@malinator.com");
        Thread.sleep(5000);

        //7. Locate the password field and Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("shudh");
        Thread.sleep(5000);

        //8. Click on the SignUp button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(20000);
         }

         @Test (priority = 1)
        public void ClickUser1() throws InterruptedException {
        //Test 3. Verify user is redirected to User1 page and user1 item is clickable or present
            //9.Click on user1 item on the list page
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
             if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com/users/1"))
                 //Pass
                 System.out.println("Correct User1 Page");
             else //Fail
                 System.out.println("Wrong user1 Page");
            Thread.sleep(10000);
        }

        @Test (priority = 2)
        public void Learnxpath() throws InterruptedException {
        //test 4. Verify user is redirected to learnxpath page
            //10. Click on learnxpath
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]")).click();
            if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com/articles/59"))
                //Pass
                System.out.println("Correct learnxpath Page");
            else //Fail
                System.out.println("Wrong learnxpath Page");
            Thread.sleep(10000);
        }

        @Test (priority = 3)
       public void Logout() throws InterruptedException {
       //Test 5. Verify user is logged out and redirected to landing page
        //11. Logout
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
            if(driver.getCurrentUrl().contains("https://selenium-blog.herokuapp.com"))
                //Pass
                System.out.println("Correct landing Page");
            else //Fail
                System.out.println("Wrong landing Page");

        Thread.sleep(10000);
        }

    @Test (priority = 4)
        public void NegativeTest1() throws InterruptedException {
        //Test 6. Verify user cannot sign up with blank field
        // Click on SignUp button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(3000);

    //5. Locate the username field and input your username.
        driver.findElement(By.id("user_username")).sendKeys("");
        Thread.sleep(5000);

        //6. Locate the email address field and Input your email address
        driver.findElement(By.id("user_email")).sendKeys("");
        Thread.sleep(5000);


    //7. Locate the password field and Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("");
        Thread.sleep(5000);

        //8. Click on the SignUp button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(20000);
    }
  @Test (priority = 5)
    public void NegativeTest2() throws InterruptedException {
        //Test 7. Verify user cannot sign up with invalid email

      driver.get("https://selenium-blog.herokuapp.com/signup");

        //5. Locate the username field and input your username.
        driver.findElement(By.id("user_username")).sendKeys("sushi");
        Thread.sleep(5000);

        //6. Locate the email address field and Input your email address
        driver.findElement(By.id("user_email")).sendKeys("sldweu@dede");
        Thread.sleep(5000);


        //7. Locate the password field and Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("aswld");
        Thread.sleep(5000);

        //8. Click on the SignUp button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(20000);
    }

    @Test (priority = 6)
    public void NegativeTest3() throws InterruptedException {
        //Test 8. Verify user cannot log in with password less than or equal to one character

        //5. Locate the username field and input your username.
        driver.findElement(By.id("user_username")).sendKeys("sushii");
        Thread.sleep(5000);

        //6. Locate the email address field and Input your email address
        driver.findElement(By.id("user_email")).sendKeys("sldweuu@dede.com");
        Thread.sleep(5000);

        //7. Locate the password field and Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("a");
        Thread.sleep(5000);

        //8. Click on the SignUp button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(20000);
    }

        @AfterTest
    public void CloseBrowser() {
        driver.quit();
    }

}























































