/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver


// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
driver = { new FirefoxDriver() }

baseNavigatorWaiting = true

environments{
	localHost{
		// Base URL for the localhost environment
		baseUrl = "http://localhost"

		// product urls based on baseUrl
		bcUrl = "${baseUrl}:8580/bc/BillingCenter.do"
		//pcUrl = "${baseUrl}:8180/pc/PolicyCenter.do"

		// uncomment one of the following if a different driver is required
		//driver = { new ChromeDriver() }
		//driver = { new PhantomJSDriver() }
	}
	testEnv1{
		// test environments
	}
}

// ---- following configuration is from the original project ------------//
// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
//driver = { new FirefoxDriver() }
//environments {
//
//	// run as “gradle -Dgeb.env=chrome cucumber”
//	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
//	chrome {
//		driver = { new ChromeDriver() }
//	}
//
//	// run as “gradle -Dgeb.env=phantomjs cucumber”
//	// See: https://github.com/detro/ghostdriver
//	phantomjs {
//		driver = { new PhantomJSDriver() }
//	}
//
//}
//
//baseUrl = "http://gebish.org"
//
//baseNavigatorWaiting = true