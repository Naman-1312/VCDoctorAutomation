package StepDefination;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.network.Network;
//import org.openqa.selenium.devtools.v114.network.model.BlockedReason;

import java.util.Optional;


public class ChatBotHandle {

	 public static void main(String[] args) {
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        ChromeDriver driver = new ChromeDriver(options);
	        DevTools devTools = driver.getDevTools();
	        devTools.createSession();
	        devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
	        devTools.send(Network.setBlockedURLs(java.util.List.of(
	            "https://embed.tawk.to/5dce6ff6d96992700fc7925c/default",
	            "https://tools.luckyorange.com/core/lo.js?site-id=f07cc5b8"
	        )));
	        
	        // Open the website URL
	        driver.get("https://qa.vcdoctor.com/Account/Login");
	        driver.manage().window().maximize();
	        
	    }
	}
	




    
