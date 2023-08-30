
package co.unicauca.travelagency.client.infra;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Libardo, Julio
 */
public class Messages {

    /**
     * Genera un emergente de aventencia
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     */
    public static void warningMessage(String mns, String title) {
        JOptionPane.showMessageDialog(null, mns, title, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/warning.png"));
    }

    /**
     * Genera un emergente de error
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void errorMessage(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/warning.png"));
    }

    /**
     * Genera un emergente de exito
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     */
    public static void successMessage(String mns, String title) {
        JOptionPane.showMessageDialog(null, mns, title, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/exitoso.png"));
    }

    /**
     * Genera un emergente de confirmación con los botones Si ó No
     *
     * @param mns mensaje dentro de la ventana
     * @param title título de la ventana
     * @return Si ó No
     */
    public static int confirmMessage(String mns, String title) {
        return JOptionPane.showConfirmDialog(null, mns, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

}
