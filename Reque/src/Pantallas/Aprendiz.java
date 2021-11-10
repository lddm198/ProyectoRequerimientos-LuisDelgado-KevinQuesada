/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionDB.Controller;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import reque.Publicacion;
import reque.User;

/**
 *
 * @author kevin
 */
public class Aprendiz extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    User usuario;
    Controller control;
    public Aprendiz(User usuario, Controller control) {
        initComponents();
        this.FondoVerPublicacion.setVisible(false);
        this.FondoComent.setVisible(false);
        this.usuario = usuario;
        this.control = control;
        
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
        FondoVerPublicacion = new javax.swing.JPanel();
        ComentarPublicacion = new javax.swing.JButton();
        PublicacionVolver = new javax.swing.JButton();
        jScrollPanePubli = new javax.swing.JScrollPane();
        jTextAreaPubli = new javax.swing.JTextArea();
        jScrollPaneComent = new javax.swing.JScrollPane();
        jTextAreaComent = new javax.swing.JTextArea();
        GuardarPublicacion = new javax.swing.JButton();
        jScrollPaneComentar = new javax.swing.JScrollPane();
        jTextAreaComentar = new javax.swing.JTextArea();
        jScrollPaneTitulo = new javax.swing.JScrollPane();
        jTextAreaTitulo = new javax.swing.JTextArea();
        FondoInicioAprendiz = new javax.swing.JPanel();
        InicioAprendiz = new javax.swing.JPanel();
        CuentaBtn = new javax.swing.JButton();
        GuardadasBtn = new javax.swing.JButton();
        SeguirMaestroBtn = new javax.swing.JButton();
        CarrarSesionBtn = new javax.swing.JButton();
        MaestroNametf = new javax.swing.JTextField();
        BuscarMaestroBtn = new javax.swing.JButton();
        PaginaInicioBtn = new javax.swing.JButton();
        jScrollPaneInicio = new javax.swing.JScrollPane();
        jPanelInicio = new javax.swing.JPanel();
        FondoComent = new javax.swing.JPanel();
        ConfirmarComent = new javax.swing.JButton();
        CancelarComent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1288, 696));
        setSize(new java.awt.Dimension(1288, 696));

        FondoVerPublicacion.setBackground(new java.awt.Color(25, 37, 77));
        FondoVerPublicacion.setEnabled(false);
        FondoVerPublicacion.setFocusable(false);

        ComentarPublicacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ComentarPublicacion.setText("Comentar");
        ComentarPublicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ComentarPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarPublicacionActionPerformed(evt);
            }
        });

        PublicacionVolver.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PublicacionVolver.setText("Volver");
        PublicacionVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PublicacionVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicacionVolverActionPerformed(evt);
            }
        });

        jTextAreaPubli.setEditable(false);
        jTextAreaPubli.setColumns(20);
        jTextAreaPubli.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jTextAreaPubli.setRows(5);
        jTextAreaPubli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextAreaPubli.setFocusable(false);
        jScrollPanePubli.setViewportView(jTextAreaPubli);

        jTextAreaComent.setEditable(false);
        jTextAreaComent.setColumns(10);
        jTextAreaComent.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextAreaComent.setRows(5);
        jTextAreaComent.setText("\n");
        jTextAreaComent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextAreaComent.setFocusable(false);
        jScrollPaneComent.setViewportView(jTextAreaComent);

        GuardarPublicacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        GuardarPublicacion.setText("Guardar");
        GuardarPublicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        GuardarPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPublicacionActionPerformed(evt);
            }
        });

        jTextAreaComentar.setColumns(10);
        jTextAreaComentar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextAreaComentar.setRows(2);
        jTextAreaComentar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPaneComentar.setViewportView(jTextAreaComentar);

        jScrollPaneTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTextAreaTitulo.setEditable(false);
        jTextAreaTitulo.setColumns(20);
        jTextAreaTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jTextAreaTitulo.setRows(1);
        jTextAreaTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPaneTitulo.setViewportView(jTextAreaTitulo);

        javax.swing.GroupLayout FondoVerPublicacionLayout = new javax.swing.GroupLayout(FondoVerPublicacion);
        FondoVerPublicacion.setLayout(FondoVerPublicacionLayout);
        FondoVerPublicacionLayout.setHorizontalGroup(
            FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerPublicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneComent, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jScrollPaneComentar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoVerPublicacionLayout.createSequentialGroup()
                        .addComponent(ComentarPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(GuardarPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(PublicacionVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPanePubli, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneTitulo))
                .addContainerGap())
        );
        FondoVerPublicacionLayout.setVerticalGroup(
            FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerPublicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneComent)
                    .addGroup(FondoVerPublicacionLayout.createSequentialGroup()
                        .addComponent(jScrollPaneTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPanePubli, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoVerPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PublicacionVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComentarPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GuardarPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneComentar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        FondoInicioAprendiz.setBackground(new java.awt.Color(25, 37, 77));

        InicioAprendiz.setBackground(new java.awt.Color(67, 72, 121));
        InicioAprendiz.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        CuentaBtn.setBackground(new java.awt.Color(200, 191, 191));
        CuentaBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CuentaBtn.setText("Editar Cuenta");
        CuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        GuardadasBtn.setBackground(new java.awt.Color(200, 191, 191));
        GuardadasBtn.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        GuardadasBtn.setText("Publicaciones Guardadas");
        GuardadasBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        GuardadasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardadasBtnActionPerformed(evt);
            }
        });

        SeguirMaestroBtn.setBackground(new java.awt.Color(200, 191, 191));
        SeguirMaestroBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        SeguirMaestroBtn.setText("Seguir Maestro");
        SeguirMaestroBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SeguirMaestroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguirMaestroBtnActionPerformed(evt);
            }
        });

        CarrarSesionBtn.setBackground(new java.awt.Color(200, 191, 191));
        CarrarSesionBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CarrarSesionBtn.setText("Cerrar Sesión");
        CarrarSesionBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CarrarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrarSesionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioAprendizLayout = new javax.swing.GroupLayout(InicioAprendiz);
        InicioAprendiz.setLayout(InicioAprendizLayout);
        InicioAprendizLayout.setHorizontalGroup(
            InicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioAprendizLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(CuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(InicioAprendizLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarrarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeguirMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardadasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InicioAprendizLayout.setVerticalGroup(
            InicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioAprendizLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(CuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(GuardadasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(SeguirMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(CarrarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        MaestroNametf.setBackground(new java.awt.Color(200, 191, 191));
        MaestroNametf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        MaestroNametf.setText(" Buscar Maestro");
        MaestroNametf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MaestroNametf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaestroNametfFocusLost(evt);
            }
        });
        MaestroNametf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaestroNametfMouseClicked(evt);
            }
        });

        BuscarMaestroBtn.setBackground(new java.awt.Color(200, 191, 191));
        BuscarMaestroBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BuscarMaestroBtn.setText("Go");
        BuscarMaestroBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        PaginaInicioBtn.setBackground(new java.awt.Color(200, 191, 191));
        PaginaInicioBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PaginaInicioBtn.setText("Inicio");
        PaginaInicioBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jScrollPaneInicio.setBackground(new java.awt.Color(25, 37, 77));
        jScrollPaneInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanelInicio.setBackground(new java.awt.Color(25, 37, 77));
        jPanelInicio.setAutoscrolls(true);
        jPanelInicio.setLayout(new java.awt.GridLayout(100, 0, 0, 25));
        jScrollPaneInicio.setViewportView(jPanelInicio);

        javax.swing.GroupLayout FondoInicioAprendizLayout = new javax.swing.GroupLayout(FondoInicioAprendiz);
        FondoInicioAprendiz.setLayout(FondoInicioAprendizLayout);
        FondoInicioAprendizLayout.setHorizontalGroup(
            FondoInicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioAprendizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InicioAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoInicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoInicioAprendizLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(PaginaInicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaestroNametf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(FondoInicioAprendizLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPaneInicio)
                        .addContainerGap())))
        );
        FondoInicioAprendizLayout.setVerticalGroup(
            FondoInicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioAprendizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoInicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InicioAprendiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FondoInicioAprendizLayout.createSequentialGroup()
                        .addGroup(FondoInicioAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaestroNametf, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(PaginaInicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        FondoComent.setBackground(new java.awt.Color(25, 37, 77));
        FondoComent.setEnabled(false);
        FondoComent.setFocusable(false);

        ConfirmarComent.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ConfirmarComent.setText("Comentar");
        ConfirmarComent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ConfirmarComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarComentActionPerformed(evt);
            }
        });

        CancelarComent.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CancelarComent.setText("Cancelar");
        CancelarComent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CancelarComent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarComentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoComentLayout = new javax.swing.GroupLayout(FondoComent);
        FondoComent.setLayout(FondoComentLayout);
        FondoComentLayout.setHorizontalGroup(
            FondoComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoComentLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(ConfirmarComent, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(CancelarComent, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        FondoComentLayout.setVerticalGroup(
            FondoComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoComentLayout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .addGroup(FondoComentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarComent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarComent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        LayeredPane.setLayer(FondoVerPublicacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPane.setLayer(FondoInicioAprendiz, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPane.setLayer(FondoComent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPaneLayout = new javax.swing.GroupLayout(LayeredPane);
        LayeredPane.setLayout(LayeredPaneLayout);
        LayeredPaneLayout.setHorizontalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoVerPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoInicioAprendiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoComent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayeredPaneLayout.setVerticalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoVerPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoInicioAprendiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoComent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaestroNametfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaestroNametfFocusLost
        if(this.MaestroNametf.getText().equals("")){
            this.MaestroNametf.setText(" Buscar Maestro");
        }
    }//GEN-LAST:event_MaestroNametfFocusLost

    private void MaestroNametfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaestroNametfMouseClicked
        if(this.MaestroNametf.getText().equals(" Buscar Maestro")){
            this.MaestroNametf.setText("");
        }
    }//GEN-LAST:event_MaestroNametfMouseClicked

    private void GuardadasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardadasBtnActionPerformed
        this.FondoInicioAprendiz.setEnabled(false);
        this.FondoInicioAprendiz.setFocusable(false);
        this.FondoInicioAprendiz.setVisible(false);
        this.FondoVerPublicacion.setEnabled(true);
        this.FondoVerPublicacion.setFocusable(true);
        this.FondoVerPublicacion.setVisible(true);
    }//GEN-LAST:event_GuardadasBtnActionPerformed

    private void SeguirMaestroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguirMaestroBtnActionPerformed
        String seguir = JOptionPane.showInputDialog("¿A qué maestro desea seguir?");
    }//GEN-LAST:event_SeguirMaestroBtnActionPerformed

    private void PublicacionVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicacionVolverActionPerformed
        this.FondoInicioAprendiz.setEnabled(true);
        this.FondoInicioAprendiz.setFocusable(true);
        this.FondoInicioAprendiz.setVisible(true);
        this.FondoVerPublicacion.setEnabled(false);
        this.FondoVerPublicacion.setFocusable(false);
        this.FondoVerPublicacion.setVisible(false);
    }//GEN-LAST:event_PublicacionVolverActionPerformed

    private void CancelarComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarComentActionPerformed
        this.FondoVerPublicacion.setEnabled(true);
        this.FondoVerPublicacion.setFocusable(true);
        this.FondoVerPublicacion.setVisible(true);
        this.FondoComent.setEnabled(false);
        this.FondoComent.setFocusable(false);
        this.FondoComent.setVisible(false);
        this.jTextAreaComentar.setText("");
    }//GEN-LAST:event_CancelarComentActionPerformed

    private void ComentarPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarPublicacionActionPerformed
        if(!this.jTextAreaComentar.getText().equals("")){
           String Comment = this.jTextAreaComent.getText().concat("User: "+this.jTextAreaComentar.getText()+"\n");
            this.jTextAreaComent.setText(Comment);
            this.jTextAreaComentar.setText(""); 
        }
    }//GEN-LAST:event_ComentarPublicacionActionPerformed

    private void ConfirmarComentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarComentActionPerformed
        this.FondoVerPublicacion.setEnabled(true);
        this.FondoVerPublicacion.setFocusable(true);
        this.FondoVerPublicacion.setVisible(true);
        this.FondoComent.setEnabled(false);
        this.FondoComent.setFocusable(false);
        this.FondoComent.setVisible(false);
    }//GEN-LAST:event_ConfirmarComentActionPerformed

    private void GuardarPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPublicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarPublicacionActionPerformed

    private void CarrarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrarSesionBtnActionPerformed
        String a = "Magnus";
        Publicacion b;
        b = new Publicacion("Titulo Prueba","Magnus","Holaaaa, Como andan?");
        b.setText("<html><p></p><p>Autor: "+b.getAutor()+"</p><p>"+b.getTitulo()+"</p><p></p><p></p></html>");
        b.setFont(new java.awt.Font("Century Gothic", 1, 18));
        b.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        b.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
                FondoInicioAprendiz.setEnabled(false);
                FondoInicioAprendiz.setFocusable(false);
                FondoInicioAprendiz.setVisible(false);
                FondoVerPublicacion.setEnabled(true);
                FondoVerPublicacion.setFocusable(true);
                FondoVerPublicacion.setVisible(true);
                jTextAreaPubli.setText(b.getTexto());
                jTextAreaTitulo.setText(b.getTitulo());
                
            }
        });
//        JTextArea jTextAreaNuevaPubli;
//        jTextAreaNuevaPubli = new javax.swing.JTextArea();
//        jTextAreaNuevaPubli.setEditable(false);
//        jTextAreaNuevaPubli.setColumns(10);
//        jTextAreaNuevaPubli.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
//        jTextAreaNuevaPubli.setRows(5);
//        jTextAreaNuevaPubli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
//        jTextAreaNuevaPubli.setFocusable(false);
//        jTextAreaNuevaPubli.setText("aaaa");
        a(this.jPanelInicio,b);
    }//GEN-LAST:event_CarrarSesionBtnActionPerformed

    private void a(JPanel p, JButton b){
        p.add(b);
        p.revalidate();
        p.repaint();
    }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarMaestroBtn;
    private javax.swing.JButton CancelarComent;
    private javax.swing.JButton CarrarSesionBtn;
    private javax.swing.JButton ComentarPublicacion;
    private javax.swing.JButton ConfirmarComent;
    private javax.swing.JButton CuentaBtn;
    private javax.swing.JPanel FondoComent;
    private javax.swing.JPanel FondoInicioAprendiz;
    private javax.swing.JPanel FondoVerPublicacion;
    private javax.swing.JButton GuardadasBtn;
    private javax.swing.JButton GuardarPublicacion;
    private javax.swing.JPanel InicioAprendiz;
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JTextField MaestroNametf;
    private javax.swing.JButton PaginaInicioBtn;
    private javax.swing.JButton PublicacionVolver;
    private javax.swing.JButton SeguirMaestroBtn;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JScrollPane jScrollPaneComent;
    private javax.swing.JScrollPane jScrollPaneComentar;
    private javax.swing.JScrollPane jScrollPaneInicio;
    private javax.swing.JScrollPane jScrollPanePubli;
    private javax.swing.JScrollPane jScrollPaneTitulo;
    private javax.swing.JTextArea jTextAreaComent;
    private javax.swing.JTextArea jTextAreaComentar;
    private javax.swing.JTextArea jTextAreaPubli;
    private javax.swing.JTextArea jTextAreaTitulo;
    // End of variables declaration//GEN-END:variables
}
