package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import helper.AppiumDriverHelper;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @After
    public void after(){
        System.out.print("passei por aqui");
        gerarScreenShot();
    }


    public void gerarScreenShot(){
        File imagem = ((TakesScreenshot) AppiumDriverHelper.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imagem, new File("screenShots/imagem.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
