package com.datasaver.front;

import com.datasaver.save.TestSavings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 29.05.2018.
 */


public class MainMenu extends JFrame {

    TestSavings testSavings;

    private JButton userButton = new JButton("User Manager");
    private JButton productButton = new JButton("Product Manager");
    private JButton categoryButton = new JButton("Category Manager");

    public MainMenu(){
        super("Main Menu");
        testSavings=new TestSavings();
        this.setBounds(760, 440, 368, 180);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        container.add(userButton,
                new GridBagConstraints(0, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(productButton,
                new GridBagConstraints(0, 1, 2, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));


        container.add(categoryButton,
                new GridBagConstraints(0, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        userButton.addActionListener(new userMenu());
        productButton.addActionListener(new productMenu());
        categoryButton.addActionListener(new categoryMenu());

    }

    private class userMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //JOptionPane.showMessageDialog(null,"placeholder");
            UserMenu userMenu = new UserMenu(testSavings);
            userMenu.setVisible(true);
            dispose();
        }
    }

    private class productMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"placeholder");
            ProductMenu productMenu = new ProductMenu(testSavings);
            productMenu.setVisible(true);
            dispose();
        }
    }

    private class categoryMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null,"placeholder");
            CategoryMenu categoryMenu = new CategoryMenu(testSavings);
            categoryMenu.setVisible(true);
            dispose();
        }
    }
}
