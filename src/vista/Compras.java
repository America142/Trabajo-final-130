/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:3/junio/2022
Fecha de Actualización:23/junio/2022
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
    /** 
    /*declaraciòn de datatable, suma y list
    */
    private DefaultTableModel modeloTable;
    private double suma = 0.0;
    public List<Producto> listaProducto = new ArrayList<>();
    private ProductoController productoController;
    private DefaultListModel modelo = new DefaultListModel();

    /**
    /* contrurtror vacio de compras 
    */
    public Compras() {
        initComponents();

    }

    public Compras(List<Producto> listaProducto) {
    /**
    /* instancia,se crea que la pagina no se mueva
    */
    initComponents();  
    productoController = new ProductoController();
    this.listaProducto = listaProducto;
    modeloTable = (DefaultTableModel) jTable1.getModel();
    productoController.mostrarProductos(listaProducto, modeloTable);
    setResizable(false);
    setLocationRelativeTo(null);

    }

  
    public void actualizarList(List<Producto> lista) {
        /**
         * se crea el constructor de actualizar la lista 
         */
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
        Carrito = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(salida)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 440));

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_smallCompras.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto3.1_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(160, 160, 160)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
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

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 150, -1));

        cambio.setEditable(false);
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 580, 300));

        jList1.setToolTipText("");
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 390, 210));

        Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir-al-carrito(1).png"))); // NOI18N
        Carrito.setContentAreaFilled(false);
        Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoActionPerformed(evt);
            }
        });
        jPanel1.add(Carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 94, -1));

        jLabel5.setFont(new java.awt.Font("Waree", 3, 14)); // NOI18N
        jLabel5.setText("Lista de tus productos a comprar ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 280, 30));

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
/**
 * en el boton de añadir al carrito se van sumando los productos
 */
    private void CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoActionPerformed

        if (jTable1.getSelectedRow() > -1) {
            double precio = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            this.suma = suma + precio;
            jTextField1.setText(String.valueOf(suma));

            modelo.addElement(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
            modelo.addElement(jTable1.getValueAt(jTable1.getSelectedColumn(), 2));
            jList1.setModel(modelo);

        }
    }//GEN-LAST:event_CarritoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     *  aqui se hace la resta para darle su cambio al usuario
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double pagar = Double.parseDouble(this.pagar.getText());
        if(suma>pagar){
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad mayor a su total");
        }else{
            cambio.setText(String.valueOf(pagar - suma));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed

    }//GEN-LAST:event_cambioActionPerformed

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
       
    }//GEN-LAST:event_pagarActionPerformed

    /**
     * regresa a la ventana principal
     */
    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_salidaActionPerformed

    /**
     * valida que no entren numeros 
     */
    private void pagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagarKeyTyped
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se admiten numeros");
        }
    }//GEN-LAST:event_pagarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Carrito;
    private javax.swing.JTextField cambio;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
