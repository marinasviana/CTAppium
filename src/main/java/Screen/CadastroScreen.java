package Screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.By;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CadastroScreen extends BaseScreen {

    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    @AndroidFindBys(@AndroidFindBy(xpath = "//android.widget.TextView "))
    public List<MobileElement> btnFormulario;


    //    @AndroidFindBy(xpath = "//android.widget.TextView[2]")
    public void tocarEmFOrmulario() {
        btnFormulario.get(1).click();
    }
}
