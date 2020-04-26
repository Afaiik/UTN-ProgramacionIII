package com.company.UserInterface;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JTextArea;


public class OutputHandler extends OutputStream {
    private JTextArea textArea;

    public OutputHandler(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public static void setOutput(JTextArea textArea){
        PrintStream printStream = new PrintStream(new OutputHandler(textArea));
        System.setOut(printStream);
        System.setErr(printStream);
    }
}