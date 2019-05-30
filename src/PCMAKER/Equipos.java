package PCMAKER;
import com.sun.awt.AWTUtilities;
import java.awt.*;
import java.awt.geom.*;
import java.sql.*;
import javax.swing.*;

public class Equipos extends javax.swing.JFrame {
    Conectar conetc = new Conectar();  //Conexion 
    Connection con = conetc.conexion();//Conexion
    String [] ensamble = new String[11];
    double [] precios = new double[11];
    String [] equipos = {"EQU01BASIC","EQU02BASIC","EQU03OFFICE","EQU04OFFICE","EQU05WORK","EQU06WORK","EQU07GAMER","EQU08GAMER","EQU09DISEÑO","EQU10EXTREMO"};
    String temp,idEmpd,idUser,aux;
    String radio;
    int cpu;
    double cuenta;

    public Equipos(String empd,String user) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        idEmpd = empd;
        idUser = user;
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27); //Bordes redondeados.
        AWTUtilities.setWindowShape(this,forma); //Aplicar bordes redondeados. 
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlbImagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCpu = new javax.swing.JTextField();
        txtMother = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtGpu = new javax.swing.JTextField();
        txtHdd = new javax.swing.JTextField();
        txtFuente = new javax.swing.JTextField();
        txtCase = new javax.swing.JTextField();
        txtMonitor = new javax.swing.JTextField();
        txtMouse = new javax.swing.JTextField();
        txtMultimedia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtKeyboard = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnAdquirir = new javax.swing.JButton();
        cmbRecomendacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(896, 50));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("EQUIPOS SUGERIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        btnMenu.setBackground(new java.awt.Color(0, 204, 204));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/home.png"))); // NOI18N
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setDefaultCapable(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(876, 430));

        jlbImagen.setBackground(new java.awt.Color(0, 204, 51));
        jlbImagen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen.setText("IMAGEN NO DISPONIBLE");
        jlbImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlbImagen.setPreferredSize(new java.awt.Dimension(300, 250));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("PRECIO                 $");

        txtPrecio.setBackground(new java.awt.Color(0, 204, 0));
        txtPrecio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel26.setText("DESCRIPCION");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(580, 460));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Procesador");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel28.setText("Motherboard");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Memoria Ram");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Fuente de Poder");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Almacenamiento");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Tarjeta Grafica");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Mouse");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Monitor");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Gabinete");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Multimedia");

        txtCpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtMother.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtRam.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtGpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtHdd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtFuente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtCase.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtMonitor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtMouse.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        txtMultimedia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Teclado");

        txtKeyboard.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtKeyboard))
                            .addComponent(txtCase, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMother, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHdd, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtHdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel27.setText("RECOMENDADO PARA");

        btnAdquirir.setBackground(new java.awt.Color(255, 255, 102));
        btnAdquirir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAdquirir.setText("ADQUIRIR");
        btnAdquirir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdquirir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdquirirActionPerformed(evt);
            }
        });

        cmbRecomendacion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cmbRecomendacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbRecomendacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAdquirir)
                                .addGap(60, 60, 60)))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(27, 27, 27))
                            .addComponent(cmbRecomendacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbRecomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdquirir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuPrincipal MP = new MenuPrincipal(idEmpd,idUser);
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdquirirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdquirirActionPerformed
        PCM11_Finalizar PC11 = new PCM11_Finalizar(idEmpd,idUser,cuenta,precios,ensamble);
        setVisible(false);
    }//GEN-LAST:event_btnAdquirirActionPerformed

    private void cmbRecomendacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbRecomendacionPopupMenuWillBecomeInvisible
        cpu =  cmbRecomendacion.getSelectedIndex();
        guardarDatos(); 
        mostrarDatos();
        txtPrecio.setText(cuenta + "");
    }//GEN-LAST:event_cmbRecomendacionPopupMenuWillBecomeInvisible

    public void cargarDatos(){
        try{
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select recomendado from equipos");
            cmbRecomendacion.removeAllItems();
            while(resultado.next()){
                cmbRecomendacion.addItem(resultado.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void guardarDatos(){
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from equipos");
            while(resul.next()){
                aux = resul.getString("id_equipo");
                if (aux.equals(equipos[cpu])) {
                    ensamble[0]= resul.getString("cpu");
                    ensamble[1]= resul.getString("mother");
                    ensamble[2]= resul.getString("ram");
                    ensamble[3]= resul.getString("gpu");
                    ensamble[4]= resul.getString("storage");
                    ensamble[5]= resul.getString("power");
                    ensamble[6]= resul.getString("cabinet");
                    ensamble[7]= resul.getString("display");
                    ensamble[8]= resul.getString("mouse");
                    ensamble[9]= resul.getString("keyboard"); 
                    ensamble[10]= resul.getString("multimedia");
                    cuenta = resul.getDouble("costo");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarDatos(){
        mostrarCpu();
        mostrarMother();
        mostrarRam();
        mostrarGpu();
        mostrarStorage();
        mostrarPower();
        mostrarCabinet();
        mostrarDisplay();
        mostrarMouse();
        mostrarKeyboard();
        mostrarMultimedia();
    }
    
    public void mostrarCpu(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from cpu");
            while(resul.next()){
                tp = resul.getString("id_cpu");
                if (tp.equals(ensamble[0])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    datos += resul.getString("frecuencia");
                    precios[0] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtCpu.setText(datos);
    }
    public void mostrarMother(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from mother");
            while(resul.next()){
                tp = resul.getString("id_mother");
                if (tp.equals(ensamble[1])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo");
                    precios[1] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtMother.setText(datos);
    }
    public void mostrarRam(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from ram");
            while(resul.next()){
                tp = resul.getString("id_ram");
                if (tp.equals(ensamble[2])) {
                    datos += resul.getString("capacidad") + " ";
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    datos += resul.getString("frecuencia") + " ";
                    precios[2] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtRam.setText(datos);
    }
    public void mostrarGpu(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from gpu");
            while(resul.next()){
                tp = resul.getString("id_gpu");
                if (tp.equals(ensamble[3])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo");
                    precios[3] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtGpu.setText(datos);
    }
    public void mostrarStorage(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from storage");
            while(resul.next()){
                tp = resul.getString("id_storage");
                if (tp.equals(ensamble[4])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    datos += resul.getString("capacidad");
                    precios[4] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtHdd.setText(datos);
    }
    public void mostrarPower(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from power");
            while(resul.next()){
                tp = resul.getString("id_power");
                if (tp.equals(ensamble[5])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    datos += resul.getString("certificacion");
                    precios[5] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtFuente.setText(datos);
    }
    public void mostrarCabinet(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from cabinet");
            while(resul.next()){
                tp = resul.getString("id_cabinet");
                if (tp.equals(ensamble[6])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    precios[6] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtCase.setText(datos);
    }
    public void mostrarDisplay(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from display");
            while(resul.next()){
                tp = resul.getString("id_display");
                if (tp.equals(ensamble[7])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    datos += resul.getString("diagonal") + " ";
                    precios[7] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtMonitor.setText(datos);
    }
    public void mostrarMouse(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from device where tipo='Mouse'");
            while(resul.next()){
                tp = resul.getString("id_device");
                if (tp.equals(ensamble[8])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    precios[8] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtMouse.setText(datos);
    }
    public void mostrarKeyboard(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from device where tipo='Teclado'");
            while(resul.next()){
                tp = resul.getString("id_device");
                if (tp.equals(ensamble[9])) {
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo") + " ";
                    precios[9] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtKeyboard.setText(datos);
    }
    public void mostrarMultimedia(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from multimedia");
            while(resul.next()){
                tp = resul.getString("id_multimedia");
                if (tp.equals(ensamble[10])) {
                    datos += resul.getString("tipo") + " ";
                    datos += resul.getString("marca") + " ";
                    datos += resul.getString("modelo");
                    precios[10] = resul.getDouble("precio");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtMultimedia.setText(datos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdquirir;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbRecomendacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbImagen;
    private javax.swing.JTextField txtCase;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtHdd;
    private javax.swing.JTextField txtKeyboard;
    private javax.swing.JTextField txtMonitor;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtMouse;
    private javax.swing.JTextField txtMultimedia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRam;
    // End of variables declaration//GEN-END:variables
}