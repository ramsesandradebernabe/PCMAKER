package PCMAKER;
import com.sun.awt.AWTUtilities;
import java.awt.*;
import java.awt.geom.*;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;

public class PCM11_Finalizar extends javax.swing.JFrame {
    Conectar conetc = new Conectar();  //Conexion 
    Connection con = conetc.conexion();//Conexion
    double cuenta=0,cequipo=0;
    double [] Pensa = new double[11];
    String idEmpd,idUser,ID_ensamble,fecha="",hrs="",fecha2="";
    int number,diferent=0;
    double [] precios = new double[11];
    String [] ensamble = new String[11];
    String [] tablas = {"cpu","mother","ram","gpu","storage","power","cabinet","display","device","device","multimedia"}; 

    public PCM11_Finalizar(String empd,String user,double prec[],String ensa[]) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        idEmpd = empd;
        idUser = user;
        diferent=1;
        System.arraycopy(ensa, 0, ensamble, 0, 11);
        System.arraycopy(prec, 0, precios, 0, 11);
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27); //Bordes redondeados.
        AWTUtilities.setWindowShape(this,forma); //Aplicar bordes redondeados.
        cargarDatos();
        cargarUsuario();
    }
    
    public PCM11_Finalizar(String empd,String user,double cu,double prec[],String ensa[]) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        idEmpd = empd;
        idUser = user;
        diferent=2;
        System.arraycopy(ensa, 0, ensamble, 0, 11);
        cequipo= cu;
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27); //Bordes redondeados.
        AWTUtilities.setWindowShape(this,forma); //Aplicar bordes redondeados.
        cargarDatos();
        cargarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        txtStorage = new javax.swing.JTextField();
        txtPower = new javax.swing.JTextField();
        txtCabinet = new javax.swing.JTextField();
        txtDisplay = new javax.swing.JTextField();
        txtMouse = new javax.swing.JTextField();
        txtMultimedia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtP_Cpu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtP_Mother = new javax.swing.JTextField();
        txtP_Ram = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtP_Gpu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtP_Storage = new javax.swing.JTextField();
        txtP_Power = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtP_Cabinet = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtP_Display = new javax.swing.JTextField();
        txtP_Mouse = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtP_Multimedia = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtFtotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtKeyboard = new javax.swing.JTextField();
        txtP_Keyboard = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNickname = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(896, 50));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("PANTALLA DE CONFIRMACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 554, 101, 48));

        btnConfirmar.setBackground(new java.awt.Color(255, 255, 102));
        btnConfirmar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 463, 157, 43));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(580, 460));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LISTA DE COMPONENTES");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Procesador");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Motherboard");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Memoria Ram");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Fuente de Poder");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 224, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Almacenamiento");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Tarjeta Grafica");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Mouse");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 329, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Monitor");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 295, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Gabinete");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Multimedia");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 400, -1, -1));

        txtCpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 30, 260, -1));

        txtMother.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 65, 260, -1));

        txtRam.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 106, 260, -1));

        txtGpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtGpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 147, 260, -1));

        txtStorage.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 183, 260, -1));

        txtPower.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 221, 260, -1));

        txtCabinet.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtCabinet, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 255, 260, -1));

        txtDisplay.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 292, 260, -1));

        txtMouse.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtMouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 326, 260, -1));

        txtMultimedia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtMultimedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 397, 260, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("$");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 33, 18, -1));

        txtP_Cpu.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Cpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Cpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 30, 80, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("$");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 68, 18, -1));

        txtP_Mother.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Mother.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 65, 80, -1));

        txtP_Ram.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Ram.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 106, 80, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setText("$");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 109, 18, -1));

        txtP_Gpu.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Gpu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Gpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 147, 80, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setText("$");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 150, 18, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel18.setText("$");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 186, 18, -1));

        txtP_Storage.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Storage.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Storage, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 183, 80, -1));

        txtP_Power.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Power.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Power, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 221, 80, -1));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setText("$");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 224, 18, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel20.setText("$");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 258, 18, -1));

        txtP_Cabinet.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Cabinet.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Cabinet, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 255, 80, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel21.setText("$");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 295, 18, -1));

        txtP_Display.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Display.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 292, 80, -1));

        txtP_Mouse.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Mouse.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Mouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 326, 80, -1));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel22.setText("$");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 329, 18, -1));

        txtP_Multimedia.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Multimedia.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Multimedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 397, 80, -1));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setText("$");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 400, 18, -1));

        txtFtotal.setBackground(new java.awt.Color(255, 255, 102));
        txtFtotal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtFtotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtFtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 431, 80, -1));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel24.setText("$");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 433, 18, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel25.setText("TOTAL");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 433, -1, -1));

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel30.setText("Keyboard");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 363, -1, -1));

        txtKeyboard.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtKeyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 360, 260, -1));

        txtP_Keyboard.setBackground(new java.awt.Color(204, 204, 204));
        txtP_Keyboard.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel3.add(txtP_Keyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 360, 80, -1));

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel31.setText("$");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 363, 18, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 70, 510, 478));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DATOS DEL CLIENTE");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/EntradaUser.png"))); // NOI18N
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel27.setText("Nickname");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel28.setText("Nombre");

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel29.setText("Correo");

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        txtNickname.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(10, 10, 10)
                        .addComponent(txtNickname))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtCorreo))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 71, 320, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 517, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        MenuPrincipal MP = new MenuPrincipal(idEmpd,idUser);
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        cargarID();
        cargarFecha();
        ID_ensamble = "ST01" + fecha2 + hrs + number; 
        
        /*try {
             Statement consul=con.createStatement();
             ResultSet resul= consul.executeQuery("set autocommit=0");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        try {
             Statement consul=con.createStatement();
             ResultSet resul= consul.executeQuery("call v_trans('"+ID_ensamble+"','"+ensamble[0]+"','"+ensamble[1]+"','"+ensamble[2]+"','"+ensamble[3]+"','"+ensamble[4]+"','"+ensamble[5]+"','"+ensamble[6]+"','"+ensamble[7]+"','"+ensamble[8]+"','"+ensamble[9]+"','"+ensamble[10]+"','"+ID_ensamble+"',"+txtFtotal.getText()+",'"+fecha+"','"+txtCorreo.getText()+"')");
              JOptionPane.showMessageDialog(null,"Se ha procesado con exito la compra","Ensamble Terminado. . !",JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal MP = new MenuPrincipal(idEmpd,idUser);
            setVisible(false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }*/
         
        try {   
            PreparedStatement in = con.prepareStatement("INSERT INTO ensambles (id_ensamble,cpu,mother,ram,gpu,storage,power,cabinet,display,mouse,keyboard,multimedia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            in.setString(1,ID_ensamble);
            in.setString(2,ensamble[0]);
            in.setString(3,ensamble[1]);
            in.setString(4,ensamble[2]);
            in.setString(5,ensamble[3]);
            in.setString(6,ensamble[4]);
            in.setString(7,ensamble[5]);
            in.setString(8,ensamble[6]);
            in.setString(9,ensamble[7]);
            in.setString(10,ensamble[8]);
            in.setString(11,ensamble[9]);
            in.setString(12,ensamble[10]);
            in.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha procesado con exito la compra","Ensamble Terminado. . !",JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal MP = new MenuPrincipal(idEmpd,idUser);
            setVisible(false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        ingresarVenta();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public void cargarDatos(){
        String temp;    
        try{
            Statement consul = con.createStatement();
            for (int i = 0; i < 11; i++) {
              ResultSet resul = consul.executeQuery("select * from " + tablas[i] +"");
                while(resul.next()){
                temp = resul.getString("id_" + tablas[i] + "");
                if (temp.equals(ensamble[i])) {            
                    Pensa [i] = resul.getDouble("precio");
                    cuenta += Pensa[i];
                }
            }  
            }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        
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
        
        txtP_Cpu.setText(Pensa[0] + "");
        txtP_Mother.setText(Pensa[1] + "");
        txtP_Ram.setText(Pensa[2] + "");
        txtP_Gpu.setText(Pensa[3] + "");
        txtP_Storage.setText(Pensa[4] + "");
        txtP_Power.setText(Pensa[5] + "");
        txtP_Cabinet.setText(Pensa[6] + "");
        txtP_Display.setText(Pensa[7] + "");
        txtP_Mouse.setText(Pensa[8] + "");
        txtP_Keyboard.setText(Pensa[9] + "");
        txtP_Multimedia.setText(Pensa[10] + "");
        if (diferent==1) {
            txtFtotal.setText(cuenta + "");
        }else{
            txtFtotal.setText(cequipo + "");
        }
        
    }
    
    public void cargarUsuario(){
        String temp,name;  
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from usuarios");
                while(resul.next()){
                temp = resul.getString("correo");
                if (temp.equals(idUser)) {            
                    txtNickname.setText(resul.getString("nickname"));
                    name = (resul.getString("nombre"));
                    name += " " + (resul.getString("apellidos"));
                    txtNombre.setText(name);
                    txtCorreo.setText(resul.getString("correo"));
                }  
            }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarID(){
        int cont=0;    
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from ensambles");
            while(resul.next()){
                 cont++;
            }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            cont = 0;
        }
        number = cont;
    }
    
    public void cargarFecha(){
        Calendar c;
        c = Calendar.getInstance();
        int d=c.get(Calendar.DATE), m=1+c.get(Calendar.MONTH), a=c.get(Calendar.YEAR);
        int hora=c.get(Calendar.HOUR_OF_DAY), minu=1+c.get(Calendar.MINUTE), segu=c.get(Calendar.SECOND);
        fecha = d+"-"+m+"-"+a;
        fecha2 = d +""+ m +""+ a;
        hrs = hora + "" + minu + "" +  segu;
    }
    
    public void ingresarVenta(){  
        cargarFecha();
        try {   
            PreparedStatement in = con.prepareStatement("INSERT INTO compras (id_ensamble,costo,fecha,correo_user,id_empleado) VALUES (?,?,?,?,?)");
            in.setString(1,ID_ensamble);
            in.setDouble(2,Double.parseDouble(txtFtotal.getText()));
            in.setString(3,fecha);
            in.setString(4,txtCorreo.getText());
            in.setString(5,idEmpd);
            in.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Se ha procesado con exito la compra","Ensamble Terminado. . !",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
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
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtStorage.setText(datos);
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
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtPower.setText(datos);
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
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtCabinet.setText(datos);
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
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDisplay.setText(datos);
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
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtMultimedia.setText(datos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCabinet;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtFtotal;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtKeyboard;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtMouse;
    private javax.swing.JTextField txtMultimedia;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtP_Cabinet;
    private javax.swing.JTextField txtP_Cpu;
    private javax.swing.JTextField txtP_Display;
    private javax.swing.JTextField txtP_Gpu;
    private javax.swing.JTextField txtP_Keyboard;
    private javax.swing.JTextField txtP_Mother;
    private javax.swing.JTextField txtP_Mouse;
    private javax.swing.JTextField txtP_Multimedia;
    private javax.swing.JTextField txtP_Power;
    private javax.swing.JTextField txtP_Ram;
    private javax.swing.JTextField txtP_Storage;
    private javax.swing.JTextField txtPower;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtStorage;
    // End of variables declaration//GEN-END:variables
}