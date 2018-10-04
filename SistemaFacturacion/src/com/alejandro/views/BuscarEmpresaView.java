package com.alejandro.views;

import com.alejandro.DAO.EmpresaDao;
import com.alejandro.dominio.Empresa;
import com.alejandro.dominio.Persona;
import com.alejandro.table.EmpleadoTable;
import com.alejandro.table.EmpresaTable;
import com.alejandro.ucc.Empresaucc;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarEmpresaView extends javax.swing.JDialog {

    public BuscarEmpresaView(java.awt.Frame parent, boolean modal) {
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
        txtbuscarempresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempresas = new javax.swing.JTable();
        btncerrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR EMPRESA");

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSCAR");

        txtbuscarempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarempresaKeyReleased(evt);
            }
        });

        tablaempresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaempresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaempresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaempresas);

        btncerrar.setBackground(java.awt.SystemColor.inactiveCaption);
        btncerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.setFocusable(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btneditar.setBackground(java.awt.SystemColor.inactiveCaption);
        btneditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.setFocusable(false);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(java.awt.SystemColor.inactiveCaption);
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setFocusable(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.SystemColor.inactiveCaption);
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("NUEVO EMPLEADO");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btneditar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btncerrar)
                        .addGap(116, 116, 116))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar)
                    .addComponent(btncerrar))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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
            EmpresaTable empresaTable = (EmpresaTable) tablaempresas.getModel();
            Empresa empresa = empresaTable.getFilas().get(tablaempresas.getSelectedRow());
            EmpresaView ev = new EmpresaView((Frame) this.getParent(), true, empresa);
            ev.setVisible(true);
            txtbuscarempresaKeyReleased(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Esciba en la opcion bhuscar y seleccione");

        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void txtbuscarempresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarempresaKeyReleased
        EmpresaDao ed = new EmpresaDao(null);
        List<Empresa> empresas = ed.buscarPorCriterio(txtbuscarempresa.getText());
        EmpresaTable empresaTable = new EmpresaTable(empresas);
        tablaempresas.setModel(empresaTable);
    }//GEN-LAST:event_txtbuscarempresaKeyReleased

    private void tablaempresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaempresasMouseClicked

    }//GEN-LAST:event_tablaempresasMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            EmpresaTable empresaTable = (EmpresaTable) tablaempresas.getModel();
            Empresa empresa = empresaTable.getFilas().get(tablaempresas.getSelectedRow());
            Empresaucc empresaucc = new Empresaucc();
            boolean eliminar = empresaucc.deleteEmpresa(empresa);
            int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar este registro", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(this, "Se elimino el registro correctamente");
                    txtbuscarempresaKeyReleased(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EmpresaTable empresaTable = (EmpresaTable) tablaempresas.getModel();
            //elegir cual esta seleccionado en la tabla
            Empresa empresa = empresaTable.getFilas().get(tablaempresas.getSelectedRow());
            EmpleadoView ev = new EmpleadoView((Frame) this.getParent(), true, empresa, null);
            ev.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba en la opcion buscar y seleccione a la persona q va a agregar un nuevo vehiculo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempresas;
    private javax.swing.JTextField txtbuscarempresa;
    // End of variables declaration//GEN-END:variables
}
