package com.datasaver.front;

import com.datasaver.save.TestSavings;
import com.shopserver.database.objects.Product;
import com.shopserver.database.objects.Property;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 29.05.2018.
 */
public class AddNewProduct extends JFrame {

    private JLabel nameLabel = new JLabel("Name:");
    private JLabel categoryLabel = new JLabel("Category:");
    private JLabel categoryLabel2 = new JLabel("SubCategory:");
    private JLabel urlLabel = new JLabel("URL:");
    private JLabel imgLabel = new JLabel("img:");
    private JLabel propertyLabel = new JLabel("Property:");
    private JLabel descriptionLabel = new JLabel("Description:");
    private JLabel priceLabel = new JLabel("Price:");

    private JTextField nameText = new JTextField("");
    private JTextField categoryText = new JTextField("");
    private JTextField categoryText2 = new JTextField("");
    private JTextField urlText = new JTextField("");
    private JTextField imgText = new JTextField("");
    private JTextField propertyText = new JTextField("");
    private JTextField descriptionText = new JTextField("");
    private JTextField priceText = new JTextField("");

    private JButton okBtn = new JButton("Confirm");
    TestSavings test;

    public AddNewProduct(TestSavings testSavings){
        super("Add product");
        test=testSavings;
        this.setBounds(760, 440, 368, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        container.add(nameLabel,
                new GridBagConstraints(0, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(nameText,
                new GridBagConstraints(1, 0, 1, 1, 10, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        nameText.setToolTipText("Input name");

        container.add(categoryLabel,
                new GridBagConstraints(0, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(categoryText,
                new GridBagConstraints(1, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        categoryText.setToolTipText("Input category");

        container.add(categoryLabel2,
                new GridBagConstraints(0, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(categoryText2,
                new GridBagConstraints(1, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        categoryText.setToolTipText("Input category");

        container.add(urlLabel,
                new GridBagConstraints(0, 3, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(urlText,
                new GridBagConstraints(1, 3, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        urlText.setToolTipText("Input url");



        container.add(imgLabel,
                new GridBagConstraints(0, 4, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(imgText,
                new GridBagConstraints(1, 4, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        imgText.setToolTipText("Input img");


        container.add(propertyLabel,
                new GridBagConstraints(0, 5, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(propertyText,
                new GridBagConstraints(1, 5, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        propertyText.setToolTipText("Input property");

        container.add(descriptionLabel,
                new GridBagConstraints(0, 6, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(descriptionText,
                new GridBagConstraints(1, 6, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        descriptionText.setToolTipText("Input description");

        container.add(priceLabel,
                new GridBagConstraints(0, 7, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));

        container.add(priceText,
                new GridBagConstraints(1, 7, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        descriptionText.setToolTipText("Input description");


        container.add(okBtn,
                new GridBagConstraints(1, 8, 1, 1, 1, 1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(1, 1, 1, 1), 0, 0));
        okBtn.addActionListener(new okBtnListener());

    }
    private class okBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            List<String> subCategory=new ArrayList<>();
            subCategory.add(categoryText.getText());
            subCategory.add(categoryText2.getText());
            Property property = new Property(propertyText.getText(), descriptionText.getText());
            List<Property> properties = new ArrayList<>();
            properties.add(property);
            Product product=new Product(urlText.getText(), imgText.getText(),subCategory, nameText.getText(), Integer.parseInt(priceText.getText()), properties );
            test.getConnector().saveProductGrpc(product);
            test.updateProducts();
            ProductMenu productMenu = new ProductMenu(test);
            productMenu.setVisible(true);
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
