/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tap_proyecto;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author chuy-
 */
public class TAP_PROYECTO {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FormInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        new FormInicio().setVisible(true);
    }
}
