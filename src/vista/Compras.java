/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:3/junio/2022
Fecha de Actualización:9/junio/2022
descripción:Esta es la última ventana

 */
package vista;

import controller.ProductoController;
import pojo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JFrame {
    // declaraciòn de datatable

    private DefaultTableModel modeloTable;
    private double suma = 0.0;
    public List<Producto> listaProducto = new ArrayList<>();
    private ProductoController productoController;
    private DefaultListModel modelo = new DefaultListModel();

    public Compras() {
        initComponents();
       
        
    }
    
    public Compras(List<Producto> listaProducto) {
        initComponents();
       
        productoController = new ProductoController();
        this.listaProducto = listaProducto;
        modeloTable = (DefaultTableModel) jTable1.getModel();
        productoController.mostrarProductos(listaProducto, modeloTable);
         setResizable(false);
        setLocationRelativeTo(null);
        
    }
    
    // se crea el constructor de actualizar la lista 
    public void actualizarList(List<Producto> lista){
        this.listaProducto = lista;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salida = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pagar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        cambio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacia-atras(1).png"))); // NOI18N
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(salida)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 480));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_smallCompras.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(778, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        pagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagarKeyTyped(evt);
            }
        });
        jPanel1.add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 150, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 150, -1));

        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        jPanel1.add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 150, -1));

        jLabel1.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 80, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pago-en-efectivo(1).png"))); // NOI18N
        jButton3.setText("Pagar");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 150, 40));

        jLabel2.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jLabel2.setText("Cambio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 80, -1));

        jTable1.setForeground(new java.awt.Color(51, 0, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 580, 300));

        jList1.setToolTipText("");
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 320, 240));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir-al-carrito(1).png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 94, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // en el boton de añadir al carrito se van sumando los productos
       //se valida que no se seleccionen campos vacios
        if (jTable1.getSelectedRow() > -1) {
            double precio = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            this.suma = suma + precio;
            jTextField1.setText(String.valueOf(suma));
           
         modelo.addElement(jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn()));
        jList1.setModel(modelo);
        
        } else {
            JOptionPane.showMessageDialog(null, "Seleciona un registro de la tabla.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // aqui se hace la resta para darle su cambio al usuario
        double pagar = Double.parseDouble(this.pagar.getText());
        
        cambio.setText(String.valueOf(pagar - suma));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
   
    }//GEN-LAST:event_cambioActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        // aqui es donde el usuario ingresa el monto a pagar
    }//GEN-LAST:event_pagarActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        //este es el boton salir 
        //this.hide();
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_salidaActionPerformed

    private void pagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagarKeyTyped
         char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros");
        }
    }//GEN-LAST:event_pagarKeyTyped

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cambio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pagar;
    private javax.swing.JButton salida;
    // End of variables declaration//GEN-END:variables
}
