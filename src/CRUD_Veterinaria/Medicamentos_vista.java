package CRUD_Veterinaria;

import java.sql.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//

public class Medicamentos_vista extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cn = con.Conectar();
    Metodos me = new Metodos();

    public Medicamentos_vista() {
        initComponents();
        mostrardatos();
        configurarSegunRol(Sesion.rolActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnombre_medicamento = new javax.swing.JTextField();
        txtprecio_unitario = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txt_id_medicamentos = new javax.swing.JTextField();
        jdcfecha_caducacion = new com.toedter.calendar.JDateChooser();
        btneliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_datos = new javax.swing.JTable();
        txt_buscar_medicamento = new javax.swing.JTextField();
        btn_buscar_medicamento = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(106, 56, 56));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro e Historial de Medicamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 248, 240))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1246, 597));

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 470, 10));

        txtnombre_medicamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre del Medicamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_medicamentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre_medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 470, 65));

        txtprecio_unitario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Unitario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtprecio_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_unitarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 470, 60));

        txtcantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 470, 60));

        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 50));

        btnactualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 150, 50));

        txt_id_medicamentos.setEditable(false);
        txt_id_medicamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID MEDICAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txt_id_medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_medicamentosActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id_medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 65));

        jdcfecha_caducacion.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CADUCACION"));
        jPanel1.add(jdcfecha_caducacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 470, 70));

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 135, 50));

        jPanel3.setBackground(new java.awt.Color(255, 248, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtable_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_datos);

        txt_buscar_medicamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa Nombre o ID"));
        txt_buscar_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_medicamentoActionPerformed(evt);
            }
        });

        btn_buscar_medicamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_buscar_medicamento.setText("Buscar");
        btn_buscar_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_medicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_buscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
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

    private void txtnombre_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_medicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_medicamentoActionPerformed

    private void txtprecio_unitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_unitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_unitarioActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // Obtener la fecha del JDateChooser
        java.util.Date fechaUtil = jdcfecha_caducacion.getDate();
        if (fechaUtil == null
                || txtnombre_medicamento.getText().trim().isEmpty()
                || txtprecio_unitario.getText().trim().isEmpty()
                || txtcantidad.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }

        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        try {
            Double.parseDouble(txtprecio_unitario.getText().trim());
            Integer.parseInt(txtcantidad.getText().trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Precio unitario y cantidad deben ser numéricos");
            return;
        }

        String query = "INSERT INTO medicamentos ( nombre, fecha_caducacion, precio_unitario, cantidad) VALUES (?, ?, ?, ?)";
        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, txtnombre_medicamento.getText().trim());
            ps.setDate(2, fechaSQL);
            ps.setDouble(3, Double.parseDouble(txtprecio_unitario.getText().trim()));
            ps.setInt(4, Integer.parseInt(txtcantidad.getText().trim()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Medicamento registrado correctamente.");

            me.limpiarCampos(txt_id_medicamentos, txtnombre_medicamento, txtprecio_unitario, txtcantidad);
            me.limpiarDateChooser(jdcfecha_caducacion);
            mostrardatos();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar medicamento: " + e.getMessage());
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿ESTÁS SEGURO DE ELIMINAR EL MEDICAMENTO?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            String query = "DELETE FROM medicamentos WHERE id_medicamento = ?";
            try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

                ps.setString(1, txt_id_medicamentos.getText());

                int indice = ps.executeUpdate();
                if (indice > 0) {
                    mostrardatos();
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila");
                }

                me.limpiarCampos(txt_id_medicamentos, txtnombre_medicamento, txtcantidad, txtprecio_unitario);
                me.limpiarDateChooser(jdcfecha_caducacion);
                btnregistrar.setEnabled(true);

            } catch (SQLException e) {
                System.out.println("Error al eliminar datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        btnregistrar.setEnabled(true);

        java.util.Date fechaUtil = jdcfecha_caducacion.getDate();

        if (fechaUtil == null
                || txt_id_medicamentos.getText().trim().isEmpty()
                || txtnombre_medicamento.getText().trim().isEmpty()
                || txtcantidad.getText().trim().isEmpty()
                || txtprecio_unitario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        String query = "UPDATE medicamentos SET nombre = ?, fecha_caducacion = ?, precio_unitario = ?, cantidad = ? WHERE id_medicamento = ?";

        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, txtnombre_medicamento.getText().trim());
            ps.setDate(2, fechaSQL);
            ps.setString(3, txtprecio_unitario.getText().trim());
            ps.setString(4, txtcantidad.getText().trim());
            ps.setString(5, txt_id_medicamentos.getText().trim());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Medicamento actualizado correctamente.");
                // Limpiar campos si deseas
                me.limpiarCampos(txt_id_medicamentos, txtnombre_medicamento, txtprecio_unitario, txtcantidad);
                me.limpiarDateChooser(jdcfecha_caducacion);
                mostrardatos(); //método para limpiar tablas
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el medicamento. Verifica el ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el medicamento.");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txt_id_medicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_medicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_medicamentosActionPerformed

    private void jtable_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_datosMouseClicked

        // Activar/desactivar botones
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);

        if (Sesion.rolActual.equals("Recepcionista") || (Sesion.rolActual.equals("Veterinario"))) {
            btneliminar.setEnabled(false);
        }

        int fila = this.jtable_datos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.");
            return;
        }

        // Obtener valores de la fila
        String[] datos = new String[5];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = this.jtable_datos.getValueAt(fila, i).toString();
        }

        // Asignar a los campos
        this.txt_id_medicamentos.setText(datos[0]);
        this.txtnombre_medicamento.setText(datos[1]);
        this.txtprecio_unitario.setText(datos[3]);
        this.txtcantidad.setText(datos[4]);

        // Convertir fecha si está presente
        if (!datos[2].equals("No especificada")) {
            try {
                this.jdcfecha_caducacion.setDate(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(datos[2]));
            } catch (ParseException e) {
                this.jdcfecha_caducacion.setDate(null);
                JOptionPane.showMessageDialog(this, "Error al cargar la fecha.");
            }
        } else {
            this.jdcfecha_caducacion.setDate(null);
        }

    }//GEN-LAST:event_jtable_datosMouseClicked

    private void txt_buscar_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_medicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar_medicamentoActionPerformed

    private void btn_buscar_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_medicamentoActionPerformed

        String busqueda = txt_buscar_medicamento.getText().trim();
        me.limpiarCampos(txtcantidad, txt_id_medicamentos, txtnombre_medicamento, txtprecio_unitario);
        me.limpiarDateChooser(jdcfecha_caducacion);
        btnregistrar.setEnabled(true);

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un nombre o ID de Medicamento para buscar.");
            mostrardatos();
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Medicamento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Caducidad");
        modelo.addColumn("Precio Uni");
        modelo.addColumn("Cantidad");

        boolean hayResultados = false;

        // Asegúrate de abrir conexión dentro del try-with-resources para cerrarla automáticamente
        try ( Connection cn = con.Conectar()) {
            if (busqueda.matches("\\d+")) {
                // Buscar por ID exacto
                String query = "SELECT m.id_medicamento, m.nombre, m.fecha_caducacion, m.precio_unitario, m.cantidad "
                        + "FROM medicamentos m WHERE m.id_medicamento = ?";
                try ( PreparedStatement ps = cn.prepareStatement(query)) {
                    ps.setInt(1, Integer.parseInt(busqueda));
                    try ( ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            hayResultados = true;
                            Object[] fila = new Object[5];
                            fila[0] = rs.getInt("id_medicamento");
                            fila[1] = rs.getString("nombre");
                            fila[2] = rs.getString("fecha_caducacion") != null ? rs.getString("fecha_caducacion") : "No especificada";
                            fila[3] = rs.getString("precio_unitario");
                            fila[4] = rs.getString("cantidad");
                            modelo.addRow(fila);
                        }
                    }
                }
            } else {
                // Buscar por nombre parcial
                String query = "SELECT m.id_medicamento, m.nombre, m.fecha_caducacion, m.precio_unitario, m.cantidad "
                        + "FROM medicamentos m WHERE m.nombre LIKE ?";
                try ( PreparedStatement ps = cn.prepareStatement(query)) {
                    ps.setString(1, "%" + busqueda + "%");
                    try ( ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            hayResultados = true;
                            Object[] fila = new Object[5];
                            fila[0] = rs.getInt("id_medicamento");
                            fila[1] = rs.getString("nombre");
                            fila[2] = rs.getString("fecha_caducacion") != null ? rs.getString("fecha_caducacion") : "No especificada";
                            fila[3] = rs.getString("precio_unitario");
                            fila[4] = rs.getString("cantidad");
                            modelo.addRow(fila);
                        }
                    }
                }
            }

            jtable_datos.setModel(modelo);

            if (!hayResultados) {
                mostrardatos();
                JOptionPane.showMessageDialog(this, "No se encontraron resultados. Mostrando todos los Medicamentos.");
                me.limpiarCampos(txt_buscar_medicamento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar");
        }
    }//GEN-LAST:event_btn_buscar_medicamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicamentos_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_medicamento;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdcfecha_caducacion;
    private javax.swing.JTable jtable_datos;
    private javax.swing.JTextField txt_buscar_medicamento;
    private javax.swing.JTextField txt_id_medicamentos;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnombre_medicamento;
    private javax.swing.JTextField txtprecio_unitario;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Medicamento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Caducidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");

        jtable_datos.setModel(modelo);

        String query = "SELECT m.id_medicamento, m.nombre, m.fecha_caducacion, m.precio_unitario, m.cantidad FROM medicamentos m";

        try ( Connection cn = con.Conectar();  Statement st = cn.createStatement();  ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                String[] data = new String[5];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
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

    public JPanel getPanelMedicamentos() {
        return jPanel2;
    }
}
