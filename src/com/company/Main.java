package com.company;
import com.company.UserInterface.UserInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserInterface myInterface = new UserInterface();
                myInterface.setVisible(true);
            }
        });
    }
}
