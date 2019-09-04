/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combostar;

import controller.ComboStarAdministrator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.ComboBuilder;
import model.Product;

/**
 *
 * @author alexander
 */
public class MainFrame extends javax.swing.JFrame {
    
    private final HashMap<String, String> productNameCode;
    private ComboStarAdministrator comboStarAdministrator;
    private ActionListener actionListenerAddProduct;
    private ActionListener actionListenerFromCombo;
    private ActionListener actionListenerFromMainProduct;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        productNameCode = new HashMap();
        actionListenerAddProduct = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
              comboStarAdministrator.addProduct(productNameCode.get(((JButton)e.getSource()).getText()));
            }
        };
        
        actionListenerFromCombo = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
              comboStarAdministrator.fromCombo(productNameCode.get(((JButton)e.getSource()).getText()));
            }
        };
        
        actionListenerFromMainProduct = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
              comboStarAdministrator.fromMainProduct(productNameCode.get(((JButton)e.getSource()).getText()));
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupComboMain = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlAdditionals = new javax.swing.JPanel();
        pnlCombos = new javax.swing.JPanel();
        pnlMainProducts = new javax.swing.JPanel();
        pnlDrinks = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCombo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrder = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Combos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Plato fuerte:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Bebidas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Adicionales:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        getContentPane().add(pnlAdditionals, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(pnlCombos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(pnlMainProducts, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(pnlDrinks, gridBagConstraints);

        jLabel5.setText("Combo actual:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Factura Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel6, gridBagConstraints);

        txtCombo.setColumns(20);
        txtCombo.setRows(5);
        jScrollPane1.setViewportView(txtCombo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        txtOrder.setColumns(20);
        txtOrder.setRows(5);
        jScrollPane2.setViewportView(txtOrder);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(btnAgregar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void addCombo(ComboBuilder combo) {
        JRadioButton component = new JRadioButton(combo.getName());
        addComponent(component, pnlCombos, actionListenerFromCombo);
        productNameCode.put(combo.getName(), combo.getCode());
    }
    
    public void addMainProduct(Product product) {
        JRadioButton component = new JRadioButton(product.getName());
        addComponent(component, pnlMainProducts, actionListenerFromMainProduct);
        productNameCode.put(product.getName(), product.getCode());
    }
    
    public void addDrink(Product product) {
        JButton component = new JButton(product.getName());
        addComponent(component, pnlDrinks, actionListenerAddProduct);
        productNameCode.put(product.getName(), product.getCode());
    }
    
    public void addAdditional(Product product) {
        JButton component = new JButton(product.getName());
        addComponent(component, pnlAdditionals, actionListenerAddProduct);
        productNameCode.put(product.getName(), product.getCode());
    }
    
    public void addComponent(JComponent component, JPanel panel, ActionListener actionListener) {
        panel.add(component);
        
        if (component instanceof JButton) {
            ((JButton)component).addActionListener(actionListener);
        } else if (component instanceof JRadioButton) {
            JRadioButton radioButton = (JRadioButton)component;
            radioButton.addActionListener(actionListener);
        }
    }
    
    public void setComboString(String string) {
        txtCombo.setText(string);
    }
    
    public void setOrderString(String string) {
        txtOrder.setText(string);
    }
    
    public void setAdministrator(ComboStarAdministrator comboStarAdministrator) {
        this.comboStarAdministrator = comboStarAdministrator;
    }
    
    public ComboStarAdministrator getAdministrator() {
        return this.comboStarAdministrator;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup btnGroupComboMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlAdditionals;
    private javax.swing.JPanel pnlCombos;
    private javax.swing.JPanel pnlDrinks;
    private javax.swing.JPanel pnlMainProducts;
    private javax.swing.JTextArea txtCombo;
    private javax.swing.JTextArea txtOrder;
    // End of variables declaration//GEN-END:variables
}
