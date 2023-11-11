
package principal;

import com.formdev.flatlaf.FlatLightLaf; 
import views.Login;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup(); //Modifica el diseño de los componentes de las interfaces graficas
        Login login = new Login();
        login.setVisible(true);
    }
}
