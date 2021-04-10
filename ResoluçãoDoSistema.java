
package resoluçãodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Arlete
 */
public class ResoluçãoDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();
       Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é :" + d.width +" X " + d.height);
       
    }
    
}
