package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidApp {

    private  AndroidDriver androidDriver;
    AppiumDriverLocalService service;
    DesiredCapabilities capabilities;

    public  AndroidDriver getAndroidDriver(){

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        capabilities = new DesiredCapabilities().chrome();

        //capabilities.setCapability("appPackage", "com.kehe.delivery.qa");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_API_28");
        capabilities.setCapability("avd", "Pixel_API_28");
        //capabilities.setCapability(MobileCapabilityType.APP, "TBD");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
        capabilities.setCapability("chromedriverExecutable",
                "/Users/azamatkulov/chicago11cucumberjunit/src/test/java/drivers/chromedriver");
        // automatically grants permissions
        capabilities.setCapability("autoGrantPermissions", true);
        // automatically accepts all the notifications
        capabilities.setCapability("autoAcceptAlerts", true);
        // wait for server
        capabilities.setCapability("newCommandTimeout", 60000);

        try{
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch(MalformedURLException e){
            e.printStackTrace();

        }

    return androidDriver;
    }


}
