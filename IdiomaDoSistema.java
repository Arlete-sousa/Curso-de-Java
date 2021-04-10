
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Arlete
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(loc.getDisplayLanguage());//imprime "Portugês"
    }
    
}
