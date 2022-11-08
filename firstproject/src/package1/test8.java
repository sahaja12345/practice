package package1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test6 {

	public test6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Take browser name from keyboard
		Scanner sc= new Scanner(System.in);//object creation
		System.out.println("Enter a Browser Name");
		String bn=sc.nextLine();
		//cross browser selection
	    RemoteWebDriver driver=null;//object declared
	    if(bn.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\SAHAJA\\BATCH251\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
	    }
	    else if(bn.equalsIgnoreCase("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver","C:\\SAHAJA\\BATCH251\\geckodriver.exe");
			 driver=new FirefoxDriver();
	    }
	    else if(bn.equalsIgnoreCase("Opera"))
	    {
	    	System.setProperty("webdriver.opera.driver","C:\\SAHAJA\\BATCH251\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
	    }
	    else if(bn.equalsIgnoreCase("edge"))
	    {
	    	System.setProperty("webdriver.edge.driver","C:\\SAHAJA\\BATCH251\\edgedriver_win64\\msedgedriver.exe");
		     driver=new EdgeDriver();
	    }
	    else if(bn.equalsIgnoreCase("ie"))
	    {
	    	System.setProperty("webdriver.ie.driver","C:\\SAHAJA\\BATCH251\\IEDriverServer_x64_3.150.1\\iedriverserver.exe");
			 driver=new InternetExplorerDriver();
	    }
	    else
	    {
	    System.out.println("Wrong browser name");
	    System.exit(0);//stop execution forcibly
	    }
        //common code
	    //launch site
	    driver.get("http://www.facebook.com");
	}

}
