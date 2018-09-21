package Screen;

import helper.AppiumDriverHelper;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {
    public BaseScreen(){
        PageFactory.initElements( new AppiumFieldDecorator(AppiumDriverHelper.getDriver() ), this );
    }
}
