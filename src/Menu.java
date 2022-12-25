
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        // laptopModels = new ArrayList<Laptop>();
        /*populateArrayList();

        String[] laptopList = new String[laptopModels.size()];
        for (int i = 0; i < laptopModels.size(); i++) {
            laptopList[i] = laptopModels.get(i).getId();
        }*/
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
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

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
        scrollPane.setViewportView(table);

        jButton1.setText("import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setText("laptop/phone");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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
        jMenu2.add(jMenuItem5);

        menuBar.add(jMenu2);

        jMenu3.setText("Add");

        jMenuItem3.setText("Add Laptop");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Add Phone");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new AddLaptop().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new AddPhone().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String filePath = "C:\\Users\\HP\\Documents\\NetBeansProjects\\lastJavaCompare\\Laptops.txt";
//        String filePath = "/home/kerem/NetBeansProjects/CompareProject/lastJavaCompare/Laptops.txt";
//        File file = new File(filePath);
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader("data.txt"));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        FileReader data = null;
        try {
            data = new FileReader("data.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader reader = new BufferedReader(data);
        String line;

//        Object[] laptopList = new Object[lineCount];
        List<Laptop> laptopList = new ArrayList<>();

        try {

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(" ,");
                String brand = parts[0].trim();
                String model = parts[1].trim();
                String price = parts[2].trim();

                Laptop l = new Laptop(brand, model, Integer.parseInt(price));
                laptopList.add(l);

            }
            System.out.println(laptopList.get(1).getModel());

            JTable laptopTable = new JTable();
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Brand");
            model.addColumn("Model");
            model.addColumn("Price");

            for (Laptop laptop : laptopList) {
                System.out.println(laptop.getBrand());
                model.addRow(new Object[]{laptop.getBrand(), laptop.getModel(), laptop.getPrice()});
            }
            laptopTable.setModel(model);
            System.out.println(laptopTable.s());
            laptopTable.add(table, BorderLayout.CENTER);

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
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
