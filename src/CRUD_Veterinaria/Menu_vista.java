package CRUD_Veterinaria;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Menu_vista extends javax.swing.JFrame {

    Contenedor_Principal cp = new Contenedor_Principal();

    public Menu_vista() {
        super("Menu Principal");
        setResizable(false);
        initComponents();
        configurarSegunRol(Sesion.rolActual); // aquí usamos el rol guardado
        setLocationRelativeTo(null);
        btn_factura_historial.setText("<html><center>HISTORIAL<br>DE FACURAS</center></html>");
        btn_historial_consulta.setText("<html><center>HISTORIAL<br>DE CONSULTAS</center></html>");
        btn_Citas.setText("<html><center>REGISTRO<br>DE CITAS</center></html>");
        btn_factura.setText("<html><center>FACTURA</center></html>");
        btn_cargo.setText("<html><center>CARGO</center></html>");
        btn_empleados.setText("<html><center>EMPLEADO</center></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JButton();
        btn_cargo = new javax.swing.JButton();
        btn_empleados = new javax.swing.JButton();
        btn_mascotas = new javax.swing.JButton();
        btn_Medicamentos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel_contenedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Citas = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_factura_historial = new javax.swing.JButton();
        btn_historial_consulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(162, 91, 91));

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));

        btn_clientes.setText("CLIENTES");
        btn_clientes.setBackground(new java.awt.Color(74, 33, 33));
        btn_clientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(255, 248, 240));
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_cargo.setText("CARGO");
        btn_cargo.setBackground(new java.awt.Color(74, 33, 33));
        btn_cargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cargo.setForeground(new java.awt.Color(255, 248, 240));
        btn_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargoActionPerformed(evt);
            }
        });

        btn_empleados.setText("EMPLEADOS");
        btn_empleados.setBackground(new java.awt.Color(74, 33, 33));
        btn_empleados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_empleados.setForeground(new java.awt.Color(255, 248, 240));
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });

        btn_mascotas.setText("MASCOTAS");
        btn_mascotas.setBackground(new java.awt.Color(74, 33, 33));
        btn_mascotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_mascotas.setForeground(new java.awt.Color(255, 248, 240));
        btn_mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mascotasActionPerformed(evt);
            }
        });

        btn_Medicamentos.setText("MEDICAMENTOS");
        btn_Medicamentos.setBackground(new java.awt.Color(74, 33, 33));
        btn_Medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Medicamentos.setForeground(new java.awt.Color(255, 248, 240));
        btn_Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MedicamentosActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Salir.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btn_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_Medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
        );

        panel_contenedor.setBackground(new java.awt.Color(255, 51, 255));
        panel_contenedor.setPreferredSize(new java.awt.Dimension(1246, 597));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("v1.0.0");
        panel_contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo_Veterinaria.png"))); // NOI18N
        panel_contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 248, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Menu.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btn_Citas.setBackground(new java.awt.Color(74, 33, 33));
        btn_Citas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Citas.setForeground(new java.awt.Color(255, 248, 240));
        btn_Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CitasActionPerformed(evt);
            }
        });

        btn_factura.setText("FACTURA");
        btn_factura.setBackground(new java.awt.Color(74, 33, 33));
        btn_factura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_factura.setForeground(new java.awt.Color(255, 248, 240));
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        btn_factura_historial.setBackground(new java.awt.Color(74, 33, 33));
        btn_factura_historial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_factura_historial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_factura_historial.setForeground(new java.awt.Color(255, 248, 240));
        btn_factura_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factura_historialActionPerformed(evt);
            }
        });

        btn_historial_consulta.setBackground(new java.awt.Color(74, 33, 33));
        btn_historial_consulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_historial_consulta.setForeground(new java.awt.Color(255, 248, 240));
        btn_historial_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historial_consultaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Cerrar Sesion.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_Citas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn_historial_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btn_factura_historial, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_Citas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_historial_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_factura, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addComponent(btn_factura_historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panel_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
        clientes_vista mv = new clientes_vista();
        JPanel panelClientes = mv.getPanelClientes();
        mostrarPanel(panelClientes);
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mascotasActionPerformed
        // TODO add your handling code here:
        mascota_vista mv = new mascota_vista();
        JPanel panelMascotas = mv.getPanelMascotas();
        mostrarPanel(panelMascotas);
    }//GEN-LAST:event_btn_mascotasActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        // TODO add your handling code here:
        factura_Vista mv = new factura_Vista();
        JPanel panelFactura = mv.getPanelFactura();
        mostrarPanel(panelFactura);

    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        // TODO add your handling code here:
        empleado_vista mv = new empleado_vista();
        JPanel panelEmpleado = mv.getPanelEmpleado();
        mostrarPanel(panelEmpleado);

    }//GEN-LAST:event_btn_empleadosActionPerformed

    private void btn_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargoActionPerformed
        // TODO add your handling code here:
        cargo_vista mv = new cargo_vista();
        JPanel panelCargo = mv.getPanelCargo();
        mostrarPanel(panelCargo);
    }//GEN-LAST:event_btn_cargoActionPerformed

    private void btn_CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CitasActionPerformed
        // TODO add your handling code here:
        Cita_Mascota_Vista mv = new Cita_Mascota_Vista();
        JPanel panelCitas = mv.getPanelCitas();
        mostrarPanel(panelCitas);
    }//GEN-LAST:event_btn_CitasActionPerformed

    private void btn_factura_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factura_historialActionPerformed
        // TODO add your handling code here:
        Historial_Factura_Vista mv = new Historial_Factura_Vista();
        JPanel panelFactura_histo = mv.getPanelHistorial_Factura();
        mostrarPanel(panelFactura_histo);
    }//GEN-LAST:event_btn_factura_historialActionPerformed

    private void btn_historial_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historial_consultaActionPerformed
        // TODO add your handling code here:
        Historial_Consulta_Vista mv = new Historial_Consulta_Vista();
        JPanel panelHistorialConsulta = mv.getPanelHistorial();
        mostrarPanel(panelHistorialConsulta);
    }//GEN-LAST:event_btn_historial_consultaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        limpearContenedor();
        JPanel panelContenedorMenu = cp.getPanelContenedor();
        mostrarPanel(panelContenedorMenu);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MedicamentosActionPerformed
        // TODO add your handling code here:
        Medicamentos_vista mv = new Medicamentos_vista();
        JPanel panelMedicamentos = mv.getPanelMedicamentos();
        mostrarPanel(panelMedicamentos);
    }//GEN-LAST:event_btn_MedicamentosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login_Vista().setVisible(true);
        this.dispose();
        Sesion.rolActual = "";
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Citas;
    private javax.swing.JButton btn_Medicamentos;
    private javax.swing.JButton btn_cargo;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_factura_historial;
    private javax.swing.JButton btn_historial_consulta;
    private javax.swing.JButton btn_mascotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_contenedor;
    // End of variables declaration//GEN-END:variables

    private void configurarSegunRol(String rol) {
        if ((rol.equalsIgnoreCase("Veterinario"))) {
            btn_factura.setEnabled(false);
            btn_factura_historial.setEnabled(false);
            btn_cargo.setEnabled(false);
            btn_empleados.setEnabled(false);
        }
        if ((rol.equalsIgnoreCase("Recepcionista"))) {
            btn_cargo.setEnabled(false);
        }
    }

    public void limpearContenedor() {
        panel_contenedor.removeAll();
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
    }

    public void mostrarPanel(JPanel panel) {
        panel.setSize(panel_contenedor.getSize());
        panel.setLocation(0, 0);
        panel_contenedor.removeAll();
        panel_contenedor.setLayout(new BorderLayout());
        panel_contenedor.add(panel, BorderLayout.CENTER);
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
    }

    public JPanel getPanelMenuCon() {
        return panel_contenedor;
    }
}
