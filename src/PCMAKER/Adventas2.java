package PCMAKER;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Adventas2 extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    String idEmpd;
    int option=0,sitio=0,cont=0;
    
    public Adventas2(String empd) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        idEmpd = empd; 
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        modelo.addColumn("id_empleado");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Total Compras");
        jtbUserVentas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUserVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbtnLocal = new javax.swing.JRadioButton();
        rbtnGlobal = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnLlenar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        btnMenu = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(896, 100));

        btnEmpleados.setBackground(new java.awt.Color(255, 204, 255));
        btnEmpleados.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/EMPLOY.png"))); // NOI18N
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setPreferredSize(new java.awt.Dimension(280, 75));
        btnEmpleados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/EMPLOY2.png"))); // NOI18N
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(153, 0, 153));
        btnUsuarios.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/USERS2.png"))); // NOI18N
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(280, 75));
        btnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/USERS2.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(153, 0, 153));
        btnVentas.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/SALES.png"))); // NOI18N
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setPreferredSize(new java.awt.Dimension(280, 75));
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/ButtonsImprove/SALES2.png"))); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(876, 447));

        jtbUserVentas.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jtbUserVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Correo", "Sucursal", "Total de Compras"
            }
        ));
        jtbUserVentas.setRowHeight(28);
        jtbUserVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUserVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUserVentas);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("USUARIOS");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(850, 150));
        jPanel4.setRequestFocusEnabled(false);

        gbtnTipo.add(rbtnLocal);
        rbtnLocal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        rbtnLocal.setText("Local");
        rbtnLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnLocalMouseClicked(evt);
            }
        });

        gbtnTipo.add(rbtnGlobal);
        rbtnGlobal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        rbtnGlobal.setText("Global");
        rbtnGlobal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGlobalMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setText("TIPO DE BUSQUEDA");

        btnLlenar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnLlenar.setText("LLENAR");
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setText("BUSQUEDA ESPECIFICA");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Correo del Usuario");

        txtUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnGlobal)
                            .addComponent(rbtnLocal))
                        .addGap(58, 58, 58)
                        .addComponent(btnLlenar))
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbtnLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnGlobal))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnLlenar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(71, 71, 71))
        );

        btnMenu.setBackground(new java.awt.Color(0, 204, 204));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/home.png"))); // NOI18N
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PCMAKER/Buttons/salir.png"))); // NOI18N
        btnSalir1.setBorderPainted(false);
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.setPreferredSize(new java.awt.Dimension(73, 30));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

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

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        Administracion1 AD = new Administracion1(idEmpd);
        setVisible(false);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Administracion2 AD = new Administracion2(idEmpd);
        setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Administracion3 AD = new Administracion3(idEmpd);
        setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void jtbUserVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUserVentasMouseClicked
        //sitio = Integer.parseInt(jtbEmpleados.getValueAt(jtbEmpleados.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jtbUserVentasMouseClicked

    private void rbtnLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnLocalMouseClicked
        option = 1;
    }//GEN-LAST:event_rbtnLocalMouseClicked

    private void rbtnGlobalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGlobalMouseClicked
        option = 2;
    }//GEN-LAST:event_rbtnGlobalMouseClicked

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed
        if(option==1){
            Limpiar();
            cargar1();
        }else if(option==2){
            Limpiar();
            cargar1();
            cargar2();
            cargar3();
        }else{
            JOptionPane.showMessageDialog(null,"No has seleccionado el tipo de datos a mostrar","Verifica de nuevo por favor !!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLlenarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(option==1){
            Limpiar();
            buscar1();
        }else if(option==2){
            Limpiar();
            buscarGlobal();
        }else{
            JOptionPane.showMessageDialog(null,"El empleado que busca no se encuentra en ningun sitio","Verifica de nuevo por favor !!!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        MenuEmpleado MP = new MenuEmpleado(idEmpd);
        setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    public void Limpiar(){
        for (int i = 0; i < jtbUserVentas.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    
    public void cargar1(){
        Conectar1 conetc1 = new Conectar1();  //Conexion 
        Connection con1 = conetc1.conexion();//Conexion
        String datos[] = new String [3];
        try{
            Statement consul = con1.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras group by correo_user");
            while(resul.next()){
                datos[0]= resul.getString("correo_user");
                datos[1]= "1";
                datos[2]= resul.getString("total");
                modelo.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargar2(){
        Conectar2 conetc2 = new Conectar2();  //Conexion 
        Connection con2 = conetc2.conexion();//Conexion   
        String datos2[] = new String [3];
        try{
            Statement consul = con2.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras group by correo_user");
            while(resul.next()){
                datos2[0]= resul.getString("correo_user");
                datos2[1]= "2";
                datos2[2]= resul.getString("total");
                modelo.addRow(datos2);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargar3(){
        Conectar3 conetc3 = new Conectar3();//Conexion 
        Connection con3 = conetc3.conexion();//Conexion   
        String datos2[] = new String [3];
        try{
            Statement consul = con3.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras group by correo_user");
            while(resul.next()){
                datos2[0]= resul.getString("correo_user");
                datos2[1]= "3";
                datos2[2]= resul.getString("total");
                modelo.addRow(datos2);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscar1(){
        Conectar1 conetc1 = new Conectar1();  //Conexion 
        Connection con1 = conetc1.conexion();//Conexion
        String datos[] = new String [3];
        try{
            Statement consul = con1.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras where correo_user='" + txtUser.getText() + "'");
            if(resul.next()){
                datos[0]= resul.getString("correo_user");
                datos[1]= "1";
                datos[2]= resul.getString("total");
                modelo.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscar2(){
        Conectar2 conetc2 = new Conectar2();  //Conexion 
        Connection con2 = conetc2.conexion();//Conexion
        String datos[] = new String [3];
        try{
            Statement consul = con2.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras where correo_user='" + txtUser.getText() + "'");
            if(resul.next()){
                datos[0]= resul.getString("correo_user");
                datos[1]= "2";
                datos[2]= resul.getString("total");
                modelo.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscar3(){
        Conectar3 conetc3 = new Conectar3();  //Conexion 
        Connection con3 = conetc3.conexion();//Conexion
        String datos[] = new String [3];
        try{
            Statement consul = con3.createStatement();
            ResultSet resul = consul.executeQuery("select correo_user,sum(costo)as total from compras where correo_user='" + txtUser.getText() + "'");
            if(resul.next()){
                datos[0]= resul.getString("correo_user");
                datos[1]= "3";
                datos[2]= resul.getString("total");
                modelo.addRow(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscarGlobal(){
        Limpiar();
        buscar1();
        if(jtbUserVentas.getValueAt(0, 0)==null){
            buscar2();
            if(jtbUserVentas.getValueAt(0, 0)==null){
            buscar3();
        }
        }
    }
    
    public class Conectar1 {
    Connection conect1 = null; 
        public Connection conexion(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conect1 = DriverManager.getConnection("jdbc:mysql://localhost/project","super","123");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error de MySQL","Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException e){              
                JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            }
            return conect1;
        }
    }
    
    public class Conectar2 {
    Connection conect2 = null;  
        public Connection conexion(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conect2 = DriverManager.getConnection("jdbc:mysql://192.168.43.16:3306/project","super","123");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error de MySQL","Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException e){        
                JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            }
            return conect2;
        }
    }
    
    public class Conectar3 {
    Connection conect3 = null;  
        public Connection conexion(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conect3 = DriverManager.getConnection("jdbc:mysql://192.168.43.240:3306/project","super","123");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error de MySQL","Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            } catch(ClassNotFoundException e){        
                JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
            }
            return conect3;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JToggleButton btnLlenar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.ButtonGroup gbtnTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbUserVentas;
    private javax.swing.JRadioButton rbtnGlobal;
    private javax.swing.JRadioButton rbtnLocal;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}