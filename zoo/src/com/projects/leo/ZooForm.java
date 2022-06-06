package com.projects.leo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZooForm extends JFrame {
    private JButton showAllButton;
    private JPanel Panel1;
    private JLabel label1;
    private JButton addButton;
    private JButton exitButton;
    private JButton helpButton;
    private JButton searchByNameButton;
    private JButton searchByCodeButton;
    private JButton deleteButton;
    private JButton editButton;

    public ZooForm() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000, 300));
        setContentPane(Panel1);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        // All the code for the form buttons
        showAllButton.addActionListener(new ActionListener() { // Show all animals
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.PrintAllAnimals();
            }
        });
        addButton.addActionListener(new ActionListener() { // Add new animal
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.AddAnimal();
            }
        });
        searchByNameButton.addActionListener(new ActionListener() { // search animal by name
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.ShowAnimal(false);
            }
        });
        searchByCodeButton.addActionListener(new ActionListener() { //  search animal by code
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.ShowAnimal(true);
            }
        });
        deleteButton.addActionListener(new ActionListener() { // delete animal by code
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.DeleteAnimal();
            }
        });
        editButton.addActionListener(new ActionListener() { //  edit animal's details
            @Override
            public void actionPerformed(ActionEvent e) {
                Zookeeper.editAnimal();
            }
        });
        helpButton.addActionListener(new ActionListener() { // show all available actions
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.HelpAction();
            }
        });
        exitButton.addActionListener(new ActionListener() { // exit the program
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.exitAction();
            }
        });
    }
}