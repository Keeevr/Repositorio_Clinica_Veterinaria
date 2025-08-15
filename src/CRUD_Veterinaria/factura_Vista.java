package CRUD_Veterinaria;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class factura_Vista extends javax.swing.JFrame {

    //nombre del cliente y txt buscar cliente
    DefaultComboBoxModel<String> modeloClientes = new DefaultComboBoxModel<>();
    //nombre del empleado y txt buscar empleado
    DefaultComboBoxModel<String> modeloEmpleados = new DefaultComboBoxModel<>();
    //conexion
    conexion con = new conexion();
    Metodos me = new Metodos();

    public factura_Vista() {
        initComponents();
        deshabilitarPanel(jPanelM);
        deshabilitarPanel(jPanelP);
        mostrarNumeroFactura();
        mostrarFecha();
        placeholder();
        configurarTablaTotales();
        configurarTablaProductos();
        actualizarTablaTotales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelM = new javax.swing.JPanel();
        txt_diagnostico = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        combo_mascota = new javax.swing.JComboBox<>();
        combo_consulta = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanelP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_producto = new javax.swing.JTable();
        combo_producto = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        btn_agregar_producto = new javax.swing.JButton();
        txt_precio_producto = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbl_fecha = new javax.swing.JLabel();
        jbl_num_factu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_total = new javax.swing.JTable();
        btn_registrar_factura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        combo_nom_empleado = new javax.swing.JComboBox<>();
        txt_nom_empleado = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_nom_cliente = new javax.swing.JTextField();
        combo_nom_cliente = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Regreso Boton.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(106, 56, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR FACTURAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 248, 240))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1246, 597));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelM.setBackground(new java.awt.Color(255, 248, 240));
        jPanelM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_diagnostico.setEditable(false);
        txt_diagnostico.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnostico"));

        txt_fecha.setEditable(false);
        txt_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Consulta"));

        txt_precio.setEditable(false);
        txt_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio de la Consulta"));

        combo_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Mascotas"));
        combo_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_mascotaActionPerformed(evt);
            }
        });

        combo_consulta.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Consulta"));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMLayout = new javax.swing.GroupLayout(jPanelM);
        jPanelM.setLayout(jPanelMLayout);
        jPanelMLayout.setHorizontalGroup(
            jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha)
                    .addComponent(txt_precio)
                    .addGroup(jPanelMLayout.createSequentialGroup()
                        .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_consulta, javax.swing.GroupLayout.Alignment.LEADING, 0, 247, Short.MAX_VALUE)
                            .addComponent(combo_mascota, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_diagnostico, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelMLayout.setVerticalGroup(
            jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_mascota, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_diagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 390));

        jPanelP.setBackground(new java.awt.Color(255, 248, 240));
        jPanelP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtable_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(jtable_producto);

        combo_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Producto"));

        txt_cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));

        btn_agregar_producto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar_producto.setText("Agregar Producto");
        btn_agregar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_productoActionPerformed(evt);
            }
        });

        txt_precio_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        javax.swing.GroupLayout jPanelPLayout = new javax.swing.GroupLayout(jPanelP);
        jPanelP.setLayout(jPanelPLayout);
        jPanelPLayout.setHorizontalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(btn_agregar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cantidad)
                    .addComponent(combo_producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(txt_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPLayout.setVerticalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(combo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 190, -1, 390));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 248, 240));
        jCheckBox1.setText("¿Incluir Consulta?");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 248, 240));
        jCheckBox2.setText("¿Agregar productos?");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, 190, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 1234, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 150, 20, 423));

        jbl_fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_fecha.setForeground(new java.awt.Color(255, 248, 240));
        jbl_fecha.setText("Fecha:");
        jPanel1.add(jbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, -1));

        jbl_num_factu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbl_num_factu.setForeground(new java.awt.Color(255, 248, 240));
        jbl_num_factu.setText("No. Factura");
        jPanel1.add(jbl_num_factu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 248, 240));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 248, 240));

        jtable_total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Sub Total", "Impuesto", "Total"
            }
        ));
        jScrollPane2.setViewportView(jtable_total);

        btn_registrar_factura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_registrar_factura.setText("Guardar Factura");
        btn_registrar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_facturaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Imprimir - Ultima Factura Registrada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btn_registrar_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 340, 390));

        jPanel4.setBackground(new java.awt.Color(255, 248, 240));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        combo_nom_empleado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Recepcionista")));

        txt_nom_empleado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txt_nom_empleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nom_empleadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nom_empleadoFocusLost(evt);
            }
        });
        txt_nom_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_empleadoActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_nom_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txt_nom_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nom_clienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nom_clienteFocusLost(evt);
            }
        });
        txt_nom_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_clienteActionPerformed(evt);
            }
        });

        combo_nom_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Cliente"));
        combo_nom_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_nom_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(combo_nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(39, 39, 39)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(combo_nom_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nom_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_nom_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_nom_empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_nom_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1230, 90));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 150, 20, 423));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_registrar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_facturaActionPerformed
        // TODO add your handling code here:

        String idFactura = jbl_num_factu.getText().replace("No. Factura: ", "").trim();
        String fechaEmisionStr = jbl_fecha.getText().replace("Fecha: ", "").trim();
        String nombreCliente = (String) combo_nom_cliente.getSelectedItem();
        String nombreEmpleado = (String) combo_nom_empleado.getSelectedItem();

        if (idFactura.isEmpty() || fechaEmisionStr.isEmpty() || nombreCliente == null || nombreEmpleado == null) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos obligatorios.");
            return;
        }

        DefaultTableModel modeloTotales = (DefaultTableModel) jtable_total.getModel();
        if (modeloTotales.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos de total para registrar.");
            return;
        }

        double subtotal = Double.parseDouble(modeloTotales.getValueAt(0, 0).toString());
        double impuesto = 0.05;
        double total = Double.parseDouble(modeloTotales.getValueAt(0, 2).toString());

        try (Connection cn = con.Conectar()) {

            // Obtener ID del cliente
            int idCliente = -1;
            String queryCliente = "SELECT id_cliente FROM cliente WHERE nombre = ?";
            try (PreparedStatement ps = cn.prepareStatement(queryCliente)) {
                ps.setString(1, nombreCliente);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        idCliente = rs.getInt("id_cliente");
                    }
                }
            }

            if (idCliente == -1) {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                return;
            }

            // Obtener ID del empleado
            int idEmpleado = -1;
            String queryEmpleado = "SELECT id_empleado FROM empleado WHERE nombre = ?";
            try (PreparedStatement ps = cn.prepareStatement(queryEmpleado)) {
                ps.setString(1, nombreEmpleado);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        idEmpleado = rs.getInt("id_empleado");
                    }
                }
            }

            if (idEmpleado == -1) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            // Insertar en factura
            String insertFactura = "INSERT INTO factura (id_factura, fecha_emision, id_cliente, id_empleado, subtotal, impuesto, total) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = cn.prepareStatement(insertFactura)) {
                ps.setString(1, idFactura);
                ps.setDate(2, java.sql.Date.valueOf(fechaEmisionStr));
                ps.setInt(3, idCliente);
                ps.setInt(4, idEmpleado);
                ps.setDouble(5, subtotal);
                ps.setDouble(6, impuesto);
                ps.setDouble(7, total);
                ps.executeUpdate();
            }

            // Detalle de consulta
            if (jCheckBox1.isSelected()) {
                String mascota = (String) combo_mascota.getSelectedItem();
                String diagnostico = txt_diagnostico.getText().trim();
                String fechaConsultaStr = txt_fecha.getText().trim();
                double precioConsulta = Double.parseDouble(txt_precio.getText().trim());

                if (mascota == null || mascota.isEmpty() || diagnostico.isEmpty() || fechaConsultaStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos de consulta.");
                    return;
                }

                String insertConsulta = "INSERT INTO detalle_factura_consulta (id_factura, nombre_mascota, precio_consulta, diagnostico, fecha_consulta) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement ps = cn.prepareStatement(insertConsulta)) {
                    ps.setString(1, idFactura);
                    ps.setString(2, mascota);
                    ps.setDouble(3, precioConsulta);
                    ps.setString(4, diagnostico);
                    ps.setDate(5, java.sql.Date.valueOf(fechaConsultaStr));
                    ps.executeUpdate();
                }
            }

            // Detalle de productos/medicamentos
            if (jCheckBox2.isSelected()) {
                DefaultTableModel modeloProductos = (DefaultTableModel) jtable_producto.getModel();

                if (modeloProductos.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay productos para registrar.");
                    return;
                }

                for (int i = 0; i < modeloProductos.getRowCount(); i++) {
                    String nombreProducto = modeloProductos.getValueAt(i, 0).toString();
                    int cantidad = Integer.parseInt(modeloProductos.getValueAt(i, 1).toString());
                    double precioUnitario = Double.parseDouble(modeloProductos.getValueAt(i, 2).toString());
                    double subtotalProducto = Double.parseDouble(modeloProductos.getValueAt(i, 3).toString());

                    // Obtener id del medicamento
                    int idMedicamento = -1;
                    String queryMedicamento = "SELECT id_medicamento FROM medicamentos WHERE nombre = ?";
                    try (PreparedStatement ps = cn.prepareStatement(queryMedicamento)) {
                        ps.setString(1, nombreProducto);
                        try (ResultSet rs = ps.executeQuery()) {
                            if (rs.next()) {
                                idMedicamento = rs.getInt("id_medicamento");
                            }
                        }
                    }

                    if (idMedicamento == -1) {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado: " + nombreProducto);
                        return;
                    }

                    // Insertar en detalle_factura_medicamento
                    String insertDetalleMedicamento = "INSERT INTO detalle_factura_medicamento (id_factura, id_medicamento, cantidad, precio_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";
                    try (PreparedStatement ps = cn.prepareStatement(insertDetalleMedicamento)) {
                        ps.setString(1, idFactura);
                        ps.setInt(2, idMedicamento);
                        ps.setInt(3, cantidad);
                        ps.setDouble(4, precioUnitario);
                        ps.setDouble(5, subtotalProducto);
                        ps.executeUpdate();
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Factura registrada correctamente.");
            mostrarNumeroFactura(); // Actualiza para la próxima factura

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar la factura.");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use yyyy-MM-dd.");
        }
    }//GEN-LAST:event_btn_registrar_facturaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        //Bloque para Habilitar Panel de Consulta y sus Componetes
        if (jCheckBox1.isSelected()) {
            habilitarPanel(jPanelM);
        } else {
            deshabilitarPanel(jPanelM);
            me.vaciarComboBox(combo_mascota, combo_consulta);
            me.limpiarCampos(txt_diagnostico, txt_precio, txt_fecha);
            actualizarTablaTotales(); // Actualiza totales si aún hay productos

            // Solo limpiar tabla total si productos también están desactivados
            if (!jCheckBox2.isSelected()) {
                actualizarTablaTotales();
            }
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        //Bloque para Habilitar Panel de Productos y sus Componetes
        if (jCheckBox2.isSelected()) {
            habilitarPanel(jPanelP);
            cargarProductosEnCombo();
        } else {
            deshabilitarPanel(jPanelP);
            me.vaciarComboBox(combo_producto);
            me.limpiarCampos(txt_cantidad);
            // Limpiar tabla de productos
            configurarTablaProductos();

            txt_precio_producto.setText("");

            actualizarTablaTotales();

            // Solo limpiar tabla total si consultas también están desactivadas
            if (!jCheckBox1.isSelected()) {
                actualizarTablaTotales();
            }
        }

    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void combo_nom_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nom_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nom_clienteActionPerformed

    private void txt_nom_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_clienteActionPerformed

    private void txt_nom_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_empleadoActionPerformed

    private void txt_nom_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_clienteFocusGained
        // TODO add your handling code here:
        //este bloque mira que en el (txt_nom_cliente) se encuentre (Buscar cliente...) y si es asi lo borra
        if (txt_nom_cliente.getText().equals("Buscar cliente...")) {
            //Vacia la caja de texto(txt_nom_cliente)
            txt_nom_cliente.setText("");
            //todo lo que se escriba en (txt_nom_cliente)se ponen en letra Negra(BLACK)
            txt_nom_cliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_nom_clienteFocusGained

    private void txt_nom_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_clienteFocusLost
        // TODO add your handling code here:
        //este bloque verifica que el (txt_nom_cliente) este vacio con isEmpty y si es asi se ejecuta
        if (txt_nom_cliente.getText().isEmpty()) {
            //todo lo que se escriba en (txt_nom_cliente)se ponen en letra Gris(GRAY)
            txt_nom_cliente.setForeground(Color.GRAY);
            //Escribe en el (txt_nom_cliente) (Buscar cliente...) en color gris
            txt_nom_cliente.setText("Buscar cliente...");
        }
    }//GEN-LAST:event_txt_nom_clienteFocusLost

    private void txt_nom_empleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleadoFocusGained
        // TODO add your handling code here:
        if (txt_nom_empleado.getText().equals("Buscar Recepcionista...")) {
            txt_nom_empleado.setText("");
            txt_nom_empleado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_nom_empleadoFocusGained

    private void txt_nom_empleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleadoFocusLost
        // TODO add your handling code here:
        if (txt_nom_empleado.getText().isEmpty()) {
            txt_nom_empleado.setForeground(Color.GRAY);
            txt_nom_empleado.setText("Buscar Recepcionista...");
        }
    }//GEN-LAST:event_txt_nom_empleadoFocusLost

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btn_agregar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_productoActionPerformed
        // TODO add your handling code here:

        String producto = (String) combo_producto.getSelectedItem();
        String cantidadTexto = txt_cantidad.getText().trim();

        if (producto == null || producto.isEmpty() || producto.equals("No hay productos disponibles")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto válido.");
            return;
        }

        if (cantidadTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad.");
            return;
        }

        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número válido.");
            return;
        }

        double precioUnitario = 0.0;
        String query = "SELECT precio_unitario FROM medicamentos WHERE nombre = ?";

        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, producto);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    precioUnitario = rs.getDouble("precio_unitario");
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado en la base de datos.");
                    return;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener el precio del producto.");
            return;
        }

        double subtotal = precioUnitario * cantidad;

        DefaultTableModel modelo = (DefaultTableModel) jtable_producto.getModel();
        modelo.addRow(new Object[]{
            producto,
            cantidad,
            String.format("%.2f", precioUnitario),
            String.format("%.2f", subtotal)
        });

        combo_producto.setSelectedIndex(0);
        txt_cantidad.setText("");

        actualizarSubtotalProductos();
    }//GEN-LAST:event_btn_agregar_productoActionPerformed

    private void combo_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_mascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_mascotaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String texto = txt_nom_cliente.getText().trim();
        if (texto.isEmpty()) {
            return;
        }

        combo_nom_cliente.removeAllItems();

        String query = "SELECT nombre FROM cliente WHERE nombre LIKE ?";

        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, texto + "%");

            try (ResultSet rs = ps.executeQuery()) {
                boolean hayResultados = false;

                while (rs.next()) {
                    combo_nom_cliente.addItem(rs.getString("nombre"));
                    hayResultados = true;
                }

                if (!hayResultados) {
                    combo_nom_cliente.addItem("No encontrado");
                }
            }
            me.vaciarComboBox(combo_consulta, combo_mascota);
            me.limpiarCampos(txt_fecha, txt_precio, txt_diagnostico);
            actualizarTablaTotales();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar clientes.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        combo_mascota.removeAllItems(); // Limpia antes de cargar nuevas mascotas

        String nombreCliente = (String) combo_nom_cliente.getSelectedItem();
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente válido.");
            return;
        }

        try (Connection cn = con.Conectar()) {

            // Obtener el ID del cliente
            String sqlCliente = "SELECT id_cliente FROM cliente WHERE nombre = ?";
            try (PreparedStatement psCliente = cn.prepareStatement(sqlCliente)) {
                psCliente.setString(1, nombreCliente);
                try (ResultSet rsCliente = psCliente.executeQuery()) {
                    if (!rsCliente.next()) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        return;
                    }

                    int idCliente = rsCliente.getInt("id_cliente");

                    // Buscar mascotas asociadas al cliente
                    String sqlMascotas = "SELECT nombre FROM mascota WHERE id_cliente = ?";
                    try (PreparedStatement psMascotas = cn.prepareStatement(sqlMascotas)) {
                        psMascotas.setInt(1, idCliente);
                        try (ResultSet rsMascotas = psMascotas.executeQuery()) {

                            boolean tieneMascotas = false;
                            while (rsMascotas.next()) {
                                if (!tieneMascotas) {
                                    tieneMascotas = true;
                                }
                                combo_mascota.addItem(rsMascotas.getString("nombre"));
                            }

                            if (!tieneMascotas) {
                                JOptionPane.showMessageDialog(null, "No hay mascotas registradas");
                                me.vaciarComboBox(combo_consulta);
                                me.limpiarCampos(txt_fecha, txt_precio, txt_diagnostico);
                                actualizarTablaTotales();
                            } else {
                                combo_mascota.setSelectedIndex(0); // Seleccionar opción vacía
                            }
                        }
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar mascotas del cliente.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:\
        combo_consulta.removeAllItems();

        String nombreMascota = (String) combo_mascota.getSelectedItem();
        String queryMascota = "SELECT id_mascota FROM mascota WHERE nombre = ?";
        String queryHistorial = "SELECT id_consulta FROM historial_consulta WHERE id_mascota = ?";

        try (Connection cn = con.Conectar(); PreparedStatement psMascota = cn.prepareStatement(queryMascota)) {

            psMascota.setString(1, nombreMascota);

            try (ResultSet rsMascota = psMascota.executeQuery()) {
                if (!rsMascota.next()) {
                    JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                    return;
                }

                int idMascota = rsMascota.getInt("id_mascota");

                try (PreparedStatement psHistorial = cn.prepareStatement(queryHistorial)) {
                    psHistorial.setInt(1, idMascota);

                    try (ResultSet rsHistorial = psHistorial.executeQuery()) {
                        List<String> consultas = new ArrayList<>();

                        while (rsHistorial.next()) {
                            consultas.add(rsHistorial.getString("id_consulta"));
                        }

                        if (consultas.isEmpty()) {
                            combo_consulta.addItem("No hay consultas registradas");
                        } else {
                            for (String id : consultas) {
                                combo_consulta.addItem(id);
                            }
                            combo_consulta.setSelectedIndex(0);
                        }
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar historial de consultas.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        Object seleccion = combo_consulta.getSelectedItem();

        // Validación: si no hay selección o es cadena vacía, limpiar y salir
        if (seleccion == null || seleccion.toString().trim().isEmpty()) {
            combo_consulta.removeAllItems();
            me.limpiarCampos(txt_fecha, txt_diagnostico, txt_precio);
            actualizarTablaTotales();
            return;
        }

        String query = "SELECT fecha_historial_consulta, diagnostico, precio_consulta FROM historial_consulta WHERE id_consulta = ?";

        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, seleccion.toString());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    txt_fecha.setText(rs.getString("fecha_historial_consulta"));
                    txt_diagnostico.setText(rs.getString("diagnostico"));
                    txt_precio.setText(rs.getString("precio_consulta"));
                    actualizarTablaTotales();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la consulta.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String texto = txt_nom_empleado.getText().trim();
        if (texto.isEmpty()) {
            return;
        }
        combo_nom_empleado.removeAllItems();
        String query = "SELECT e.nombre FROM cargo c "
                + "JOIN empleado e ON c.id_empleado = e.id_empleado "
                + "WHERE c.cargo = 'Recepcionista' AND e.nombre LIKE ?";
        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, texto + "%");
            try (ResultSet rs = ps.executeQuery()) {
                boolean hayResultados = false;
                while (rs.next()) {
                    combo_nom_empleado.addItem(rs.getString("nombre"));
                    hayResultados = true;
                }
                if (!hayResultados) {
                    combo_nom_empleado.addItem("No encontrado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar recepcionistas: ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ultimoId = -1;
        String query1 = "SELECT id_factura FROM factura ORDER BY id_factura DESC LIMIT 1";

        try (Connection cn = con.Conectar()) {

            // 1. Obtener último ID
            try (PreparedStatement ps = cn.prepareStatement(query1);
                    ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    ultimoId = rs.getInt("id_factura");
                    System.out.println("Última factura: " + ultimoId);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay facturas registradas.");
                    return; // salimos si no hay facturas
                }
            }

            // 2. Generar reporte si hay ID
            String path = "src\\Reportes\\Facturacion.jasper";
            Map<String, Object> parametro = new HashMap<>();
            parametro.put("id_factura", ultimoId);

            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);

            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Historial_Factura_Vista.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error generando el reporte");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar la factura");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(factura_Vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura_Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_producto;
    private javax.swing.JButton btn_registrar_factura;
    private javax.swing.JComboBox<String> combo_consulta;
    private javax.swing.JComboBox<String> combo_mascota;
    private javax.swing.JComboBox<String> combo_nom_cliente;
    private javax.swing.JComboBox<String> combo_nom_empleado;
    private javax.swing.JComboBox<String> combo_producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelM;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jbl_fecha;
    private javax.swing.JLabel jbl_num_factu;
    private javax.swing.JTable jtable_producto;
    private javax.swing.JTable jtable_total;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_diagnostico;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nom_cliente;
    private javax.swing.JTextField txt_nom_empleado;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_precio_producto;
    // End of variables declaration//GEN-END:variables

    //Metodo para deshabilitar un panel y suscomponentes
    public void deshabilitarPanel(JPanel panel) {
        //este for recorre el panel que le des en el parametro
        for (Component c : panel.getComponents()) {
            //desabilta los componentes uno por uno
            c.setEnabled(false);
        }
    }

    //Metodo para habilitar un panel y suscomponentes
    public void habilitarPanel(JPanel panel) {
        //este for recorre el panel que le des en el parametro
        for (Component c : panel.getComponents()) {
            //habilita los componentes uno por uno
            c.setEnabled(true);
        }
    }

    private void mostrarNumeroFactura() {
        String numeroFactura = "No. Factura: ";
        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement("SELECT MAX(id_factura) AS ultima_factura FROM factura"); ResultSet rs = ps.executeQuery()) {
            int siguienteFactura = 1; // valor por defecto si no hay facturas
            if (rs.next()) {
                siguienteFactura = rs.getInt("ultima_factura") + 1;
            }
            jbl_num_factu.setText(numeroFactura + siguienteFactura);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener número de factura");
        }
    }

    private void mostrarFecha() {
        String fechaTexto = "Fecha: ";
        String fechaFormateada = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        jbl_fecha.setText(fechaTexto + fechaFormateada);
    }

    //Metodo para mostrar en (txt_nom_cliente y txt_nom_empleado) (Buscar cliente... y Buscar Recepcionista...)por primera vez
    private void placeholder() {
        txt_nom_cliente.setForeground(Color.GRAY);
        txt_nom_cliente.setText("Buscar cliente...");
        txt_nom_empleado.setForeground(Color.GRAY);
        txt_nom_empleado.setText("Buscar Recepcionista...");
    }

    private void configurarTablaTotales() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Subtotal");
        modelo.addColumn("Impuesto");
        modelo.addColumn("Total");
        jtable_total.setModel(modelo);
    }

    private void actualizarTablaTotales() {
        double precioConsulta = 0.0;
        double subtotalProductos = 0.0;

        try {
            // Validar y convertir los textos a números, si no están vacíos
            if (!txt_precio.getText().trim().isEmpty()) {
                precioConsulta = Double.parseDouble(txt_precio.getText().trim());
            }
            if (!txt_precio_producto.getText().trim().isEmpty()) {
                subtotalProductos = Double.parseDouble(txt_precio_producto.getText().trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: los precios deben ser números válidos.");
            return;
        }

        double subtotal = precioConsulta + subtotalProductos;
        double impuesto = subtotal * 0.05;
        double total = subtotal + impuesto;

        DefaultTableModel modelo = (DefaultTableModel) jtable_total.getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        // Agregar fila con formato de 2 decimales
        modelo.addRow(new Object[]{
            String.format("%.2f", subtotal),
            "5%", // Porcentaje fijo
            String.format("%.2f", total)
        });

//        Object[] fila = new Object[3];
//        fila[0] = String.format("%.2f", subtotal);
//        fila[1] = "5%"; // Muestra el porcentaje
//        fila[2] = String.format("%.2f", total);
//        modelo.addRow(fila);
    }

    private void cargarProductosEnCombo() {

        combo_producto.removeAllItems(); // Limpia antes de llenar

        String query = "SELECT nombre FROM medicamentos";

        try (Connection cn = con.Conectar(); PreparedStatement ps = cn.prepareStatement(query); ResultSet rs = ps.executeQuery()) {

            boolean hayProductos = false;
            while (rs.next()) {
                combo_producto.addItem(rs.getString("nombre"));
                hayProductos = true;
            }

            if (!hayProductos) {
                combo_producto.addItem("No hay productos disponibles");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar productos.");
        }
    }

    private void configurarTablaProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Subtotal");
        jtable_producto.setModel(modelo);
    }

    private void actualizarSubtotalProductos() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_producto.getModel();
        double total = 0.0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            double subtotalFila = Double.parseDouble(modelo.getValueAt(i, 3).toString());
            total += subtotalFila;
        }

        txt_precio_producto.setText(String.format("%.2f", total));
        actualizarTablaTotales(); // Si quieres actualizar la tabla de totales también
    }

    public JPanel getPanelFactura() {
        return jPanel1;
    }
}
