package com.datasaver.front;

import com.datasaver.save.TestSavings;
import com.shopserver.database.objects.Client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by Admin on 29.05.2018.
 */

public class UserMenu extends JFrame
{
    // Модель данных таблицы
    private DefaultTableModel tableModel;
    private JTable table;
   /* // Данные для таблиц
    private Object[][] array = new String[][] {{ "Сахар" , "кг", "1.5" },
            { "Мука"  , "кг", "4.0" },
            { "Молоко", "л" , "2.2" }};
    // Заголовки столбцов
    private Object[] columnsHeader = new String[] {"Наименование", "Ед.измерения", "Количество"};*/

    private static final Object[][] rowData = {};
    private static final Object[] columnNames = {"Name", "Login", "Email"};

    private JButton deleteButton = new JButton("Delete");

    public UserMenu(TestSavings testSavings)
    {
        super("User Manager");
        List<Client> clientList =testSavings.getClients();

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
        for (int i = 0; i < clientList.size(); i++) {
            //String rowString = "Quiz #" + i;
            tableModel.addRow(new Object[]{clientList.get(i).getFio(), clientList.get(i).getLogin(), clientList.get(i).getEmail()});
        }


        /*Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        tableScroll.setPreferredSize(new Dimension(400, 400));
        table.getTableHeader().setReorderingAllowed(false);*/

        /*container.add(tableScroll,
                new GridBagConstraints(0, 0, 1, 5, 20, 1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(1, 1, 1, 1), 0, 0));*//*

        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        getContentPane().add(contents);

       *//* container.add(contents,
                new GridBagConstraints(0, 0, 1, 5, 20, 1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.BOTH,
                        new Insets(1, 1, 1, 1), 0, 0));*//*

        container.add(deleteButton,
                new GridBagConstraints(1, 0, 1, 1, 1, 1,
                        GridBagConstraints.NORTH,
                        GridBagConstraints.NONE,
                        new Insets(20, 1, 1, 1), 0, 0));
        deleteButton.setPreferredSize(new Dimension(115, 25));
        deleteButton.addActionListener(new delete());*/



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
                testSavings.getConnector().deleteClientGrpc(testSavings.getClients().get(idx));
                testSavings.updateClients();
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
        buttons.add(remove);
        buttons.add(back);
        getContentPane().add(buttons, "South");

    }


    /*public static void main(String[] args) {
        new UserMenu();
    }*/

    private class delete implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //удаление из таблицы
            int idx = table.getSelectedRow();
            try {
                tableModel.removeRow(idx);
            }catch (ArrayIndexOutOfBoundsException e1){
                JOptionPane.showMessageDialog(null, "Select row!");
            }
        }
    }
}
