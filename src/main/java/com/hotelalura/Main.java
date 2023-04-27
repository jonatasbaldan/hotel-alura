package com.hotelalura;

import com.formdev.flatlaf.FlatLightLaf;
import view.MainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlatLightLaf.setup();
            new MainFrame();
        });
    }
}