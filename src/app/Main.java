/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import gui.MainProMathD;
import gui.proLineal;
import gui.mTransporte;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {

    public JFrame mainASYS;
    public JFrame competencias;
    public JFrame lineasDeEspera;
    public JFrame planteacion;
    public JFrame tInventarios;
    public JFrame mTransporte;
    public JFrame proLineal;
    public JFrame desicion;

    public Main() {
        mainASYS = new MainProMathD(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);

    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainASYS.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Main().run();

    }

    public class Planeacion {

        public Planeacion() {
        }
    }
}
