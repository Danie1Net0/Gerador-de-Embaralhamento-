package model.gui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import model.bean.*;

public class InterfacePrincipal extends javax.swing.JFrame {
    //CONSTRUTOR
    public InterfacePrincipal() {
        initComponents();
        lblScramble.setText(new Embaralhamento3x3().getScramble());
        ButtonGroup group = new ButtonGroup();
        group.add(menuItem2x2);
        group.add(menuItem3x3);
        group.add(menuItem4x4);
    }

    //METODOS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblScramble = new javax.swing.JLabel();
        btnScramble = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuCategoria = new javax.swing.JMenu();
        menuItem2x2 = new javax.swing.JCheckBoxMenuItem();
        menuItem3x3 = new javax.swing.JCheckBoxMenuItem();
        menuItem4x4 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Embaralhamento");
        setIconImage(new ImageIcon(getClass().getResource("img/cubo1.png")).getImage());

        lblScramble.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblScramble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScramble.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnScramble.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnScramble.setText("Novo Embaralhamento");
        btnScramble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrambleActionPerformed(evt);
            }
        });

        menuCategoria.setText("Categoria");

        menuItem2x2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        menuItem2x2.setText("Cubo 2x2x2");
        menuItem2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2x2ActionPerformed(evt);
            }
        });
        menuCategoria.add(menuItem2x2);

        menuItem3x3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        menuItem3x3.setSelected(true);
        menuItem3x3.setText("Cubo 3x3x3");
        menuItem3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3x3ActionPerformed(evt);
            }
        });
        menuCategoria.add(menuItem3x3);

        menuItem4x4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        menuItem4x4.setText("Cubo 4x4x4");
        menuItem4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem4x4ActionPerformed(evt);
            }
        });
        menuCategoria.add(menuItem4x4);

        barraMenu.add(menuCategoria);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScramble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btnScramble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScramble, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnScramble, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        setSize(new java.awt.Dimension(705, 258));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ACTIONS
    private void btnScrambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrambleActionPerformed
        if(menuItem2x2.isSelected()){
            lblScramble.setText(new Embaralhamento2x2().getScramble());
        }else if(menuItem3x3.isSelected()){
            lblScramble.setText(new Embaralhamento3x3().getScramble());
        }else if(menuItem4x4.isSelected()){
            lblScramble.setText("<html><p align='center'>" + new Embaralhamento4x4().getScramble() + "</p></html>");
        }
    }//GEN-LAST:event_btnScrambleActionPerformed

    private void menuItem2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2x2ActionPerformed
        lblScramble.setText(new Embaralhamento2x2().getScramble());
    }//GEN-LAST:event_menuItem2x2ActionPerformed

    private void menuItem3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3x3ActionPerformed
        lblScramble.setText(new Embaralhamento3x3().getScramble());
    }//GEN-LAST:event_menuItem3x3ActionPerformed

    private void menuItem4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem4x4ActionPerformed
        lblScramble.setText("<html><p align='center'>" + new Embaralhamento4x4().getScramble() + "</p></html>");
    }//GEN-LAST:event_menuItem4x4ActionPerformed

    //MAIN
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnScramble;
    private javax.swing.JLabel lblScramble;
    private javax.swing.JMenu menuCategoria;
    private javax.swing.JCheckBoxMenuItem menuItem2x2;
    private javax.swing.JCheckBoxMenuItem menuItem3x3;
    private javax.swing.JCheckBoxMenuItem menuItem4x4;
    // End of variables declaration//GEN-END:variables
}
