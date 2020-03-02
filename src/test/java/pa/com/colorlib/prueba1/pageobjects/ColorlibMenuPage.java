package pa.com.colorlib.prueba1.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {
	//Menu Forms
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/a/span[1]")
	public WebElementFacade menuForms;
	//Menu Form validation
	@FindBy(xpath="(//A[@href='form-validation.html'])[2]")
	public WebElementFacade menuFormValidation;
	//Form Validation - label informativo
	@FindBy(xpath="//H5[text()='Popup Validation']")
	public WebElementFacade lblFormValidation;
	
	public void menuFormValidation() {
		menuForms.click();
		menuFormValidation.click();
		String strMensaje = lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
	}
}
