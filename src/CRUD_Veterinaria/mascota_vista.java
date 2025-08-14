package CRUD_Veterinaria;

import java.sql.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class mascota_vista extends javax.swing.JFrame {

    conexion con = new conexion();
    Metodos me = new Metodos();

    public mascota_vista() {
        initComponents();
        mostrardatos();
        configurarSegunRol(Sesion.rolActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar_cliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtid_mascota = new javax.swing.JTextField();
        txtnombre_cliente = new javax.swing.JTextField();
        txtnombre_mascota = new javax.swing.JTextField();
        txtraza = new javax.swing.JTextField();
        txtespecie = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txtidentidad_clientes = new javax.swing.JTextField();
        combosexo = new javax.swing.JComboBox<>();
        jdcfecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();
        txtbuscar_mascota = new javax.swing.JTextField();
        btnbuscar_mascota = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(106, 56, 56));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro e Historial de Mascotas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 248, 240))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1246, 597));

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnbuscar_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar_cliente.setText("Buscar");
        btnbuscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_clienteActionPerformed(evt);
            }
        });

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtid_mascota.setEditable(false);
        txtid_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));

        txtnombre_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_clienteActionPerformed(evt);
            }
        });

        txtnombre_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre de la Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_mascotaActionPerformed(evt);
            }
        });

        txtraza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazaActionPerformed(evt);
            }
        });

        txtespecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtespecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespecieActionPerformed(evt);
            }
        });

        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        txtidentidad_clientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtidentidad_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentidad_clientesActionPerformed(evt);
            }
        });

        combosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Hembra", "Macho" }));
        combosexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jdcfecha_nacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jdcfecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(txtespecie, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtraza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidentidad_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtid_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidentidad_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbuscar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtraza, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtespecie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combosexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcfecha_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 248, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);

        txtbuscar_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa Nombre o ID"));
        txtbuscar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar_mascotaActionPerformed(evt);
            }
        });

        btnbuscar_mascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar_mascota.setText("Buscar");
        btnbuscar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_mascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbuscar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_clienteActionPerformed
        String identidad = txtidentidad_clientes.getText();
        String query = "SELECT nombre FROM cliente WHERE identidad = ?";

        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, identidad);

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    txtnombre_cliente.setText(rs.getString("nombre"));
                    me.limpiarCampos(txtespecie, txtnombre_mascota, txtraza, txtid_mascota);
                    me.limpiarComboBox(combosexo);
                    me.limpiarDateChooser(jdcfecha_nacimiento);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado, tienes que registrarlo");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al buscar el cliente:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscar_clienteActionPerformed

    private void txtnombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_clienteActionPerformed

    private void txtnombre_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_mascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_mascotaActionPerformed

    private void txtrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrazaActionPerformed

    private void txtespecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtespecieActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // Obtener la fecha del JDateChooser
        java.util.Date fechaUtil = jdcfecha_nacimiento.getDate();

        if (fechaUtil == null
                || txtespecie.getText().trim().isEmpty()
                || txtidentidad_clientes.getText().trim().isEmpty()
                || txtraza.getText().trim().isEmpty()
                || txtnombre_mascota.getText().trim().isEmpty()
                || combosexo.getSelectedItem().toString().equals("Seleccionar")) {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }

        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        try ( Connection cn = con.Conectar();  PreparedStatement ps1 = cn.prepareStatement("SELECT id_cliente FROM cliente WHERE identidad = ?")) {

            ps1.setString(1, txtidentidad_clientes.getText());

            try ( ResultSet rs = ps1.executeQuery()) {
                if (rs.next()) {
                    int idCliente = rs.getInt("id_cliente");

                    String query2 = "INSERT INTO mascota (nombre, especie, raza, fecha_nacimiento, sexo, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";
                    try ( PreparedStatement ps2 = cn.prepareStatement(query2)) {
                        ps2.setString(1, txtnombre_mascota.getText());
                        ps2.setString(2, txtespecie.getText());
                        ps2.setString(3, txtraza.getText());
                        ps2.setDate(4, fechaSQL);
                        ps2.setString(5, combosexo.getSelectedItem().toString());
                        ps2.setInt(6, idCliente);
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Mascota registrada correctamente.");
                        me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtid_mascota, txtnombre_mascota, txtespecie, txtraza);
                        me.limpiarDateChooser(jdcfecha_nacimiento);
                        me.limpiarComboBox(combosexo);
                        mostrardatos();
                    }
                } else {
                    int resp = JOptionPane.showConfirmDialog(this, "No se encontró un empleado con esa identidad. ¿Deseas registrarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                    if (resp == JOptionPane.YES_OPTION) {
                        new empleado_vista().setVisible(true);
                        this.dispose();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar mascota: ");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtidentidad_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentidad_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentidad_clientesActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        btnregistrar.setEnabled(true);

        if (jdcfecha_nacimiento.getDate() == null
                || txtespecie.getText().trim().isEmpty()
                || txtidentidad_clientes.getText().trim().isEmpty()
                || txtraza.getText().trim().isEmpty()
                || txtnombre_mascota.getText().trim().isEmpty()
                || combosexo.getSelectedItem().toString().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }

        java.util.Date fechaUtil = jdcfecha_nacimiento.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        try ( Connection cn = con.Conectar();  PreparedStatement ps1 = cn.prepareStatement("SELECT id_cliente FROM cliente WHERE identidad = ?")) {

            ps1.setString(1, txtidentidad_clientes.getText());

            try ( ResultSet rs = ps1.executeQuery()) {
                if (rs.next()) {
                    int idCliente = rs.getInt("id_cliente");

                    String query2 = "UPDATE mascota SET nombre = ?, especie = ?, raza = ?, fecha_nacimiento = ?, sexo = ?, id_cliente = ? WHERE id_mascota = ?";
                    try ( PreparedStatement ps2 = cn.prepareStatement(query2)) {
                        ps2.setString(1, txtnombre_mascota.getText());
                        ps2.setString(2, txtespecie.getText());
                        ps2.setString(3, txtraza.getText());
                        ps2.setDate(4, fechaSQL);
                        ps2.setString(5, combosexo.getSelectedItem().toString());
                        ps2.setInt(6, idCliente);
                        ps2.setString(7, txtid_mascota.getText());

                        int filasAfectadas = ps2.executeUpdate();

                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(this, "Mascota actualizada correctamente.");
                            me.limpiarCampos(txtidentidad_clientes, txtnombre_cliente, txtnombre_mascota, txtespecie, txtraza, txtid_mascota);
                            me.limpiarDateChooser(jdcfecha_nacimiento);
                            me.limpiarComboBox(combosexo);
                            mostrardatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo actualizar la Mascota.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el cliente con la identidad ingresada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar la mascota.");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked

        // Activar/desactivar botones
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);

        int fila = this.jtabledatos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.");
            return;
        }

        // Obtener valores de la fila
        String[] datos = new String[8];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = this.jtabledatos.getValueAt(fila, i).toString();
        }

        // Asignar a los campos
        this.txtid_mascota.setText(datos[0]);
        this.txtnombre_mascota.setText(datos[1]);
        this.txtidentidad_clientes.setText(datos[2]);
        this.txtnombre_cliente.setText(datos[3]);
        this.txtespecie.setText(datos[4]);
        this.txtraza.setText(datos[5]);
        this.combosexo.setSelectedItem(datos[7]);

        // Convertir fecha si está presente
        if (!datos[6].equals("No especificada")) {
            try {
                this.jdcfecha_nacimiento.setDate(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(datos[6]));
            } catch (ParseException e) {
                this.jdcfecha_nacimiento.setDate(null);
                JOptionPane.showMessageDialog(this, "Error al cargar la fecha.");
            }
        } else {
            this.jdcfecha_nacimiento.setDate(null);
        }

        String query = "SELECT identidad FROM cliente WHERE id_cliente = ?";

        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, datos[2]); // ← ID del cliente

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    this.txtidentidad_clientes.setText(rs.getString("identidad"));
                } else {
                    this.txtidentidad_clientes.setText("");
                    JOptionPane.showMessageDialog(this, "Identidad del cliente no encontrada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar identidad del cliente.");
        }
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO DE ELIMINAR LA MASCOTA?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            String query = "DELETE FROM mascota WHERE id_mascota = ?";
            try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

                ps.setString(1, txtid_mascota.getText().trim());

                int indice = ps.executeUpdate();
                if (indice > 0) {
                    mostrardatos();
                    me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtnombre_mascota, txtespecie, txtraza);
                    me.limpiarDateChooser(jdcfecha_nacimiento);
                    me.limpiarComboBox(combosexo);
                    btnregistrar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Mascota eliminada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila o la mascota no existe.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al eliminar datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar_mascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar_mascotaActionPerformed

    private void btnbuscar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_mascotaActionPerformed

        String busqueda = txtbuscar_mascota.getText().trim();
        me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtid_mascota, txtnombre_mascota, txtespecie, txtraza);
        me.limpiarDateChooser(jdcfecha_nacimiento);
        me.limpiarComboBox(combosexo);
        btnregistrar.setEnabled(true);

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un nombre o ID de mascota para buscar.");
            mostrardatos();
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Mascota");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Dueño");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");

        String query = "SELECT m.id_mascota, m.nombre, m.especie, m.raza, m.fecha_nacimiento, m.sexo, c.id_cliente, c.nombre "
                + "FROM mascota m INNER JOIN cliente c ON c.id_cliente = m.id_cliente "
                + "WHERE c.nombre LIKE ? OR CAST(m.id_mascota AS CHAR) LIKE ?";

        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, "%" + busqueda + "%");
            ps.setString(2, "%" + busqueda + "%");

            try ( ResultSet rs = ps.executeQuery()) {
                boolean hayResultados = false;
                while (rs.next()) {
                    hayResultados = true;
                    Object[] fila = new Object[8];
                    fila[0] = rs.getInt("id_mascota");             // ID Mascota
                    fila[1] = rs.getString("m.nombre");               // Nombre Mascota (sin alias)
                    fila[2] = rs.getInt("id_cliente");              // ID Cliente
                    fila[3] = rs.getString("c.nombre");               // Nombre Cliente (dueño)
                    fila[4] = rs.getString("especie");              // Especie
                    fila[5] = rs.getString("raza");                 // Raza
                    fila[6] = rs.getString("fecha_nacimiento") != null ? rs.getString("fecha_nacimiento") : "No especificada";  // Fecha
                    fila[7] = rs.getString("sexo");                  // Sexo
                    modelo.addRow(fila);
                }
                jtabledatos.setModel(modelo);

                if (!hayResultados) {
                    mostrardatos();
                    JOptionPane.showMessageDialog(this, "No se encontraron resultados. Mostrando todas las Mascotas.");
                    me.limpiarCampos(txtbuscar_mascota);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar");
        }
    }//GEN-LAST:event_btnbuscar_mascotaActionPerformed

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
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mascota_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar_cliente;
    private javax.swing.JButton btnbuscar_mascota;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> combosexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdcfecha_nacimiento;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtbuscar_mascota;
    private javax.swing.JTextField txtespecie;
    private javax.swing.JTextField txtid_mascota;
    private javax.swing.JTextField txtidentidad_clientes;
    private javax.swing.JTextField txtnombre_cliente;
    private javax.swing.JTextField txtnombre_mascota;
    private javax.swing.JTextField txtraza;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Mascota");
        modelo.addColumn("ID Cliente");  // corregí "Cliete"
        modelo.addColumn("Dueño");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");

        jtabledatos.setModel(modelo);

        String consultasql = "SELECT m.id_mascota, m.nombre, c.id_cliente, c.nombre, "
                + "m.especie, m.raza, m.fecha_nacimiento, m.sexo "
                + "FROM mascota m "
                + "INNER JOIN cliente c ON c.id_cliente = m.id_cliente";

        try ( Connection cn = con.Conectar();  Statement st = cn.createStatement();  ResultSet rs = st.executeQuery(consultasql)) {

            while (rs.next()) {
                String[] data = new String[8];
                data[0] = rs.getString("id_mascota");
                data[1] = rs.getString("nombre");
                data[2] = rs.getString("id_cliente");    // ID cliente
                data[3] = rs.getString("nombre");         // Dueño
                data[4] = rs.getString("especie");
                data[5] = rs.getString("raza");
                data[6] = rs.getString("fecha_nacimiento") != null ? rs.getString("fecha_nacimiento") : "No especificada";
                data[7] = rs.getString("sexo");
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + e.getMessage());
        }
    }

    private void configurarSegunRol(String rol) {
        if ((rol.equalsIgnoreCase("Veterinario")) || (rol.equalsIgnoreCase("Recepcionista"))) {
            btneliminar.setEnabled(false);
            // desactiva los botones que desees
        }
    }

    public JPanel getPanelMascotas() {
        return jPanel2;
    }
}
