package Tasks;

import java.sql.Driver;

public class Task4 {
    /*    Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
    ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them    */

    public static void main(String[] args) {
        ChromeDriver d1=new ChromeDriver();
        d1.open();
        d1.close();
        System.out.println(d1.getTitle());
        d1.getScreenshot();
        d1.navigate();

        FireFoxDriver d2=new FireFoxDriver();
        d2.open();
        d2.close();
        System.out.println(d2.getTitle());
        d2.getScreenshot();
        d2.navigate();

        SafariDriver d3=new SafariDriver();
        d3.open();
        d3.close();
        System.out.println(d3.getTitle());
        d3.getScreenshot();
        d3.navigate();


        /*WebDriver[] webdrivers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(WebDriver webdriver:webdrivers){
            webdriver.open();
            webdriver.close();
            webdriver.getTitle();
            System.out.println(webdriver.getTitle());
            webdriver.getScreenshot();
            webdriver.navigate();
        }                                    --> in such way methods from TakesScreenshot and RemoteWebDridver are not visible ...*/
    }
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open the Chrome driver");
    }

    @Override
    public void close() {
        System.out.println("Close the Chrome driver");
    }

    @Override
    public String getTitle() {
        String title="Google";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Make a screenshot of the Chrome tab");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to remote Chrome driver");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open the FireFox driver");
    }

    @Override
    public void close() {
        System.out.println("Close the FireFox driver");
    }

    @Override
    public String getTitle() {
        String title="FireFox";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Make a screenshot of the FireFox tab");
    }


    @Override
    public void navigate() {
        System.out.println("Navigate to remote FireFox driver");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open the Safari driver");
    }
    @Override
    public void close() {
        System.out.println("Close the Safari driver");
    }
    @Override
    public String getTitle() {
        String title="Safari";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Make a screenshot of the Safari tab");
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to remote Safari driver");
    }
}