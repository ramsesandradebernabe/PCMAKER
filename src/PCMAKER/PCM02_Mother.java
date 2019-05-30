package PCMAKER;
import com.sun.awt.AWTUtilities;
import java.awt.*;
import java.awt.geom.*;
import java.sql.*;
import javax.swing.*;

public class PCM02_Mother extends javax.swing.JFrame {
    Conectar conetc = new Conectar();  //Conexion 
    Connection con = conetc.conexion();//Conexion
    String idEmpd,idUser,sock,aux,mother,cpu;
    double Ccuenta;
    String [] ensamble = new String[11];
    double [] precios = new double[11];
    
    public PCM02_Mother(String empd,String user,String ensa[],double prec []) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        System.arraycopy(ensa, 0, ensamble, 0, 11);
        System.arraycopy(prec, 0, precios, 0, 11);
        definirDatos();
        idEmpd = empd;
        idUser = user;
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27); //Bordes redondeados.
        AWTUtilities.setWindowShape(this,forma); //Aplicar bordes redondeados. 
        Ccuenta = precios[0];
        txtSubTotal.setText(Ccuenta + "");
        cargarDatos();
    }
    
    public void definirDatos(){
        cpu = ensamble[0];
        String temp;
        try {
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from cpu");
            while(resultado.next()){
                temp = resultado.getString("id_cpu");
                if (temp.equals(cpu)){
                    sock = resultado.getString("socket"); 
                }
            } 
        }catch(SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCpu = new javax.swing.JButton();
        btnMultimedia = new javax.swing.JButton();
        btnMother = new javax.swing.JButton();
        btnRam = new javax.swing.JButton();
        btnGpu = new javax.swing.JButton();
        btnHdd = new javax.swing.JButton();
        btnFuente = new javax.swing.JButton();
        btnCase = new javax.swing.JButton();
        btnMonitor = new javax.swing.JButton();
        btnPerifericos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlbImgMother = new javax.swing.JLabel();
        cmbMother = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtSocket = new javax.swing.JTextField();
        txtChipset = new javax.swing.JTextField();
        txtMemoria = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        txtMaximo = new javax.swing.JTextField();
        txtFormato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        btnSiguiente.setBackground(new java.awt.Color(255, 255, 51));
        btnSiguiente.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(897, 100));

        btnCpu.setBackground(new java.awt.Color(255, 51, 51));
        btnCpu.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/cpu.png"))); // NOI18N
        btnCpu.setBorderPainted(false);
        btnCpu.setContentAreaFilled(false);
        btnCpu.setDefaultCapable(false);
        btnCpu.setPreferredSize(new java.awt.Dimension(82, 73));
        btnCpu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/cpu2.png"))); // NOI18N
        btnCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCpuActionPerformed(evt);
            }
        });

        btnMultimedia.setBackground(new java.awt.Color(255, 51, 51));
        btnMultimedia.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnMultimedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/multimedia.png"))); // NOI18N
        btnMultimedia.setBorderPainted(false);
        btnMultimedia.setContentAreaFilled(false);
        btnMultimedia.setDefaultCapable(false);
        btnMultimedia.setPreferredSize(new java.awt.Dimension(82, 73));
        btnMultimedia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/multimedia2.png"))); // NOI18N

        btnMother.setBackground(new java.awt.Color(255, 255, 153));
        btnMother.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/mother2.png"))); // NOI18N
        btnMother.setBorderPainted(false);
        btnMother.setContentAreaFilled(false);
        btnMother.setDefaultCapable(false);
        btnMother.setPreferredSize(new java.awt.Dimension(82, 73));

        btnRam.setBackground(new java.awt.Color(255, 51, 51));
        btnRam.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnRam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/ram.png"))); // NOI18N
        btnRam.setBorderPainted(false);
        btnRam.setContentAreaFilled(false);
        btnRam.setDefaultCapable(false);
        btnRam.setPreferredSize(new java.awt.Dimension(82, 73));
        btnRam.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/ram2.png"))); // NOI18N

        btnGpu.setBackground(new java.awt.Color(255, 51, 51));
        btnGpu.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnGpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/gpu.png"))); // NOI18N
        btnGpu.setBorderPainted(false);
        btnGpu.setContentAreaFilled(false);
        btnGpu.setDefaultCapable(false);
        btnGpu.setPreferredSize(new java.awt.Dimension(82, 73));
        btnGpu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/gpu2.png"))); // NOI18N

        btnHdd.setBackground(new java.awt.Color(255, 51, 51));
        btnHdd.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnHdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/hdd.png"))); // NOI18N
        btnHdd.setBorderPainted(false);
        btnHdd.setContentAreaFilled(false);
        btnHdd.setDefaultCapable(false);
        btnHdd.setPreferredSize(new java.awt.Dimension(82, 73));
        btnHdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/hdd2.png"))); // NOI18N

        btnFuente.setBackground(new java.awt.Color(255, 51, 51));
        btnFuente.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/fuente.png"))); // NOI18N
        btnFuente.setBorderPainted(false);
        btnFuente.setContentAreaFilled(false);
        btnFuente.setDefaultCapable(false);
        btnFuente.setPreferredSize(new java.awt.Dimension(82, 73));
        btnFuente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/fuente2.png"))); // NOI18N

        btnCase.setBackground(new java.awt.Color(255, 51, 51));
        btnCase.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/case.png"))); // NOI18N
        btnCase.setBorderPainted(false);
        btnCase.setContentAreaFilled(false);
        btnCase.setDefaultCapable(false);
        btnCase.setPreferredSize(new java.awt.Dimension(82, 73));
        btnCase.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/case2.png"))); // NOI18N

        btnMonitor.setBackground(new java.awt.Color(255, 51, 51));
        btnMonitor.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/monitor.png"))); // NOI18N
        btnMonitor.setBorderPainted(false);
        btnMonitor.setContentAreaFilled(false);
        btnMonitor.setDefaultCapable(false);
        btnMonitor.setPreferredSize(new java.awt.Dimension(82, 73));
        btnMonitor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/monitor2.png"))); // NOI18N

        btnPerifericos.setBackground(new java.awt.Color(255, 51, 51));
        btnPerifericos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnPerifericos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/perifericos.png"))); // NOI18N
        btnPerifericos.setBorderPainted(false);
        btnPerifericos.setContentAreaFilled(false);
        btnPerifericos.setDefaultCapable(false);
        btnPerifericos.setPreferredSize(new java.awt.Dimension(82, 73));
        btnPerifericos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/perifericos2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerifericos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerifericos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultimedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(876, 430));

        jlbImgMother.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImgMother.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlbImgMother.setPreferredSize(new java.awt.Dimension(300, 250));

        cmbMother.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cmbMother.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu Motherboard" }));
        cmbMother.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbMotherPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMotherActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("MOTHERBOARD");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(481, 295));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("INFORMACION");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Marca");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Socket");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Chipset");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Memoria");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Frecuencia");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Maximo");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Formato");

        txtMarca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtSocket.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtChipset.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtMemoria.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtFrecuencia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtMaximo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoActionPerformed(evt);
            }
        });

        txtFormato.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtChipset, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtSocket, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSocket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChipset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("PRECIO                 $");

        txtPrecio.setBackground(new java.awt.Color(240, 240, 240));
        txtPrecio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("SUB TOTAL          $");

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 51));
        txtSubTotal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtSubTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMother, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlbImgMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jlbImgMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnAnterior.setBackground(new java.awt.Color(0, 204, 204));
        btnAnterior.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAnterior.setText("ANTERIOR");
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnSiguiente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente)
                        .addComponent(btnAnterior)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        ensamble[0]= cpu;
        ensamble[1]=mother;
        PCM03_Ram PC03 = new PCM03_Ram(idEmpd,idUser,precios,ensamble);
        setVisible(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCpuActionPerformed

    private void cmbMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMotherActionPerformed

    private void txtMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        PCM01_Cpu PC01 = new PCM01_Cpu(idEmpd,idUser);
        setVisible(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void cmbMotherPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbMotherPopupMenuWillBecomeInvisible
        mother = "" + cmbMother.getSelectedItem();
        mostrarDatos();   
        mostrarImagen();
    }//GEN-LAST:event_cmbMotherPopupMenuWillBecomeInvisible
    
    public void cargarDatos(){
        try{
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from mother where socket='"+ sock +"'");
            cmbMother.removeAllItems();
            while(resultado.next()){
                cmbMother.addItem(resultado.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarDatos(){
        double precio;
        String temp;
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from mother");
            while(resul.next()){
                temp = resul.getString("id_mother");
                if (temp.equals(mother)) {
                    txtMarca.setText(resul.getString("marca"));
                    txtModelo.setText(resul.getString("modelo"));
                    txtSocket.setText(resul.getString("socket"));
                    txtChipset.setText(resul.getString("chipset"));
                    txtMemoria.setText(resul.getString("memoria"));
                    txtFrecuencia.setText(resul.getInt("frecuencia") + " MHz");
                    txtMaximo.setText(resul.getString("maximo"));
                    txtFormato.setText(resul.getString("formato"));
                    txtPrecio.setText(""+ resul.getDouble("precio"));
                    precio = resul.getDouble("precio");
                    precios[1] = precio;
                    precio += Ccuenta;
                    txtSubTotal.setText("" + precio);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarImagen(){
        ImageIcon IMGmother = new ImageIcon(getClass().getResource("Imgmother/" + mother + ".jpg"));
        ImageIcon icono = new ImageIcon(IMGmother.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT));
        jlbImgMother.setIcon(icono);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCase;
    private javax.swing.JButton btnCpu;
    private javax.swing.JButton btnFuente;
    private javax.swing.JButton btnGpu;
    private javax.swing.JButton btnHdd;
    private javax.swing.JButton btnMonitor;
    private javax.swing.JButton btnMother;
    private javax.swing.JButton btnMultimedia;
    private javax.swing.JButton btnPerifericos;
    private javax.swing.JButton btnRam;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbMother;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jlbImgMother;
    private javax.swing.JTextField txtChipset;
    private javax.swing.JTextField txtFormato;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMemoria;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSocket;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables
}