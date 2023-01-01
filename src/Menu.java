
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class Menu extends javax.swing.JFrame {

    List<Laptop> laptopList = new ArrayList<>();
    JTable laptopTable = new JTable();
    Object value;
    Laptop product1, product2;
    int selectedRow = -1;
    String id1, id2;

    public Menu() {
        initComponents();
        populateLaptopList();
        createTable();

        //      appending table to scrollPane
        scrollPane.setViewportView(laptopTable);
        // laptopModels = new ArrayList<Laptop>();
        /*populateArrayList();

        String[] laptopList = new String[laptopModels.size()];
        for (int i = 0; i < laptopModels.size(); i++) {
            laptopList[i] = laptopModels.get(i).getId();
        }*/
    }

    public void populateLaptopList() {
        FileReader data = null;
        try {
            data = new FileReader("data.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(data);
        String line;

//        Object[] laptopList = new Object[lineCount];
        try {

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");
                System.out.println(parts.length);
                String id = parts[0].trim();
                String brand = parts[1].trim();
                String model = parts[2].trim();
                String price = parts[3].trim();
                String GPU = parts[4].trim();
                String proccesor = parts[5].trim();
                String ram = parts[6].trim();
                String storage = parts[7].trim();
                String screen = parts[8].trim();
                String weight = parts[9].trim();
                String year = parts[10].trim();
                String operatingSystem = parts[11].trim();

                Laptop l = new Laptop(Integer.parseInt(id), brand, model, GPU, proccesor, Integer.parseInt(ram), storage, Double.parseDouble(screen), Double.parseDouble(weight), Integer.parseInt(year), operatingSystem, Integer.parseInt(price));
                laptopList.add(l);

            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createTable() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Brand");
        model.addColumn("Model");
        model.addColumn("Price");
        model.isCellEditable(ERROR, ERROR);

        for (Laptop laptop : laptopList) {
            System.out.println(laptop.getBrand());
            model.addRow(new Object[]{laptop.getId(), laptop.getBrand(), laptop.getModel(), laptop.getPrice()});
        }
        laptopTable.setModel(model);

//        int[] selectedRows = laptopTable.getSelectedRows();
//        if (selectedRows.length > 0) {
//
//            System.out.println(selectedRows[0] + selectedRows[1]);
//        }
        ListSelectionModel laptopModel = laptopTable.getSelectionModel();
        laptopModel.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (!laptopModel.isSelectionEmpty()) {
                    selectedRow = laptopModel.getMinSelectionIndex();
                    value = laptopTable.getValueAt(selectedRow, 0);
//                    JOptionPane.showMessageDialog(null, "Selected Row" + selectedRow + "selected val: " + value);
                }
            }

        });
//        laptopTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//          
//                // do some actions here, for example
//                // print first column value from selected row
//                System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
//            
//        });

//        laptopTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public int findProductIndex(int id) {

        int index = -1;
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getId() == id) {
                index = i;
                break;

            }
        }
        return index;
    }

    /*public void CreateNewItem() {
        populateArrayList();
        String[] laptopList = new String[laptopModels.size()];
        for (int i = 0; i < laptopModels.size(); i++) {
            laptopList[i] = laptopModels.get(i).showSum();
        }
        JFrame frame = new JFrame("JList Demo");
        JPanel panel = new JPanel();
        JList list = new JList(laptopList);

        int begn = 0;
        int end = list.getModel().getSize() - 1;
        if (end >= 0) {
            list.setSelectionInterval(begn, end);
        }
        panel.add(list);
        frame.add(panel);
        frame.setSize(550, 300);
        frame.setVisible(true);
    }

    public void populateArrayList() {

        try {
            FileInputStream file = new FileInputStream("Laptops.txt");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    laptopModels.add((Laptop) inputFile.readObject());

                } catch (EOFException e) {
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null,
                            f.getMessage());
                }
            }
            inputFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
        }

    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(962, 601));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        scrollPane.setViewportView(table);

        jButton1.setText("Add product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID :");

        jLabel2.setText("Model :");

        jLabel3.setText("Cpu :");

        jLabel4.setText("Price:");

        jLabel5.setText("jLabel5");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("ID :");

        jLabel11.setText("Model :");

        jLabel10.setText("Cpu :");

        jLabel12.setText("Price :");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem2.setText("exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        jMenu2.setText("Compare");

        jMenuItem5.setText("Compare");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "You haven't choose any product");
        } else if (value.toString().equals(jLabel13.getText())) {
            JOptionPane.showMessageDialog(null, "Same products can't compare");
        } else {
            // setting products infos.
            id1 = value.toString();
            jLabel5.setText(id1);
            selectedRow = -1;
            System.out.println(laptopList.get(findProductIndex(Integer.parseInt(id1))));
            product1 = laptopList.get(findProductIndex(Integer.parseInt(id1)));
        }

//        frame.add(laptopTable);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 400);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        table.add(laptopTable);
//        laptopTable.setVisible(true);
//        System.out.println(laptopTable.getValueAt(1, 1));
        //String filePath = "C:\\Users\\HP\\Documents\\NetBeansProjects\\lastJavaCompare\\Laptops.txt";
//        String filePath = "/home/kerem/NetBeansProjects/CompareProject/lastJavaCompare/Laptops.txt";
//        File file = new File(filePath);
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader("data.txt"));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //table.add(laptopTable);
        //        try {
        //            BufferedReader br = new BufferedReader(new FileReader(file));
        //            // get the first line
        //            // get the columns name from the first line
        //            // set columns name to the jtable model
        //            //String firstLine = br.readLine().trim();
        //            //String[] columnsName = firstLine.split(",");
        //            DefaultTableModel model = (DefaultTableModel) table.getModel();
        //            //model.setColumnIdentifiers(columnsName);
        //
        //            // get lines from txt file
        //            Object[] tableLines = br.lines().toArray();
        //
        //            // extratct data from lines
        //            // set data to jtable model
        //            for (int i = 0; i < tableLines.length; i++) {
        //                String line = tableLines[i].toString().trim();
        //                String[] dataRow = line.split("/");
        //                model.addRow(dataRow);
        //            }
        //
        //        } catch (Exception e) {
        //            JOptionPane.showMessageDialog(null,
        //                    e.getMessage());
        //        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        int index = laptopTable.getSelectedRow();
        TableModel schema = laptopTable.getModel();
        jLabel13.setText(schema.getValueAt(index, 1).toString());
        System.out.println("Test");
    }//GEN-LAST:event_tableMousePressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        /*JFrame Compare = new JFrame();
        JLabel label = new JLabel();
        label.setText(id1);
        Compare.add(label);*/
        //new Compare("32").setVisible(true);
        Compare compare = new Compare();
        compare.setData(product1, product2);
        compare.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "You haven't choose any product");
        } else if (value.toString().equals(jLabel5.getText())) {
            JOptionPane.showMessageDialog(null, "Same products can't compare");
        } else {
            // setting products infos.
            id2 = value.toString();
            jLabel13.setText(id2);
            selectedRow = -1;
            System.out.println(laptopList.get(findProductIndex(Integer.parseInt(id2))));
            product2 = laptopList.get(findProductIndex(Integer.parseInt(id2)));
    }//GEN-LAST:event_jButton2ActionPerformed
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
