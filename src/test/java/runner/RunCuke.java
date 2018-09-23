package runner;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.pt.E;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@CucumberOptions(
        plugin = {"json:target/RunCuke/cucumber.json","pretty","html:target/RunCuke/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/resources/features/",
        glue = "steps"
        )
public class RunCuke extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp(){
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
        Date curDate = new Date();
        String strDate = sdf.format(curDate);
        String fileName = System.getProperty("user.dir") + "\\target\\Extent_Report\\" + strDate + ".html";
        File newFile = new File(fileName);
        ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
        //static report name
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        // Loads the extent config xml to customize on the report
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        //User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name","Chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version","69.0.3497.100");
        ExtentCucumberFormatter.addSystemInfo("Selenium version","3.14");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);

    }

}
