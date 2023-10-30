
package principal;

import com.formdev.flatlaf.FlatLightLaf; 
import views.FrameLogin;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup(); //Modifica el diseño de los componentes de las interfaces graficas
        FrameLogin login = new FrameLogin();
        login.setVisible(true);
    }
}
