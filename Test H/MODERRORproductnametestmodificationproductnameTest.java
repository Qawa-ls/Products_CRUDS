// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class MODERRORproductnametestmodificationproductnameTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void mODERRORproductnametestmodificationproductname() {
    driver.get("https://mohamedmamdouh1999.github.io/Products_CRUDS/");
    driver.manage().window().setSize(new Dimension(1094, 1030));
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("Test 3");
    driver.findElement(By.id("inputPrice")).click();
    driver.findElement(By.id("inputPrice")).sendKeys("100");
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .me-2")).click();
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("Test 3 +");
    driver.findElement(By.id("btnAdd")).click();
    assertThat(driver.findElement(By.id("alertName")).getText(), is("This Name Is Not Valid\\\\nExample: Mi 9T"));
  }
}
