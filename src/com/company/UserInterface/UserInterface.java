package com.company.UserInterface;

import com.company.Common.AppParameters;
import com.company.GuiaObjetos01.GuiaObjetos01;
import com.company.GuiaObjetos02.GuiaObjetos02;
import com.company.GuiaObjetos03.GuiaObjetos03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class UserInterface extends JFrame{
    private JTabbedPane tabbedPane2;
    private JPanel rootPanel;

    private JTextArea guia01ConsignaTextArea;
    private JTextArea guia01OutputTextArea;
    private JButton consigna01Guia01Button;
    private JButton consigna02Guia01Button;
    private JButton consigna03Guia01Button;
    private JButton consigna04Guia01Button;
    private JButton consigna05Guia01Button;

    private JButton consigna01Guia02Button;
    private JButton consigna02Guia02Button;
    private JButton consigna03Guia02Button;
    private JTextArea guia02ConsignaTextArea;
    private JTextArea guia02OutputTextArea;

    private JTextArea guia03ConsignaTextArea;
    private JTextArea guia03OutputTextArea;
    private JButton consigna01Guia03Button;
    private JButton consigna02Guia03Button;
    private JButton consigna03Guia03Button;


    public UserInterface(){
        add(rootPanel);
        setTitle("Programación III - UTN - Efrain Cettour");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        consigna01Guia01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia01InitialActions(1);
            }
        });

        consigna02Guia01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia01InitialActions(2);
            }
        });
        consigna03Guia01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia01InitialActions(3);
            }
        });
        consigna04Guia01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia01InitialActions(4);
            }
        });
        consigna05Guia01Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia01InitialActions(5);
            }
        });

        consigna01Guia02Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia02InitialActions(1);
            }
        });
        consigna02Guia02Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia02InitialActions(2);
            }
        });
        consigna03Guia02Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia02InitialActions(3);
            }
        });
        consigna01Guia03Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia03InitialActions(1);
            }
        });
        consigna02Guia03Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia03InitialActions(2);
            }
        });
        consigna03Guia03Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGuia03InitialActions(3);
            }
        });
    }

    private void buttonGuia01InitialActions(int nroConsigna){
        clearGuia01TextAreas();
        OutputHandler.setOutput(guia01OutputTextArea);

        switch (nroConsigna){
            case 1:
                guia01ConsignaTextArea.append(AppParameters.consigna01Guia01);
                GuiaObjetos01.Consigna1();
                break;
            case 2:
                guia01ConsignaTextArea.append(AppParameters.consigna02Guia01);
                GuiaObjetos01.Consigna2();
                break;
            case 3:
                guia01ConsignaTextArea.append(AppParameters.consigna03Guia01);
                GuiaObjetos01.Consigna3();
                break;
            case 4:
                guia01ConsignaTextArea.append(AppParameters.consigna04Guia01);
                GuiaObjetos01.Consigna4();
                break;
            case 5:
                guia01ConsignaTextArea.append(AppParameters.consigna05Guia01);
                GuiaObjetos01.Consigna5();
                break;
            default:
                break;
        }
    }
    private void clearGuia01TextAreas(){
        guia01ConsignaTextArea.setText(null);
        guia01OutputTextArea.setText(null);
    }

    private void buttonGuia02InitialActions(int nroConsigna){
        clearGuia02TextAreas();
        OutputHandler.setOutput(guia02OutputTextArea);

        switch (nroConsigna){
            case 1:
                guia02ConsignaTextArea.append(AppParameters.consigna01Guia02);
                GuiaObjetos02.consigna01();
                break;
            case 2:
                guia02ConsignaTextArea.append(AppParameters.consigna02Guia02);
                GuiaObjetos02.consigna02();
                break;
            case 3:
                guia02ConsignaTextArea.append(AppParameters.consigna03Guia02);
                GuiaObjetos02.consigna03();
                break;
            default:
                break;
        }
    }
    private void clearGuia02TextAreas(){
        guia02ConsignaTextArea.setText(null);
        guia02OutputTextArea.setText(null);
    }

    private void buttonGuia03InitialActions(int nroConsigna){
        clearGuia03TextAreas();
        OutputHandler.setOutput(guia03OutputTextArea);

        switch (nroConsigna){
            case 1:
                guia03ConsignaTextArea.append(AppParameters.consigna01Guia03);
                GuiaObjetos03.consigna01();
                break;
            case 2:
                guia03ConsignaTextArea.append(AppParameters.consigna02Guia03);
                GuiaObjetos03.consigna02();
                break;
            case 3:
                guia03ConsignaTextArea.append(AppParameters.consigna03Guia03);
                GuiaObjetos03.consigna03();
                break;
            default:
                break;
        }
    }
    private void clearGuia03TextAreas(){
        guia03ConsignaTextArea.setText(null);
        guia03OutputTextArea.setText(null);
    }


}
