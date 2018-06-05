package com.datasaver.front;

import com.datasaver.save.TestSavings;
import com.shopserver.database.objects.Category;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Admin on 29.05.2018.
 */
public class CategoryMenu extends JFrame{
    private DefaultTableModel tableModel;
    private JTable table;

    private static final Object[][] rowData = {};
    private static final Object[] columnNames = {"Name"};


    public CategoryMenu(TestSavings testSavings)
    {
        super("Category Manager");
        List<Category> categoryList = testSavings.getCategories();
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

        //тестовое добавление строк
        for (int i = 0; i < categoryList.size(); i++) {
            tableModel.addRow(new Object[]{categoryList.get(i).getUrl()});
        }

        JButton add = new JButton("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddNewCategory addNewCategory = new AddNewCategory(testSavings);
                addNewCategory.setVisible(true);
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

                testSavings.getConnector().deleteCategoryGrpc(testSavings.getCategories().get(idx));
                testSavings.updateCategories();
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
