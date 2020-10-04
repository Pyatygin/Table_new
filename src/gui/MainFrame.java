package gui;

import entities.Kindergarten;
import gui.tableModel.TableModelTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class MainFrame extends JFrame {
    public  ArrayList<Kindergarten> kindergartens = new ArrayList<>();
    public TableModelTest tableModelTest = new TableModelTest(kindergartens);
    public JTable table = new JTable(tableModelTest);


  public MainFrame(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(1000, 600));

        Collections.addAll(
                kindergartens,
                new Kindergarten("Лесная полянка", 420, 550, 2000),
                new Kindergarten("Солнышко", 340, 400,1700),
                new Kindergarten("АБВГДейка", 224, 260,1300),
                new Kindergarten("Золотой ключик", 259, 350,1400)
        );

        JScrollPane pane = new JScrollPane(table);

        JButton buttonRemove= new JButton("Удалить");
        buttonRemove.setSize(new Dimension(60,30));
        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tableModelTest.delete(table.getSelectedRow());
                    table.revalidate();
                    table.repaint();
                } catch (IndexOutOfBoundsException e1){
                    showErrorMesange();
                }
            }
        });

        JButton buttonAdd = new JButton("Добавить");
        buttonAdd.setSize(new Dimension(60,30));
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KindergartenJob kindergartenJob = new KindergartenJob();
            }
        });

        JButton buttonEdit = new JButton("Редактировать");
        buttonEdit.setSize(new Dimension(60,30));
        buttonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  //  KindergartenJob kindergartenJob = new KindergartenJob(kindergartens.get(table.getSelectedRow()));
                }
                catch (IndexOutOfBoundsException e2){
                    showErrorMesange();
                }
            }
        });

        JPanel panelButtons = new JPanel();
        panelButtons.setSize(100,100);
        panelButtons.add(buttonRemove,BorderLayout.SOUTH);
        panelButtons.add(buttonAdd,BorderLayout.SOUTH);
        panelButtons.add(buttonEdit,BorderLayout.SOUTH);

        add(pane);
        add(panelButtons,BorderLayout.SOUTH);
        setVisible(true);

    }
    public  void showErrorMesange(){
        JOptionPane.showMessageDialog(
                this,
                "Выберите элемент",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE
        );
    }
    public void add(Kindergarten kindergarten){
      kindergartens.add(kindergarten);
      table.revalidate();
      table.repaint();
    }

    public void edit(Kindergarten kindergarten){

    }

    public void delete(Kindergarten kindergarten){
        kindergartens.remove(kindergarten);
        table.revalidate();
        table.repaint();
    }

}
