/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package htsdecrypter;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Rumesh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    Decrypter d = new Decrypter();
                    d.setVisible(true);
                    SwingUtilities.updateComponentTreeUI(d);
                    SwingUtilities.updateComponentTreeUI(d);
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
