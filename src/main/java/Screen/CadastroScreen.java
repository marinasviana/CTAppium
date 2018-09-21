package Screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class CadastroScreen extends BaseScreen {

    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    @AndroidFindBy(className = "android.widget.TextView")
    public MobileElement btnFormulario;

    public void tocarEmFOrmulario() {
        btnFormulario.click();
    }
}
