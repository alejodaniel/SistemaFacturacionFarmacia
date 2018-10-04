package com.alejandro.views;

import com.alejandro.dominio.Empresa;
import com.alejandro.ucc.Empresaucc;
import com.alejandro.ucc.ValidarNumeros;
import javax.swing.JOptionPane;

public class EmpresaView extends javax.swing.JDialog {

    Empresa empresa;

    public EmpresaView(java.awt.Frame parent, boolean modal, Empresa e) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (e != null) {
            empresa = e;
            cargarEmpresa();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombreempresa = new javax.swing.JTextField();
        txtdireccionempresa = new javax.swing.JTextField();
        txttelefonoempresa = new javax.swing.JTextField();
        txtemailempresa = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPRESA");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Direccion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Telefono:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("E-mail:");

        txtdireccionempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionempresaActionPerformed(evt);
            }
        });

        btnguardar.setBackground(java.awt.SystemColor.activeCaption);
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setFocusable(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombreempresa, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtdireccionempresa)
                    .addComponent(txttelefonoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailempresa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnguardar)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdireccionempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefonoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemailempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(jButton2))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean validarEntradas() {
        ValidarNumeros validarNumeros = new ValidarNumeros();
        if (txtnombreempresa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el nombre de la empresa");
            return false;
        } else if (txtdireccionempresa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene la direccion de la emopresa");
            return false;
        } else if (txttelefonoempresa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llene el telefono de la empresa");
            return false;
        } else if (!validarNumeros.validacion(txttelefonoempresa.getText())) {
            JOptionPane.showMessageDialog(null, "Solo se permite numeros");
            return false;
        } else if (txtemailempresa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Llena el email de la empresa");
            return false;
        }
        return true;
    }

    public void cargarEmpresa() {
        txtnombreempresa.setText(empresa.getNombreEmpresa());
        txtdireccionempresa.setText(empresa.getDireccion());
        txttelefonoempresa.setText(empresa.getTelefono());
        txtemailempresa.setText(empresa.getEmail());
    }
    private void txtdireccionempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionempresaActionPerformed

    }//GEN-LAST:event_txtdireccionempresaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (validarEntradas()) {
            Empresaucc eucc = new Empresaucc();
            if (empresa != null) {
                empresa.setNombreEmpresa(txtnombreempresa.getText());
                empresa.setDireccion(txtdireccionempresa.getText());
                empresa.setTelefono(txttelefonoempresa.getText());
                empresa.setEmail(txtemailempresa.getText());

                boolean estado = eucc.editarEmpresa(empresa);
                int editar = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (editar == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se edito correctamente ¡¡¡");
                    } else {
                        JOptionPane.showConfirmDialog(this, "Error al editar");
                    }
                }

            } else {
                Empresa e = new Empresa();
                e.setNombreEmpresa(txtnombreempresa.getText());
                e.setDireccion(txtdireccionempresa.getText());
                e.setTelefono(txttelefonoempresa.getText());
                e.setEmail(txtemailempresa.getText());
                boolean estado = eucc.guardarEmpresa(e);
                int guardar = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios ?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (guardar == JOptionPane.YES_OPTION) {
                    if (estado == true) {
                        JOptionPane.showMessageDialog(this, "Se guardo correctamente");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar");
                    }
                }
            }

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdireccionempresa;
    private javax.swing.JTextField txtemailempresa;
    private javax.swing.JTextField txtnombreempresa;
    private javax.swing.JTextField txttelefonoempresa;
    // End of variables declaration//GEN-END:variables
}
