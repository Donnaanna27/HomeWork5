import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class   hwork5 {
    @Test
    public void test() {
        Selenide.open("https://ee.ge/registration");
        Configuration.browserSize = "1920X1080";
        $(byText("რეგისტრაცია")).click();
        Assert.assertEquals("რეგისრაციის ტექსტი", "სწრაფი რეგისტრაცია", $(".registration-titles").getText());
$("#firstName").click();
$("#firstName").setValue("donari");
Assert.assertEquals("donari", $("#firstName").getValue());
        $("#lastName").click();
        $("#lastName").setValue("samadashvili");
        Assert.assertEquals("samadashvili", $("#lastName").getValue());
        $("#email").click();
        $("#email").setValue("donna.samadashvili@gmail.com");
        Assert.assertEquals("donna.samadashvili@gmail.com", $("#email").getValue());
        $("#password").click();
        $("#password").setValue("****");
        Assert.assertEquals("****", $("#password").getValue());
        //Assert.assertFalse("veli Sevsebulia",$("#password").is(Condition.empty));
       sleep(3000);
      $("#confirmPassword").click();
      $("#confirmPassword").setValue("****");
      Assert.assertEquals("****", $("#confirmPassword").getValue());
       // Assert.assertFalse("veli Sevsebulia",$("#confirmPassword").is(Condition.empty);
       // $("#singup").click();
        // Assert.assertTrue($("#singup").is(Condition.enabled));
    }
}
