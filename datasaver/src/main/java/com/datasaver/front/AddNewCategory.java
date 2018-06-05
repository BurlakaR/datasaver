package com.datasaver.front;

import com.datasaver.save.TestSavings;
import com.shopserver.database.objects.Category;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 29.05.2018.
 */
public class AddNewCategory extends JFrame {

    private JLabel urlLabel = new JLabel("URL:");
    private JLabel surlLabel1 = new JLabel("SubURL1:");
    private JLabel surlLabel2 = new JLabel("SubURL2:");
    private JLabel surlLabel3 = new JLabel("SubURL3:");


    private JTextField urlText = new JTextField("");
    private JTextField surlText1 = new JTextField("");
    private JTextField surlText2 = new JTextField("");
    private JTextField surlText3 = new JTextField("");

    private JButton okBtn = new JButton("Confirm");

    TestSavings test;

    public AddNewCategory(TestSavings testSavings) {
        super("Add category");
        test=testSavings;
        this.setBounds(760, 440, 368, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());






        container.add(urlLabel,
                new GridBagConstraints(0, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(urlText,
                new GridBagConstraints(1, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        urlText.setToolTipText("Input url");


        container.add(surlLabel1,
                new GridBagConstraints(0, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(surlText1,
                new GridBagConstraints(1, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        urlText.setToolTipText("Input suburl");

        container.add(surlLabel2,
                new GridBagConstraints(0, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(surlText2,
                new GridBagConstraints(1, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        urlText.setToolTipText("Input suburl");

        container.add(surlLabel3,
                new GridBagConstraints(0, 3, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(surlText3,
                new GridBagConstraints(1, 3, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        urlText.setToolTipText("Input suburl");


        container.add(okBtn,
                new GridBagConstraints(1, 4, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        okBtn.addActionListener(new okBtnListener());

    }
    private class okBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null, "PLACEHOLDER");
            List<String> stringList = new ArrayList<>();
            stringList.add(surlText1.getText());
            stringList.add(surlText2.getText());
            stringList.add(surlText3.getText());
            Category category=new Category(urlText.getText(), stringList);
            test.getConnector().saveCategoryGrpc(category);
            test.updateCategories();
            CategoryMenu categoryMenu = new CategoryMenu(test);
            categoryMenu.setVisible(true);
            dispose();
            //добавление в БД
                /*Connection connection = null;
                PreparedStatement statementPr = null;
                try {
                    connection = DriverManager.getConnection(url, name, password);
                    statementPr = connection.prepareStatement("INSERT INTO WORKER VALUES (?,?,?,?,?)");
                    statementPr.setInt(1, new_id_worker);
                    statementPr.setString(2, nameText.getText());
                    statementPr.setInt(3, post_id);
                    statementPr.setString(4, loginText.getText());
                    statementPr.setString(5, passwordText.getText());
                    statementPr.execute();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "CONFIRM!");
                ProductMenu productMenu = new ProductMenu();
                productMenu.setVisible(true);
                dispose();*/
        }
    }
}
