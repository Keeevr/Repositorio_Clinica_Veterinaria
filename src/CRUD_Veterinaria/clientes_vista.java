package CRUD_Veterinaria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class clientes_vista extends javax.swing.JFrame {

    conexion con = new conexion();
    Metodos me = new Metodos();

    public clientes_vista() {
        initComponents();
        mostrardatos();
        configurarSegunRol(Sesion.rolActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        txt_correo = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_identidad = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre_cliente = new javax.swing.JTextField();
        txt_id_cliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_datos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 56, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 248, 240))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1246, 597));
        jPanel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 248, 240));

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

        txt_correo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gmail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        txt_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        txt_identidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identidad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identidadActionPerformed(evt);
            }
        });

        txt_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        txt_nombre_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre y Apellidos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_clienteActionPerformed(evt);
            }
        });

        txt_id_cliente.setEditable(false);
        txt_id_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txt_id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_correo)
                    .addComponent(txt_direccion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_identidad, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_telefono)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_identidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 248, 240));

        txt_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa Nombre o ID"));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jtable_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre y Apellido", "Identidad", "Telefono", "Dirección", "Gmail"
            }
        ));
        jtable_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_datos);
        if (jtable_datos.getColumnModel().getColumnCount() > 0) {
            jtable_datos.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtable_datos.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtable_datos.getColumnModel().getColumn(2).setPreferredWidth(25);
            jtable_datos.getColumnModel().getColumn(3).setPreferredWidth(25);
            jtable_datos.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtable_datos.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 415, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_clienteActionPerformed

    private void txt_nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_clienteActionPerformed

    private void txt_identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identidadActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        //Se inseta con uso de otras clases
        personaDAO dao = new personaDAO();
        persona p = new persona();
        p.setNombre(txt_nombre_cliente.getText());
        p.setIdentidad(txt_identidad.getText());
        p.setTelefono(txt_telefono.getText());
        p.setDireccion(txt_direccion.getText());
        p.setCorreo(txt_correo.getText());

        if (dao.insertar(p, "cliente")) {
            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.");
            mostrardatos();
            me.limpiarCampos(txt_buscar, txt_correo, txt_direccion, txt_telefono, txt_identidad, txt_nombre_cliente, txt_id_cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar cliente.");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        // Verifica si hay un ID seleccionado
        if (txt_id_cliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila.");
            return; // sale del método
        }
        personaDAO dao = new personaDAO();
        persona p = new persona();
        p.setId_persona(Integer.parseInt(txt_id_cliente.getText()));
        p.setNombre(txt_nombre_cliente.getText());
        p.setIdentidad(txt_identidad.getText());
        p.setTelefono(txt_telefono.getText());
        p.setDireccion(txt_direccion.getText());
        p.setCorreo(txt_correo.getText());

        if (dao.actualizar(p, "cliente")) {
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.");
            mostrardatos();
            me.limpiarCampos(txt_buscar, txt_correo, txt_direccion, txt_telefono, txt_identidad, txt_nombre_cliente, txt_id_cliente);
            btn_registrar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente.");
            btn_registrar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jtable_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_datosMouseClicked
        // TODO add your handling code here:
        // Se desactiva el botón de registrar para evitar que el usuario duplique datos
        btn_registrar.setEnabled(false);

        // Se obtiene el número (índice) de la fila seleccionada
        int fila = this.jtable_datos.getSelectedRow();

        //Se crea un arreglo
        String[] datos = new String[6];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = this.jtable_datos.getValueAt(fila, i).toString();
        }
        this.txt_id_cliente.setText(datos[0]);
        this.txt_nombre_cliente.setText(datos[1]);
        this.txt_identidad.setText(datos[2]);
        this.txt_telefono.setText(datos[3]);
        this.txt_direccion.setText(datos[4]);
        this.txt_correo.setText(datos[5]);
    }//GEN-LAST:event_jtable_datosMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if (txt_id_cliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila.");
            return; // sale del método
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar este cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            personaDAO dao = new personaDAO();
            persona p = new persona();
            p.setId_persona(Integer.parseInt(txt_id_cliente.getText()));

            if (dao.eliminar(p.getId_persona(), "cliente")) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
                mostrardatos();
                me.limpiarCampos(txt_buscar, txt_correo, txt_direccion, txt_telefono, txt_identidad, txt_nombre_cliente, txt_id_cliente);
                btn_registrar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar cliente.");
                btn_registrar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String texto = txt_buscar.getText().trim();

        personaDAO dao = new personaDAO();
        jtable_datos.setModel(dao.buscar(texto, "cliente"));

        // Si no hubo resultados y no está vacío el campo de búsqueda, muestra todos los datos
        if (!dao.hayResultados) {
            mostrardatos();
            JOptionPane.showMessageDialog(this, "No se encontraron resultados. Mostrando todas los Clientes.");
            me.limpiarCampos(txt_buscar);
        }

        btn_registrar.setEnabled(true);
        me.limpiarCampos(txt_buscar, txt_correo, txt_direccion, txt_telefono, txt_identidad, txt_nombre_cliente, txt_id_cliente);
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(clientes_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtable_datos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id_cliente;
    private javax.swing.JTextField txt_identidad;
    private javax.swing.JTextField txt_nombre_cliente;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Identidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        jtable_datos.setModel(modelo);
        String query = "select * from cliente";

        Connection cn = con.Conectar();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String[] fila = new String[6];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                modelo.addRow(fila);
            }
            // Limita cada columna a 200 píxeles de ancho máximo
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: ");
        }
    }
    
    private void configurarSegunRol(String rol) {
        if ((rol.equalsIgnoreCase("Veterinario")) || (rol.equalsIgnoreCase("Recepcionista"))) {
            btn_eliminar.setEnabled(false);
            // desactiva los botones que desees
        }
    }

    //envia el panel a mostrar
    public JPanel getPanelClientes() {
        return jPanel1;
    }
}
