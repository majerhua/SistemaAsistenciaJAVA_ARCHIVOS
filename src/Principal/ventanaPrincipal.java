/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Departamento.ingresarDepartamentos;
import Vacaciones.ingresarVacaciones;
import Empleado.ventanaEmpleado;
import javax.swing.*;


public class ventanaPrincipal extends javax.swing.JFrame {

   
    public ventanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
       // setSize(800,500);
       
         ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/fo.jpg"));
        JLabel fondo = new JLabel();
        
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        this.add(fondo);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTrabajadores = new javax.swing.JMenu();
        menuItemEmpleado = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1721, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabaja.jpg"))); // NOI18N

        jMenuTrabajadores.setBackground(new java.awt.Color(0, 102, 153));
        jMenuTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenuTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/t.png"))); // NOI18N
        jMenuTrabajadores.setText("Trabajodres");
        jMenuTrabajadores.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        menuItemEmpleado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        menuItemEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.jpg"))); // NOI18N
        menuItemEmpleado.setText("Empleados");
        menuItemEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuItemEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpleadoActionPerformed(evt);
            }
        });
        jMenuTrabajadores.add(menuItemEmpleado);

        jMenuBar1.add(jMenuTrabajadores);

        jMenuSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dep.jpg"))); // NOI18N
        jMenuSalir.setText("Departamento");
        jMenuSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/t2.jpg"))); // NOI18N
        jMenuItem1.setText("Departamentos");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItem1);

        jMenuBar1.add(jMenuSalir);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saa.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saaa.png"))); // NOI18N
        jMenuItem6.setText("Salir");
        jMenuItem6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpleadoActionPerformed
        
        ventanaEmpleado ventEmpleado = new ventanaEmpleado();
        ventEmpleado.setVisible(true);
        
        
    }//GEN-LAST:event_menuItemEmpleadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        ingresarDepartamentos id = new ingresarDepartamentos();
        id.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuTrabajadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuItemEmpleado;
    // End of variables declaration//GEN-END:variables
}
