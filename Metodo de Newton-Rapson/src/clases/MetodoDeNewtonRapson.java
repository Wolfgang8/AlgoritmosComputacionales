package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.math.plot.Plot2DPanel;
import org.nfunk.jep.JEP;

public class MetodoDeNewtonRapson extends javax.swing.JFrame {
    Plot2DPanel grafica = new Plot2DPanel();

    public MetodoDeNewtonRapson() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        funcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        x0 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        raiz = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        funcion1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        raiz1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        calcular1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imprimeIteraciones = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        numIteraciones = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        funcion.setEditable(false);
        funcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funcion.setText("x^3-2x^2+5");
        jPanel1.add(funcion);
        funcion.setBounds(60, 10, 170, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel2.setText("Raíz ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 220, 90, 30);

        x0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(x0);
        x0.setBounds(60, 50, 60, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel5.setText("  X   =");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 60, 20);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel6.setText("i");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 60, 50, 20);

        e.setEditable(false);
        e.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        e.setText("0.02");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel1.add(e);
        e.setBounds(90, 90, 60, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel7.setText("f (x) =");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 10, 70, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel8.setText("Tolerancia");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 90, 70, 30);

        n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n.setText("15");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n);
        n.setBounds(90, 180, 60, 30);

        raiz.setEditable(false);
        jPanel1.add(raiz);
        raiz.setBounds(40, 220, 260, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel9.setText("IterMáximas");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 180, 90, 30);

        calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcular.setText("Calcular raíz");
        calcular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel1.add(calcular);
        calcular.setBounds(220, 90, 150, 80);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 640, 620, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Autor: Darwin Morocho               Ing. En Computación Gráfica"));
        jPanel2.setLayout(null);
        jPanel2.add(funcion1);
        funcion1.setBounds(60, 40, 259, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel10.setText("  X   =");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 90, 70, 20);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel11.setText("Raíz ");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 140, 90, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel12.setText("= 0");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(320, 40, 41, 30);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel13.setText(" 1");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(160, 100, 50, 20);
        jPanel2.add(x2);
        x2.setBounds(60, 90, 78, 30);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel14.setText("  X   =");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 90, 70, 20);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel15.setText("    0");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 100, 70, 20);

        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });
        jPanel2.add(x3);
        x3.setBounds(190, 90, 80, 30);

        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel2.add(e1);
        e1.setBounds(360, 90, 80, 30);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel16.setText("f (x) =");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 40, 70, 30);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel17.setText("Tolerancia");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(290, 90, 70, 30);
        jPanel2.add(n1);
        n1.setBounds(540, 90, 80, 30);

        raiz1.setEditable(false);
        jPanel2.add(raiz1);
        raiz1.setBounds(60, 140, 260, 30);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel18.setText("IterMáximas");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(460, 90, 90, 30);

        calcular1.setText("calcular Raíz");
        calcular1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular1ActionPerformed(evt);
            }
        });
        jPanel2.add(calcular1);
        calcular1.setBounds(360, 30, 150, 50);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(10, 20, 610, 10);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(10, 180, 620, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        imprimeIteraciones.setEditable(false);
        imprimeIteraciones.setColumns(20);
        imprimeIteraciones.setRows(5);
        jScrollPane1.setViewportView(imprimeIteraciones);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(22, 50, 300, 190);

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel19.setText("Número de iteraciones ");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(20, 10, 170, 50);

        numIteraciones.setEditable(false);
        jPanel3.add(numIteraciones);
        numIteraciones.setBounds(170, 20, 40, 30);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcular1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x3ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        Newton m = new Newton();
        m.borrarColeccion();
        try {
            JEP j = new JEP();
            j.addStandardConstants();
            j.addStandardFunctions();

            String def = funcion.getText();
            j.parseExpression(x0.getText());
            double lx0 = j.getValue();

            j.parseExpression(e.getText());
            double tolerancia = j.getValue();
            int ln = Integer.parseInt(n.getText());

            Funcion f = new Funcion(def);
            Newton s = new Newton();
            String r = s.raiz(f, lx0, ln, tolerancia);
            if (r.equals("raíz no encontrada")) {
                imprimeIteraciones.setText("raíz no encontrada");
            } else {
                if (r.equals("división para cero encontrada")) {
                    imprimeIteraciones.setText("división para cero encontrada");
                } else {
                    raiz.setText(r);
                
                    numIteraciones.setText("");
                    imprimeIteraciones.setText("");
                    ArrayList iteraciones = new ArrayList();
                    iteraciones = Newton.getIteraciones();
                    numIteraciones.setText(Integer.toString(iteraciones.size() - 1));
                    
                    for (int i = 1; i < iteraciones.size(); i++) {
                        imprimeIteraciones.append("x" + i + "=" + iteraciones.get(i) + "\n");
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA LECTURA DE DATOS", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MetodoDeNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoDeNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoDeNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoDeNewtonRapson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoDeNewtonRapson().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JButton calcular1;
    private javax.swing.JTextField e;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField funcion;
    private javax.swing.JTextField funcion1;
    private javax.swing.JTextArea imprimeIteraciones;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField n;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField numIteraciones;
    private javax.swing.JTextField raiz;
    private javax.swing.JTextField raiz1;
    private javax.swing.JTextField x0;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables
}
