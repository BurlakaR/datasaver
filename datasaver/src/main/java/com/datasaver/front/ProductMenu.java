package com.datasaver.front;

import com.datasaver.save.TestSavings;
import com.shopserver.database.objects.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Admin on 29.05.2018.
 */
public class ProductMenu extends JFrame{
        private DefaultTableModel tableModel;
        private JTable table;

        private static final Object[][] rowData = {};
        private static final Object[] columnNames = {"URL", "Name", "Price"};


        TestSavings test;
        public ProductMenu(TestSavings testSavings)
        {
            super("Product Manager");
            test = testSavings;
            this.setBounds(760, 240, 400, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);

            tableModel = new DefaultTableModel(rowData, columnNames);



            //пример добавление строк из БД
        /*while (resultSet.next()) {
            tableModel.addRow(new Object[]{
                    resultSet.getString("NAME"), //название колонки из таблицы БД
                    resultSet.getString("DATE"),
                    resultSet.getString("LOGIN"),
                    resultSet.getString("PASSWORD")
            });
        }*/
            List<Product> products=testSavings.getProducts();
            //тестовое добавление строк
            for (int i = 0; i < products.size(); i++) {
                //String rowString = "Quiz #" + i;
                tableModel.addRow(new Object[]{products.get(i).getUrl(), products.get(i).getName(),products.get(i).getPrice()});
            }

            JButton add = new JButton("Add");
            add.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AddNewProduct addNewProduct = new AddNewProduct(test);
                    addNewProduct.setVisible(true);
                    dispose();
                }
            });

            JButton remove = new JButton("Delete");
            remove.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //удаление из таблицы
                    int idx = table.getSelectedRow();
                    try {
                        tableModel.removeRow(idx);
                    }catch (ArrayIndexOutOfBoundsException e1){
                        JOptionPane.showMessageDialog(null, "Select row!");
                    }
                    testSavings.getConnector().deleteProductGrpc(testSavings.getProducts().get(idx));
                    testSavings.updateProducts();
                }
            });

            JButton back = new JButton("Back");
            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.setVisible(true);
                    dispose();
                }
            });

            table = new JTable(tableModel);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setCellEditor(null);
            table.setBounds(37, 143, 397, 183);

            Box contents = new Box(BoxLayout.Y_AXIS);
            contents.add(new JScrollPane(table));
            getContentPane().add(contents);

            JPanel buttons = new JPanel();
            buttons.add(add);
            buttons.add(remove);
            buttons.add(back);
            getContentPane().add(buttons, "South");
        }
}
