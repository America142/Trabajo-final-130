/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:3/junio/2022
Fecha de Actualización:23/junio/2022
descripción: esta es la vista 1 es la pantalla principal del programa

 */
package vista;

import pojo.Producto;
import java.util.ArrayList;
import java.util.List;
import utilidades.UtilidadesProducto;

public class Principal extends javax.swing.JFrame {
/**
 * se declaran las variables 
*/
    private List<Producto> listaProducto;

    public Principal() {
        initComponents();
        listaProducto = new ArrayList<>();
        listaProducto = UtilidadesProducto.cargarProductos(listaProducto);
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public Principal(List<Producto> listaProducto) {
/**
 * En este constructor se hace referencia al metodo
 */
       this.listaProducto = listaProducto;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productos = new javax.swing.JButton();
        compras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_small.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 390, 230));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 30, -1));

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos(2).png"))); // NOI18N
        productos.setText("Productos");
        productos.setBorder(null);
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        jPanel1.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, 50));

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cesta-de-la-compra.png"))); // NOI18N
        compras.setText("Compras");
        compras.setBorder(null);
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jPanel1.add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 140, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uno-removebg-preview1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/despensa1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 300, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 *  Este es el boton para ir a las compras 
 */
    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        new Compras(listaProducto).setVisible(true);
        this.hide();
    }//GEN-LAST:event_comprasActionPerformed

    /**
     *este es el boton para ir a los productos y se crea una Produvtos lista 
     */
    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
         new Productos(listaProducto).setVisible(true);
        this.hide();
    }//GEN-LAST:event_productosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton productos;
    // End of variables declaration//GEN-END:variables
}
