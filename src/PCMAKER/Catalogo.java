package PCMAKER;
import com.sun.awt.AWTUtilities;
import java.awt.*;
import java.awt.geom.*;
import java.sql.*;
import javax.swing.*;

public class Catalogo extends javax.swing.JFrame {
    Conectar conetc = new Conectar();  //Conexion 
    Connection con = conetc.conexion();//Conexion
    String []aux={"cpu","mother","ram","gpu","storage","power","cabinet","display","device","multimedia"};
    String temp,idUser,idEmpd;

    public Catalogo(String empd,String user) {
        this.setUndecorated(true); //Eliminar barra superior(minimizar,maximizar,cerrar).
        setVisible(true);
        initComponents();
        idEmpd = empd;
        idUser = user;
        this.setLocationRelativeTo(null); //Alinear pantalla al centro.
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27); //Bordes redondeados.
        AWTUtilities.setWindowShape(this,forma); //Aplicar bordes redondeados. 
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
        jlbImgComponent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbComponentes = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbLista = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(896, 50));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("CATALOGO DE COMPONENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
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

        jlbImgComponent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImgComponent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlbImgComponent.setPreferredSize(new java.awt.Dimension(350, 350));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("PRECIO            $");

        txtPrecio.setBackground(new java.awt.Color(255, 102, 102));
        txtPrecio.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel26.setText("DISPONIBLES");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(580, 460));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("BUSQUEDAS");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setText("Componente");

        cmbComponentes.setEditable(true);
        cmbComponentes.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        cmbComponentes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Procesador", "Motherboard", "Memoria RAM", "Tarjeta Grafica", "Almacenamiento", "Fuente de Poder", "Gabinete", "Monitor", "Perifericos", "Multimedia" }));
        cmbComponentes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbComponentesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setText("Lista");

        cmbLista.setEditable(true);
        cmbLista.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        cmbLista.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbListaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("DESCRIPCION");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlbImgComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlbImgComponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
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

    private void cmbComponentesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbComponentesPopupMenuWillBecomeInvisible
        temp=aux[cmbComponentes.getSelectedIndex()];    
        cmbLista.removeAllItems();
        try {
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from " + temp);
            while(resul.next()){
                cmbLista.addItem(resul.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbComponentesPopupMenuWillBecomeInvisible

    private void cmbListaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbListaPopupMenuWillBecomeInvisible
        String a;
        try {
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from " + temp);
            while(resul.next()){
                a=resul.getString("id_"+temp);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        mostrarImagen();
        switch(temp){
            case "cpu":
                mostrarCpu();
            break;
            case "mother":
                mostrarMother();
            break;
            case "ram":
                mostrarRam();
            break;
            case "gpu":
                mostrarGpu();
            break;
            case "storage":
                mostrarStorage();
            break;
            case "power":
                mostrarPower();
            break;
            case "cabinet":
                mostrarCabinet();
            break;
            case "display":
                mostrarDisplay();
            break;
            case "device":
                mostrarDevice();
            break;
            case "multimedia":
                mostrarMultimedia();
            break;
        }
    }//GEN-LAST:event_cmbListaPopupMenuWillBecomeInvisible

    public void mostrarImagen(){
        ImageIcon IMGcpu = new ImageIcon(getClass().getResource("Img" + temp + "/" + cmbLista.getSelectedItem() + ".jpg"));
        ImageIcon icono = new ImageIcon(IMGcpu.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT));
        jlbImgComponent.setIcon(icono);
    }
    
    public void mostrarCpu(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from cpu");
            while(resul.next()){
                tp = resul.getString("id_cpu");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Socket: " + resul.getString("socket") + "\n";
                    datos += "Generacion: " + resul.getString("generacion") + "\n";
                    datos += "Familia: " + resul.getString("familia") + "\n";
                    datos += "Nucleos: " + resul.getString("nucleos") + "\n";
                    datos += "Subprocesos: " + resul.getString("subprocesos") + "\n";
                    datos += "Frecuencia: " + resul.getString("frecuencia") + "\n";
                    datos += "Cache: " + resul.getString("cache") + "\n";
                    datos += "TDP: " + resul.getString("tdp") + "\n";
                    datos += "Litografia: " + resul.getString("litografia");
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    public void mostrarMother(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from mother");
            while(resul.next()){
                tp = resul.getString("id_mother");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Socket: " + resul.getString("socket") + "\n";
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Chipset: " + resul.getString("chipset") + "\n";
                    datos += "Memoria: " + resul.getString("memoria") + "\n";
                    datos += "Frecuencia: " + resul.getString("frecuencia") + "\n";
                    datos += "Maximo: " + resul.getString("maximo") + "\n";
                    datos += "Formato: " + resul.getString("formato");
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    public void mostrarRam(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from ram");
            while(resul.next()){
                tp = resul.getString("id_ram");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Capacidad: " + resul.getString("capacidad") + "\n";
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Frecuencia: " + resul.getString("frecuencia") + "\n";
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    public void mostrarGpu(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from gpu");
            while(resul.next()){
                tp = resul.getString("id_gpu");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Memoria: " + resul.getString("memoria") + "\n";
                    datos += "Frecuencia: " + resul.getString("frecuencia") + "\n";
                    datos += "TDP: " + resul.getString("tdp") + "\n";
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    public void mostrarStorage(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from storage");
            while(resul.next()){
                tp = resul.getString("id_storage");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Formato: " + resul.getString("formato") + "\n";
                    datos += "Interface: " + resul.getString("interface") + "\n";
                    datos += "Capacidad: " + resul.getString("capacidad");
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    public void mostrarPower(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from power");
            while(resul.next()){
                tp = resul.getString("id_power");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Capacidad: " + resul.getString("capacidad") + "\n";
                    datos += "Certificacion: " + resul.getString("certificacion") + "\n";
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Formato: " + resul.getString("formato");
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    public void mostrarCabinet(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from cabinet");
            while(resul.next()){
                tp = resul.getString("id_cabinet");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Formato: " + resul.getString("formato") + "\n";
                    datos += "Fans: " + resul.getString("fans") + "\n";
                    datos += "Tamaño: " + resul.getString("tamano") + "\n";
                    datos += "Optica: " + resul.getString("optica") + "\n";
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    public void mostrarDisplay(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from display");
            while(resul.next()){
                tp = resul.getString("id_display");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Diagonal: " + resul.getString("diagonal") + "\n";
                    datos += "Resolucion: " + resul.getString("resolucion") + "\n";
                    datos += "Velocidad: " + resul.getString("velocidad") + "\n";
                    datos += "Panel: " + resul.getString("panel") + "\n";
                    datos += "Conexion: " + resul.getString("conexion") + "\n";
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    public void mostrarDevice(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from device");
            while(resul.next()){
                tp = resul.getString("id_device");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Sector: " + resul.getString("sector") + "\n";
                    datos += "Iluminacion: " + resul.getString("iluminacion") + "\n";
                    datos += "Funcionamiento: " + resul.getString("funcionamiento") + "\n";
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    public void mostrarMultimedia(){
        String tp,datos="";
        try{
            Statement consul = con.createStatement();
            ResultSet resul = consul.executeQuery("select * from multimedia");
            while(resul.next()){
                tp = resul.getString("id_multimedia");
                if (tp.equals(cmbLista.getSelectedItem()+"")) {
                    datos += "Tipo: " + resul.getString("tipo") + "\n";
                    datos += "Marca: " + resul.getString("marca") + "\n";
                    datos += "Modelo: " + resul.getString("modelo") + "\n";
                    datos += "Caracteristica: " + resul.getString("caracteristica");
                    txtPrecio.setText(resul.getDouble("precio")+"");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se ha encontrado el siguiente error \n" + e,"Error detectado! ! !",JOptionPane.ERROR_MESSAGE);
        }
        txtDescripcion.setText(datos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbComponentes;
    private javax.swing.JComboBox cmbLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbImgComponent;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}