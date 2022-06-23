/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:3/junio/2022
Fecha de Actualización:23/junio/2022
descripción:es la vista donde se pueden agregar productos 

 */
package vista;

import controller.ProductoController;
import pojo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {

    private ProductoController productoController;
    private List<Producto> listaProducto;
    private DefaultTableModel modeloTable;
    private DefaultTableModel modelo;

    public Productos(List<Producto> listaProducto) {
        initComponents();
        
        /**se crea un objeto producto Controller  se señala la lista de productos 
        *se van insertando en la tabla
        */
        productoController = new ProductoController();

        this.listaProducto = listaProducto;

        modelo = (DefaultTableModel) jTable1.getModel();
        modeloTable = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(modeloTable);

        for (int i = 0; i < listaProducto.size(); i++) {

            String fila[] = new String[3];

            fila[0] = listaProducto.get(i).getId();
            fila[1] = listaProducto.get(i).getNombre();
            fila[2] = listaProducto.get(i).getPrecio();

            modeloTable.addRow(fila);
            setResizable(false);
            setLocationRelativeTo(null);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir-al-carrito.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agotado(2).png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacia-atras(1).png"))); // NOI18N
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 500));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(102, 0, 255))); // NOI18N
        jTable1.setFont(new java.awt.Font("Waree", 3, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 730, 390));

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });
        panel1.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 90, -1));

        jLabel2.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel2.setText("Id");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 20, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        panel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 90, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel3.setText("Nombre");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel4.setText("Precio");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_small_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto3.1_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 140));

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioKeyTyped(evt);
            }
        });
        panel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed

    }//GEN-LAST:event_IdActionPerformed
/**
 * Este boton es para eliminar
 */
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        productoController.eliminarProducto(listaProducto, nombre);
        productoController.mostrarProductos(listaProducto, modelo);
        Precio.setText("");
        Nombre.setText("");
        Id.setText("");


    }//GEN-LAST:event_EliminarActionPerformed

    /**
     *  este es el boton para agregar los productos a la tienda se hace una validacion de que los campos no esten vacios 
     */
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
   
        if (Precio.getText().isEmpty() && Nombre.getText().isEmpty() && Id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tienes que rellenar los campos.");
        } else {

            Producto producto = new Producto();
            producto.setId(Precio.getText());
            producto.setNombre(Nombre.getText());
            producto.setPrecio(Id.getText());

            Precio.setText("");
            Nombre.setText("");
            Id.setText("");

            productoController.crearProducto(listaProducto, producto);
            productoController.mostrarProductos(listaProducto, modelo);
        }
    }//GEN-LAST:event_agregarActionPerformed

    /**
     * con este boton se regresara a la ventana principa
     */
    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        Principal principal = new Principal(listaProducto);
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    /**
     * Este es codigo para validar que no entren numeros 
     */
    private void PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioKeyTyped
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros");
        }
    }//GEN-LAST:event_PrecioKeyTyped

    /**
     * Este es codigo para validar que no entren numeros 
     */
    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros");
        }
        
    }//GEN-LAST:event_IdKeyTyped

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    /**
    * valida que no entren letras
    */
    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        char c = evt.getKeyChar();
        if((c< 'a' || c> 'z') && (c< 'A') |(c> 'Z'))
            evt.consume();
    }//GEN-LAST:event_NombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JButton Salida;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
