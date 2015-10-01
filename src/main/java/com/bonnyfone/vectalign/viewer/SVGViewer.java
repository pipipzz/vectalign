package com.bonnyfone.vectalign.viewer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SVGViewer extends javax.swing.JFrame implements WindowListener {
    public static final long serialVersionUID = 273462773l;

    private SVGDrawingPanel panel;

    public SVGViewer() {
        initComponents();
        pack();

        //FIXME show demo
        demo();
    }

    private void demo(){
        String sampleA = "M 366.64407,65.08474 L 295.25723,225.79703 L 469.14417,252.02396 L 294.26984,270.55728 L 358.5001,434.26126 L 255.0126,292.0823 L 145.35594,429.55933 L 216.74277,268.84705 L 42.855843,242.62012 L 217.73016,224.08678 L 153.49991,60.38282 L 256.9874,202.56177 L 366.64407,65.08474";
        String sampleB = "M 91.09553,384.35547 L 91.09553,384.35547 L 109.221924,353.94055 L 127.34833,323.52557 L 145.47473,293.11063 L 163.60114,262.69568 L 181.72754,232.28073 L 199.85393,201.86578 L 217.98033,171.45084 L 236.10672,141.03589 L 254.23312,110.62095 L 405.71802,386.1926 L 91.09553,384.35547";
        panel.setPaths(sampleA, sampleB);
        panel.setStrokeColor("red");
        panel.setFillColor("blue");
        panel.setStrokeSize(5);
        panel.renderStep(0.0f);
    }

    private void initComponents() {
        panel = new SVGDrawingPanel();
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.toggleAnimation();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(panel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(200, 220));

        setBackground(Color.white);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        panel.close();
        dispose();
        System.out.println("Exiting...");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("[finish]");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SVGViewer().setVisible(true);
            }
        });
    }

}
