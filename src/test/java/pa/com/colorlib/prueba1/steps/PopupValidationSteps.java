package pa.com.colorlib.prueba1.steps;

import net.thucydides.core.annotations.Step;
import pa.com.colorlib.prueba1.pageobjects.ColorlibLoginPage;
import pa.com.colorlib.prueba1.pageobjects.ColorlibMenuPage;

public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	
	@Step
	public void login_colorlib(String strUsuario, String strPass) {
		//1. Abrir el navegador con rl url de prueba
		colorlibLoginPage.open();
		//2. Ingresar usuario demo
		//3. Ingresar password demo
		//4. Click en el boton Sign in
		colorlibLoginPage.IngresarDatos(strUsuario, strPass);
		//5. Verificar la Autenticación (label en home)
		colorlibLoginPage.VerificaHome();
	}
	
	@Step
	public void ingresar_form_validation( ) {
		colorlibMenuPage.menuFormValidation();
	}
}
