/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

/**
 *
 * @author kevin
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.FondoCrear.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LayeredPane = new javax.swing.JLayeredPane();
        FondoCrear = new javax.swing.JPanel();
        FormCrear = new javax.swing.JPanel();
        TitleCrear = new javax.swing.JLabel();
        NametxfC = new javax.swing.JTextField();
        ContraseñatxfC = new javax.swing.JTextField();
        EmailtxfC = new javax.swing.JTextField();
        ConfirmarbtnC = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        Form = new javax.swing.JPanel();
        TitleInicio = new javax.swing.JLabel();
        Nametxf = new javax.swing.JTextField();
        Contraseñatxf = new javax.swing.JTextField();
        Confirmarbtn = new javax.swing.JButton();
        CrearCuentaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1308, 730));
        setSize(new java.awt.Dimension(1308, 730));

        LayeredPane.setMaximumSize(new java.awt.Dimension(1288, 696));
        LayeredPane.setMinimumSize(new java.awt.Dimension(1288, 696));

        FondoCrear.setBackground(new java.awt.Color(25, 37, 77));
        FondoCrear.setEnabled(false);
        FondoCrear.setFocusable(false);

        FormCrear.setBackground(new java.awt.Color(67, 72, 121));
        FormCrear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TitleCrear.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        TitleCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleCrear.setText("Crear Cuenta");

        NametxfC.setBackground(new java.awt.Color(200, 191, 191));
        NametxfC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        NametxfC.setText(" Nombre");
        NametxfC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        NametxfC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NametxfCFocusLost(evt);
            }
        });
        NametxfC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NametxfCMouseClicked(evt);
            }
        });

        ContraseñatxfC.setBackground(new java.awt.Color(200, 191, 191));
        ContraseñatxfC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ContraseñatxfC.setText(" Contraseña");
        ContraseñatxfC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ContraseñatxfC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñatxfCFocusLost(evt);
            }
        });
        ContraseñatxfC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñatxfCMouseClicked(evt);
            }
        });

        EmailtxfC.setBackground(new java.awt.Color(200, 191, 191));
        EmailtxfC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EmailtxfC.setText(" Email");
        EmailtxfC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        EmailtxfC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailtxfCFocusLost(evt);
            }
        });
        EmailtxfC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailtxfCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FormCrearLayout = new javax.swing.GroupLayout(FormCrear);
        FormCrear.setLayout(FormCrearLayout);
        FormCrearLayout.setHorizontalGroup(
            FormCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormCrearLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(FormCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NametxfC)
                    .addComponent(TitleCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(ContraseñatxfC)
                    .addComponent(EmailtxfC))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        FormCrearLayout.setVerticalGroup(
            FormCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormCrearLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TitleCrear)
                .addGap(40, 40, 40)
                .addComponent(NametxfC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(EmailtxfC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(ContraseñatxfC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ConfirmarbtnC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ConfirmarbtnC.setText("Confirmar");
        ConfirmarbtnC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ConfirmarbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarbtnCActionPerformed(evt);
            }
        });

        VolverBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoCrearLayout = new javax.swing.GroupLayout(FondoCrear);
        FondoCrear.setLayout(FondoCrearLayout);
        FondoCrearLayout.setHorizontalGroup(
            FondoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCrearLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(FondoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoCrearLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(ConfirmarbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCrearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FondoCrearLayout.setVerticalGroup(
            FondoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCrearLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(FormCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(ConfirmarbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Fondo.setBackground(new java.awt.Color(25, 37, 77));

        Form.setBackground(new java.awt.Color(67, 72, 121));
        Form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TitleInicio.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        TitleInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleInicio.setText("Iniciar Sesión");

        Nametxf.setBackground(new java.awt.Color(200, 191, 191));
        Nametxf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Nametxf.setText(" Nombre");
        Nametxf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Nametxf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NametxfFocusLost(evt);
            }
        });
        Nametxf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NametxfMouseClicked(evt);
            }
        });

        Contraseñatxf.setBackground(new java.awt.Color(200, 191, 191));
        Contraseñatxf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Contraseñatxf.setText(" Contraseña");
        Contraseñatxf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Contraseñatxf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñatxfFocusLost(evt);
            }
        });
        Contraseñatxf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñatxfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nametxf)
                    .addComponent(TitleInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(Contraseñatxf))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TitleInicio)
                .addGap(49, 49, 49)
                .addComponent(Nametxf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(Contraseñatxf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        Confirmarbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Confirmarbtn.setText("Confirmar");
        Confirmarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Confirmarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarbtnActionPerformed(evt);
            }
        });

        CrearCuentaBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CrearCuentaBtn.setText("Crear Cuenta");
        CrearCuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CrearCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(Confirmarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CrearCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Confirmarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CrearCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        LayeredPane.setLayer(FondoCrear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPane.setLayer(Fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPaneLayout = new javax.swing.GroupLayout(LayeredPane);
        LayeredPane.setLayout(LayeredPaneLayout);
        LayeredPaneLayout.setHorizontalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayeredPaneLayout.setVerticalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NametxfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NametxfFocusLost
        if(this.Nametxf.getText().equals("")){
            this.Nametxf.setText(" Nombre");
        }
    }//GEN-LAST:event_NametxfFocusLost

    private void NametxfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NametxfMouseClicked
        if(this.Nametxf.getText().equals(" Nombre")){
            this.Nametxf.setText("");
        }
    }//GEN-LAST:event_NametxfMouseClicked

    private void ContraseñatxfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñatxfFocusLost
        if(this.Contraseñatxf.getText().equals("")){
            this.Contraseñatxf.setText(" Contraseña");
        }
    }//GEN-LAST:event_ContraseñatxfFocusLost

    private void ContraseñatxfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñatxfMouseClicked
        if(this.Contraseñatxf.getText().equals(" Contraseña")){
            this.Contraseñatxf.setText("");
        }
    }//GEN-LAST:event_ContraseñatxfMouseClicked

    private void NametxfCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NametxfCFocusLost
        if(this.NametxfC.getText().equals("")){
            this.NametxfC.setText(" Nombre");
        }
    }//GEN-LAST:event_NametxfCFocusLost

    private void NametxfCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NametxfCMouseClicked
        if(this.NametxfC.getText().equals(" Nombre")){
            this.NametxfC.setText("");
        }
    }//GEN-LAST:event_NametxfCMouseClicked

    private void ContraseñatxfCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñatxfCFocusLost
        if(this.ContraseñatxfC.getText().equals("")){
            this.ContraseñatxfC.setText(" Contraseña");
        }
    }//GEN-LAST:event_ContraseñatxfCFocusLost

    private void ContraseñatxfCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñatxfCMouseClicked
        if(this.ContraseñatxfC.getText().equals(" Contraseña")){
            this.ContraseñatxfC.setText("");
        }
    }//GEN-LAST:event_ContraseñatxfCMouseClicked

    private void EmailtxfCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailtxfCFocusLost
        if(this.EmailtxfC.getText().equals("")){
            this.EmailtxfC.setText(" Email");
        }
    }//GEN-LAST:event_EmailtxfCFocusLost

    private void EmailtxfCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailtxfCMouseClicked
        if(this.EmailtxfC.getText().equals(" Email")){
            this.EmailtxfC.setText("");
        }
    }//GEN-LAST:event_EmailtxfCMouseClicked

    private void CrearCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaBtnActionPerformed
        this.Fondo.setEnabled(false);
        this.Fondo.setFocusable(false);
        this.Fondo.setVisible(false);
        this.FondoCrear.setEnabled(true);
        this.FondoCrear.setFocusable(true);
        this.FondoCrear.setVisible(true);
    }//GEN-LAST:event_CrearCuentaBtnActionPerformed

    private void ConfirmarbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarbtnCActionPerformed
        System.out.println("hola");        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarbtnCActionPerformed

    private void ConfirmarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarbtnActionPerformed
        System.out.println("hola...");        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarbtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        this.Fondo.setEnabled(true);
        this.Fondo.setFocusable(true);
        this.Fondo.setVisible(true);
        this.FondoCrear.setEnabled(false);
        this.FondoCrear.setFocusable(false);
        this.FondoCrear.setVisible(false);
    }//GEN-LAST:event_VolverBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmarbtn;
    private javax.swing.JButton ConfirmarbtnC;
    private javax.swing.JTextField Contraseñatxf;
    private javax.swing.JTextField ContraseñatxfC;
    private javax.swing.JButton CrearCuentaBtn;
    private javax.swing.JTextField EmailtxfC;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel FondoCrear;
    private javax.swing.JPanel Form;
    private javax.swing.JPanel FormCrear;
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JTextField Nametxf;
    private javax.swing.JTextField NametxfC;
    private javax.swing.JLabel TitleCrear;
    private javax.swing.JLabel TitleInicio;
    private javax.swing.JButton VolverBtn;
    // End of variables declaration//GEN-END:variables
}
