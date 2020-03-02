package pa.com.colorlib.prueba1.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {
//Campo usuario
	@FindBy(xpath="//INPUT[@type='text'][1]")
	public WebElementFacade txtUsername;
//Campo contraseña
	@FindBy(xpath="//INPUT[@type='password'][1]")
	public WebElementFacade txtPassword;
//Boton
	@FindBy(xpath="//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']")
	public WebElementFacade btnSignIn;
//Label verifica home
	@FindBy(xpath="//H1[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos(String strUsuario, String strPass) {
		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSignIn.click();
	}
	
	public void VerificaHome() {
		String labelv = "Bootstrap-Admin-Template";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}

}
