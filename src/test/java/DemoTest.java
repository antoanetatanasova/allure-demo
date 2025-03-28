import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;

//@Listeners({AllureTestNg.class})
public class DemoTest {

    @Test
    @Description("A dummy test to demonstrate the allure report.")
    @Severity(CRITICAL)
    @Owner("AA")
    public void demoTest() {
        Assert.assertTrue(true);
    }
}
