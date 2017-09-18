
package Empleado;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;

import javax.swing.*;
import javax.swing.JOptionPane;


public class eliminarEmpleado extends javax.swing.JFrame {

   
    public eliminarEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/fo.jpg"));
        JLabel fondo = new JLabel();
        
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        this.add(fondo);
    }

   
    archivoEmpleado archivoEmpleado = new archivoEmpleado();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnEliminarE = new javax.swing.JButton();
        BtnSAlir = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Eliminar Empleado");
        setBackground(new java.awt.Color(0, 255, 153));
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(0, 204, 204));
        panel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese Codigo");

        btnEliminarE.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminarE.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEliminarE.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarE.setText("Eliminar");
        btnEliminarE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEActionPerformed(evt);
            }
        });

        BtnSAlir.setBackground(new java.awt.Color(153, 0, 51));
        BtnSAlir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BtnSAlir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSAlir.setText("Salir");
        BtnSAlir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSAlir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSAlirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSAlir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSAlir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Eliminar Empleado");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEActionPerformed
      
        //eliminar empleado
        
        try {
            

            archivoEmpleado.recuperar();
        } catch (IOException ex) {
            Logger.getLogger(eliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(eliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String codigo;
        Empleado em;
        boolean estado=false;
        codigo = txtCodigo.getText();
        
        JOptionPane.showMessageDialog(this,ingresarEmpleado.lc.size());
        
        for(int i=0;i<ingresarEmpleado.lc.size();i++){
            
            em = (Empleado)ingresarEmpleado.lc.get(i);
            
            if(codigo.equals(em.getCodigoTrabajador())){
                estado=true;               
                ingresarEmpleado.lc.remove(em);              
            }
                   
        }
        
        if(estado==false){
           JOptionPane.showMessageDialog(this,"EMPLEADO NO REGISTRADO!!");
        }
        else {
            JOptionPane.showMessageDialog(this,"EMPLEADO ELIMINADO");
        }
        
        txtCodigo.setText("");
        
        try {
            archivoEmpleado.grabar();
        } catch (IOException ex) {
            Logger.getLogger(eliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(eliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEliminarEActionPerformed

    private void BtnSAlirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSAlirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSAlirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSAlir;
    private javax.swing.JButton btnEliminarE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
