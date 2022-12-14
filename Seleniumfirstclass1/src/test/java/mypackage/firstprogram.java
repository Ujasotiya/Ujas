package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromebrowser.driver", "./chromedriver");
		WebDriver d = new ChromeDriver();
//		String A = d.getTitle();
//		System.out.println(A);
//		String url = d.getCurrentUrl();
//		System.out.println(url);
//		String html = d.getPageSource();
//		System.out.println(html);
		d.get("https://demoqa.com/text-box");
		boolean b = d.findElement(By.id("userName")).isEnabled();
		System.out.println(b);
//      d.findElement(By.id("twotabsearchtextbox")).click();
//		d.findElement(By.name("password")).sendKeys("secret_sauce");
//		d.findElement(By.name("login-button")).click();
//		d.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//		d.findElement(By.className("shopping_cart_link")).click();
//		d.findElement(By.cssSelector("button#checkout")).click();
//		d.findElement(By.id("first-name")).sendKeys("Ujas");
//		String s = d.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();
//		System.out.println(s);
//		d.findElement(By.id("last-name")).sendKeys("Otiya");
//		d.findElement(By.id("postal-code")).sendKeys("L8N1V2");
//		d.findElement(By.tagName("title")).click();

	}

}
