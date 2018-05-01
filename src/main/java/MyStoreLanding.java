import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyStoreLanding {

//    @FindBy(xpath = "//*[@id=\"email\"]")
//    private WebElement email;
//
//    @FindBy(xpath = "//*[@id=\"passwd\"]")
//    private WebElement password;
//
//    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
//    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
    private List<WebElement> basket;

    public MyStoreLanding() {

    }

//    public void login(String email, String password){
//
//        if(isEelementPresent(this.email) && isEelementPresent(this.password) && isEelementPresent(this.loginButton)){
//            this.email.sendKeys(email);
//            this.password.sendKeys(password);
//            this.loginButton.click();
//        }
//        else System.out.println("One or more elements couldn't be found!");
//    }

    public boolean isEelementPresent(WebElement element){

        if (element == null){
            return false;
        }
        else return true;
    }

    public void addItemsToBasket(){

        if (basket.size() != 0){
            for (WebElement element : basket) {
                element.click();
            }
        }
        else System.out.println("No element found!");
    }
}
