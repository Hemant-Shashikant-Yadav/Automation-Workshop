package tests;

import pageobjects.PracticeForm;
import common.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.PracticeForm;

import java.awt.*;

public class Forms_Test extends Base {

    PracticeForm forms;

    @BeforeTest
    public void setup() throws InterruptedException {
        initialize();
        forms = new PracticeForm();
    }

    @Test
    public void formTest() throws InterruptedException, AWTException {
        forms.formOption();
        System.out.println("Form is been filled");
    }

//    @AfterTest
//    public void tearDown(){
//        closeDriver();
//    }
}
