package CRUD_Veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class cargo_vista extends javax.swing.JFrame {

    conexion con = new conexion();
    Metodos me = new Metodos();

    public cargo_vista() {
        initComponents();
        mostrardatos();
        configurarSegunRol(Sesion.rolActual);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        txt_nombre_cargo = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        txt_nom_emplea = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_ident_emplea = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_cargo = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 56, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 248, 240))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1246, 597));

        jPanel2.setBackground(new java.awt.Color(255, 248, 240));

        txt_id.setEditable(false);
        txt_id.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));

        txt_nombre_cargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Cargo"));

        txt_sueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo"));
        txt_sueldo.setMinimumSize(new java.awt.Dimension(65, 43));

        txt_nom_emplea.setEditable(false);
        txt_nom_emplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Empleado"));
        txt_nom_emplea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nom_empleaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nom_empleaFocusLost(evt);
            }
        });
        txt_nom_emplea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_empleaActionPerformed(evt);
            }
        });

        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_ident_emplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Identidad del Empleado"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_ident_emplea, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nom_emplea, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ident_emplea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_nom_emplea, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 248, 240));

        jtable_cargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id del cargo", "Cargo", "Sueldo", "Empleado"
            }
        ));
        jtable_cargo.setToolTipText("");
        jtable_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_cargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_cargo);

        txt_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa nombre del Cargo  o ID"));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nom_empleaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_empleaFocusGained

    private void txt_nom_empleaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_empleaFocusLost

    private void txt_nom_empleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_empleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_empleaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String busqueda = txt_buscar.getText().trim();
        me.limpiarCampos(txt_buscar, txt_id, txt_ident_emplea, txt_nom_emplea, txt_nombre_cargo, txt_sueldo);
        btn_registrar.setEnabled(true);
        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un nombre o ID de Cargo para buscar.");
            mostrardatos();
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cargo");
        modelo.addColumn("Cargo");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Empleado");
        String query = "SELECT c.id_cargo, c.cargo, c.sueldo, c.id_empleado FROM cargo c WHERE c.cargo LIKE ? OR c.id_cargo LIKE ?";
        boolean hayResultados = false;

        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query);) {
            ps.setString(1, "%" + busqueda + "%");
            ps.setString(2, "%" + busqueda + "%");

            try ( ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    hayResultados = true;
                    Object[] fila = new Object[4];
                    fila[0] = rs.getInt("id_cargo");
                    fila[1] = rs.getString("cargo");
                    fila[2] = rs.getInt("sueldo");
                    fila[3] = rs.getString("id_empleado");
                    modelo.addRow(fila);
                }
            }
            jtable_cargo.setModel(modelo);

            if (!hayResultados) {
                mostrardatos();
                JOptionPane.showMessageDialog(this, "No se encontraron resultados. Mostrando todas los Clientes.");
                me.limpiarCampos(txt_buscar);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar: ");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        if (txt_ident_emplea.getText().trim().isEmpty() || txt_sueldo.getText().trim().isEmpty() || txt_nombre_cargo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }
        String query1 = ("SELECT id_empleado FROM empleado WHERE identidad = ?");
        try ( Connection cn = con.Conectar();  PreparedStatement ps1 = cn.prepareStatement(query1);) {
            ps1.setString(1, txt_ident_emplea.getText());

            try ( ResultSet rs = ps1.executeQuery();) {
                if (rs.next()) {
                    int idEmpleado = rs.getInt("id_empleado");

                    // 2. Insertar el cargo con el id_empleado obtenido
                    String query2 = "INSERT INTO cargo (cargo, sueldo, id_empleado) VALUES (?, ?, ?)";

                    try ( PreparedStatement ps2 = cn.prepareStatement(query2);) {
                        ps2.setString(1, txt_nombre_cargo.getText());
                        ps2.setString(2, txt_sueldo.getText());
                        ps2.setInt(3, idEmpleado);
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Cargo registrado correctamente.");
                        me.limpiarCampos(txt_ident_emplea, txt_nom_emplea, txt_nombre_cargo, txt_sueldo);
                        mostrardatos();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontro el Empleado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar cargo: ");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idebtEmple = txt_ident_emplea.getText();
        String query = "SELECT nombre FROM empleado WHERE identidad = ?";
        try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query);) {
            ps.setString(1, idebtEmple);

            try ( ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    txt_nom_emplea.setText(rs.getString("nombre"));
                    me.limpiarCampos(txt_id, txt_nombre_cargo, txt_sueldo);
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente no encontrado, tienes que registrarlo");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al buscar el Empleado:\n" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        btn_registrar.setEnabled(true);

        if (txt_id.getText().trim().isEmpty() || txt_ident_emplea.getText().trim().isEmpty() || txt_sueldo.getText().trim().isEmpty() || txt_nombre_cargo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }
        // 1. Buscar el ID del empleado por identidad
        String query1 = "SELECT id_empleado FROM empleado WHERE identidad = ?";
        try ( Connection cn = con.Conectar();  PreparedStatement ps1 = cn.prepareStatement(query1);) {

            ps1.setString(1, txt_ident_emplea.getText());

            try ( ResultSet rs = ps1.executeQuery();) {
                if (rs.next()) {
                    int idEmpleado = rs.getInt("id_empleado");
                    // 2. Hacer el UPDATE del cargo
                    String query2 = "UPDATE cargo SET cargo = ?, sueldo = ?, id_empleado = ? WHERE id_cargo = ?";
                    try ( PreparedStatement ps2 = cn.prepareStatement(query2);) {
                        ps2.setString(1, txt_nombre_cargo.getText());
                        ps2.setString(2, txt_sueldo.getText());
                        ps2.setInt(3, idEmpleado);
                        ps2.setInt(4, Integer.parseInt(txt_id.getText()));

                        int filasAfectadas = ps2.executeUpdate();

                        if (filasAfectadas > 0) {
                            JOptionPane.showMessageDialog(this, "Cargo actualizado correctamente.");
                            me.limpiarCampos(txt_nombre_cargo, txt_sueldo, txt_id, txt_ident_emplea, txt_nom_emplea);
                            mostrardatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo actualizar el cargo.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el empleado con la identidad ingresada.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el cargo.");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jtable_cargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_cargoMouseClicked
        // TODO add your handling code here:

        btn_registrar.setEnabled(false);

        int fila = this.jtable_cargo.getSelectedRow();

        if (fila >= 0) {
            String idCargo = this.jtable_cargo.getValueAt(fila, 0).toString();
            String nombreCargo = this.jtable_cargo.getValueAt(fila, 1).toString();
            String sueldo = this.jtable_cargo.getValueAt(fila, 2).toString();
            String idEmpleado = this.jtable_cargo.getValueAt(fila, 3).toString();

            this.txt_id.setText(idCargo);
            this.txt_nombre_cargo.setText(nombreCargo);
            this.txt_sueldo.setText(sueldo);

            String query = "SELECT identidad, nombre FROM empleado WHERE id_empleado = ?";

            try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

                ps.setString(1, idEmpleado);

                try ( ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String identidad = rs.getString("identidad");
                        String nombreEmpleado = rs.getString("nombre");

                        this.txt_ident_emplea.setText(identidad);
                        this.txt_nom_emplea.setText(nombreEmpleado);
                        btn_registrar.setEnabled(true);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al buscar empleado.");
            }
        }
    }//GEN-LAST:event_jtable_cargoMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        String idCargo = txt_id.getText();

        if (idCargo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona un cargo para eliminar.");
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este cargo?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            String query = "DELETE FROM cargo WHERE id_cargo = ?";

            try ( Connection cn = con.Conectar();  PreparedStatement ps = cn.prepareStatement(query)) {

                ps.setInt(1, Integer.parseInt(idCargo));

                int filasAfectadas = ps.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Cargo eliminado correctamente.");
                    me.limpiarCampos(txt_ident_emplea, txt_nom_emplea, txt_nombre_cargo, txt_sueldo, txt_id);
                    mostrardatos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el cargo.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al eliminar el cargo.");
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(cargo_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cargo_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cargo_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cargo_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cargo_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtable_cargo;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_ident_emplea;
    private javax.swing.JTextField txt_nom_emplea;
    private javax.swing.JTextField txt_nombre_cargo;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cargo");
        modelo.addColumn("Cargo");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Empleado");

        jtable_cargo.setModel(modelo);

        String consultasql = "SELECT c.id_cargo, c.cargo, c.sueldo, p.id_empleado FROM cargo c JOIN empleado p ON c.id_empleado = p.id_empleado";

        try ( Connection cn = con.Conectar();  Statement st = cn.createStatement();  ResultSet rs = st.executeQuery(consultasql)) {
            while (rs.next()) {
                String[] data = new String[4];
                data[0] = rs.getString(1); // nombre del cliente
                data[1] = rs.getString(2); // nombre del cliente
                data[2] = rs.getString(3); // id_mascota
                data[3] = rs.getString(4); // nombre
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + e.getMessage());
        }
    }

    private void configurarSegunRol(String rol) {
        if ((rol.equalsIgnoreCase("Veterinario")) || (rol.equalsIgnoreCase("Recepcionista"))) {
            btn_eliminar.setEnabled(false);
            // desactiva los botones que desees
        }
    }

    public JPanel getPanelCargo() {
        return jPanel1;
    }
}
