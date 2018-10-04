/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import com.alejandro.DAO.ClienteDao;
import com.alejandro.DAO.UsuarioDao;
import com.alejandro.dominio.Cliente;
import com.alejandro.dominio.Usuario;
import com.alejandro.table.ClienteTable;
import com.alejandro.table.UsuarioTable;
import com.alejandro.ucc.Clienteucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class BuscarClienteView extends javax.swing.JDialog {

    public BuscarClienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setIconImage(new ImageIcon(getClass().getResource("/imagenes/buscar.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR CLIENTE");

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarclienteKeyReleased(evt);
            }
        });

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        btncerrar.setBackground(java.awt.Color.cyan);
        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(java.awt.Color.cyan);
        btneditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setFocusable(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(java.awt.Color.cyan);
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setFocusable(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btneditar)
                        .addGap(29, 29, 29)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncerrar))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed

        try {
            ClienteTable clienteTable = (ClienteTable) tablaclientes.getModel();
            Cliente cliente = clienteTable.getFilas().get(tablaclientes.getSelectedRow());
            ClienteView cv = new ClienteView((Frame) this.getParent(), true, cliente);
            cv.setVisible(true);
            txtbuscarclienteKeyReleased(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarclienteKeyReleased

        ClienteDao cd = new ClienteDao(null);
        List<Cliente> clientes = cd.buscarPorCriterio(txtbuscarcliente.getText());
        ClienteTable clienteTable = new ClienteTable(clientes);
        tablaclientes.setModel(clienteTable);

    }//GEN-LAST:event_txtbuscarclienteKeyReleased

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked

    }//GEN-LAST:event_tablaclientesMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            ClienteTable clienteTable = (ClienteTable) tablaclientes.getModel();
            Cliente cliente = clienteTable.getFilas().get(tablaclientes.getSelectedRow());
            Clienteucc clienteucc = new Clienteucc();
            boolean eliminar = clienteucc.deleteCliente(cliente);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se Elimino correctamente");
                    txtbuscarclienteKeyReleased(null);

                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTextField txtbuscarcliente;
    // End of variables declaration//GEN-END:variables
}
