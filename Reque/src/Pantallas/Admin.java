/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import ConexionDB.Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import reque.Mailer;
import reque.User;

/**
 *
 * @author kevin
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    User usuario;
    Controller control;
    Mailer mails;
    public Admin(User usuario, Controller control) {
        initComponents();
        this.FondoRegistroAdmin.setVisible(false);
        this.FondoRegistroMaestro.setVisible(false);
        this.usuario = usuario;
        this.control = control;
        this.mails = new Mailer();
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
        FondoRegistroAdmin = new javax.swing.JPanel();
        RegistroAdmin = new javax.swing.JPanel();
        TitleRegistroAdmin = new javax.swing.JLabel();
        AdminName = new javax.swing.JTextField();
        AdminEmail = new javax.swing.JTextField();
        ConfirmarRegistroAdmin = new javax.swing.JButton();
        CancelarRegistroAdmin = new javax.swing.JButton();
        FondoInicioAdmin = new javax.swing.JPanel();
        InicioAdmin = new javax.swing.JPanel();
        EditCuentaBtn = new javax.swing.JButton();
        RegistrarMaestroBtn = new javax.swing.JButton();
        RegistrarAdminBtn = new javax.swing.JButton();
        EliminarCuentaBtn = new javax.swing.JButton();
        MaestroNametf = new javax.swing.JTextField();
        BuscarMaestroBtn = new javax.swing.JButton();
        jScrollPaneInicio = new javax.swing.JScrollPane();
        FondoRegistroMaestro = new javax.swing.JPanel();
        RegistroMaestro = new javax.swing.JPanel();
        TitleRegistroMaestro = new javax.swing.JLabel();
        MaestroName = new javax.swing.JTextField();
        MaestroEmail = new javax.swing.JTextField();
        MaestroFide = new javax.swing.JTextField();
        ConfirmarRegistroMaestro = new javax.swing.JButton();
        CancelarRegistroMaestro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1288, 696));
        setSize(new java.awt.Dimension(1288, 696));

        FondoRegistroAdmin.setBackground(new java.awt.Color(25, 37, 77));
        FondoRegistroAdmin.setEnabled(false);
        FondoRegistroAdmin.setFocusable(false);

        RegistroAdmin.setBackground(new java.awt.Color(67, 72, 121));
        RegistroAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TitleRegistroAdmin.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        TitleRegistroAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleRegistroAdmin.setText("Registro de Administrador");

        AdminName.setBackground(new java.awt.Color(200, 191, 191));
        AdminName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AdminName.setText(" Nombre");
        AdminName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AdminName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdminNameFocusLost(evt);
            }
        });
        AdminName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminNameMouseClicked(evt);
            }
        });

        AdminEmail.setBackground(new java.awt.Color(200, 191, 191));
        AdminEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AdminEmail.setText(" Email");
        AdminEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AdminEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AdminEmailFocusLost(evt);
            }
        });
        AdminEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminEmailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegistroAdminLayout = new javax.swing.GroupLayout(RegistroAdmin);
        RegistroAdmin.setLayout(RegistroAdminLayout);
        RegistroAdminLayout.setHorizontalGroup(
            RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroAdminLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminName)
                    .addComponent(TitleRegistroAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(AdminEmail))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        RegistroAdminLayout.setVerticalGroup(
            RegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroAdminLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TitleRegistroAdmin)
                .addGap(49, 49, 49)
                .addComponent(AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(AdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        ConfirmarRegistroAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ConfirmarRegistroAdmin.setText("Confirmar");
        ConfirmarRegistroAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ConfirmarRegistroAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarRegistroAdminActionPerformed(evt);
            }
        });

        CancelarRegistroAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CancelarRegistroAdmin.setText("Cancelar");
        CancelarRegistroAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CancelarRegistroAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRegistroAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoRegistroAdminLayout = new javax.swing.GroupLayout(FondoRegistroAdmin);
        FondoRegistroAdmin.setLayout(FondoRegistroAdminLayout);
        FondoRegistroAdminLayout.setHorizontalGroup(
            FondoRegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoRegistroAdminLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(FondoRegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoRegistroAdminLayout.createSequentialGroup()
                        .addComponent(ConfirmarRegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarRegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        FondoRegistroAdminLayout.setVerticalGroup(
            FondoRegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoRegistroAdminLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(RegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(FondoRegistroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarRegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarRegistroAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        FondoInicioAdmin.setBackground(new java.awt.Color(25, 37, 77));

        InicioAdmin.setBackground(new java.awt.Color(67, 72, 121));
        InicioAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        EditCuentaBtn.setBackground(new java.awt.Color(200, 191, 191));
        EditCuentaBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditCuentaBtn.setText("Editar Cuenta");
        EditCuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        RegistrarMaestroBtn.setBackground(new java.awt.Color(200, 191, 191));
        RegistrarMaestroBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        RegistrarMaestroBtn.setText("Registrar Maestro");
        RegistrarMaestroBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RegistrarMaestroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMaestroBtnActionPerformed(evt);
            }
        });

        RegistrarAdminBtn.setBackground(new java.awt.Color(200, 191, 191));
        RegistrarAdminBtn.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        RegistrarAdminBtn.setText("Registrar Administrador");
        RegistrarAdminBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RegistrarAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarAdminBtnActionPerformed(evt);
            }
        });

        EliminarCuentaBtn.setBackground(new java.awt.Color(200, 191, 191));
        EliminarCuentaBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EliminarCuentaBtn.setText("Eliminar Cuenta");
        EliminarCuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout InicioAdminLayout = new javax.swing.GroupLayout(InicioAdmin);
        InicioAdmin.setLayout(InicioAdminLayout);
        InicioAdminLayout.setHorizontalGroup(
            InicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioAdminLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(EditCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(InicioAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InicioAdminLayout.setVerticalGroup(
            InicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioAdminLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(EditCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(RegistrarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(RegistrarAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(EliminarCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jScrollPaneInicio.setBackground(new java.awt.Color(25, 37, 77));
        jScrollPaneInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout FondoInicioAdminLayout = new javax.swing.GroupLayout(FondoInicioAdmin);
        FondoInicioAdmin.setLayout(FondoInicioAdminLayout);
        FondoInicioAdminLayout.setHorizontalGroup(
            FondoInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InicioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoInicioAdminLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(MaestroNametf, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(FondoInicioAdminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneInicio)
                        .addContainerGap())))
        );
        FondoInicioAdminLayout.setVerticalGroup(
            FondoInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoInicioAdminLayout.createSequentialGroup()
                        .addGroup(FondoInicioAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarMaestroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaestroNametf, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InicioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        FondoRegistroMaestro.setBackground(new java.awt.Color(25, 37, 77));
        FondoRegistroMaestro.setEnabled(false);
        FondoRegistroMaestro.setFocusable(false);

        RegistroMaestro.setBackground(new java.awt.Color(67, 72, 121));
        RegistroMaestro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TitleRegistroMaestro.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        TitleRegistroMaestro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleRegistroMaestro.setText("Registro de Maestro");

        MaestroName.setBackground(new java.awt.Color(200, 191, 191));
        MaestroName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        MaestroName.setText(" Nombre");
        MaestroName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MaestroName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaestroNameFocusLost(evt);
            }
        });
        MaestroName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaestroNameMouseClicked(evt);
            }
        });

        MaestroEmail.setBackground(new java.awt.Color(200, 191, 191));
        MaestroEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        MaestroEmail.setText(" Email");
        MaestroEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MaestroEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaestroEmailFocusLost(evt);
            }
        });
        MaestroEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaestroEmailMouseClicked(evt);
            }
        });

        MaestroFide.setBackground(new java.awt.Color(200, 191, 191));
        MaestroFide.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        MaestroFide.setText(" Id FIDE");
        MaestroFide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MaestroFide.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaestroFideFocusLost(evt);
            }
        });
        MaestroFide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaestroFideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegistroMaestroLayout = new javax.swing.GroupLayout(RegistroMaestro);
        RegistroMaestro.setLayout(RegistroMaestroLayout);
        RegistroMaestroLayout.setHorizontalGroup(
            RegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroMaestroLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(RegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaestroName)
                    .addComponent(TitleRegistroMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(MaestroEmail)
                    .addComponent(MaestroFide))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        RegistroMaestroLayout.setVerticalGroup(
            RegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroMaestroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TitleRegistroMaestro)
                .addGap(38, 38, 38)
                .addComponent(MaestroName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(MaestroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(MaestroFide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        ConfirmarRegistroMaestro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ConfirmarRegistroMaestro.setText("Confirmar");
        ConfirmarRegistroMaestro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        CancelarRegistroMaestro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CancelarRegistroMaestro.setText("Cancelar");
        CancelarRegistroMaestro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CancelarRegistroMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRegistroMaestroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoRegistroMaestroLayout = new javax.swing.GroupLayout(FondoRegistroMaestro);
        FondoRegistroMaestro.setLayout(FondoRegistroMaestroLayout);
        FondoRegistroMaestroLayout.setHorizontalGroup(
            FondoRegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoRegistroMaestroLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(FondoRegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoRegistroMaestroLayout.createSequentialGroup()
                        .addComponent(ConfirmarRegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarRegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        FondoRegistroMaestroLayout.setVerticalGroup(
            FondoRegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoRegistroMaestroLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(RegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(FondoRegistroMaestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmarRegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarRegistroMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        LayeredPane.setLayer(FondoRegistroAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPane.setLayer(FondoInicioAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPane.setLayer(FondoRegistroMaestro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPaneLayout = new javax.swing.GroupLayout(LayeredPane);
        LayeredPane.setLayout(LayeredPaneLayout);
        LayeredPaneLayout.setHorizontalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoRegistroAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoInicioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoRegistroMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LayeredPaneLayout.setVerticalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoRegistroAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoInicioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FondoRegistroMaestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void AdminNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminNameFocusLost
        if(this.AdminName.getText().equals("")){
            this.AdminName.setText(" Nombre");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminNameFocusLost

    private void AdminNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminNameMouseClicked
        if(this.AdminName.getText().equals(" Nombre")){
            this.AdminName.setText("");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_AdminNameMouseClicked

    private void AdminEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AdminEmailFocusLost
        if(this.AdminEmail.getText().equals("")){
            this.AdminEmail.setText(" Email");
        }
    }//GEN-LAST:event_AdminEmailFocusLost

    private void AdminEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminEmailMouseClicked
        if(this.AdminEmail.getText().equals(" Email")){
            this.AdminEmail.setText("");
        }
    }//GEN-LAST:event_AdminEmailMouseClicked

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

    private void RegistrarMaestroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMaestroBtnActionPerformed
        this.FondoInicioAdmin.setEnabled(false);
        this.FondoInicioAdmin.setFocusable(false);
        this.FondoInicioAdmin.setVisible(false);
        this.FondoRegistroMaestro.setEnabled(true);
        this.FondoRegistroMaestro.setFocusable(true);
        this.FondoRegistroMaestro.setVisible(true);
    }//GEN-LAST:event_RegistrarMaestroBtnActionPerformed

    private void RegistrarAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAdminBtnActionPerformed
        this.FondoInicioAdmin.setEnabled(false);
        this.FondoInicioAdmin.setFocusable(false);
        this.FondoInicioAdmin.setVisible(false);
        this.FondoRegistroAdmin.setEnabled(true);
        this.FondoRegistroAdmin.setFocusable(true);
        this.FondoRegistroAdmin.setVisible(true);
    }//GEN-LAST:event_RegistrarAdminBtnActionPerformed

    private void CancelarRegistroAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRegistroAdminActionPerformed
        this.FondoInicioAdmin.setEnabled(true);
        this.FondoInicioAdmin.setFocusable(true);
        this.FondoInicioAdmin.setVisible(true);
        this.FondoRegistroAdmin.setEnabled(false);
        this.FondoRegistroAdmin.setFocusable(false);
        this.FondoRegistroAdmin.setVisible(false);
    }//GEN-LAST:event_CancelarRegistroAdminActionPerformed

    private void MaestroNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaestroNameFocusLost
        if(this.MaestroName.getText().equals("")){
            this.MaestroName.setText(" Nombre");
        }
    }//GEN-LAST:event_MaestroNameFocusLost

    private void MaestroNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaestroNameMouseClicked
        if(this.MaestroName.getText().equals(" Nombre")){
            this.MaestroName.setText("");
        }  
    }//GEN-LAST:event_MaestroNameMouseClicked

    private void MaestroEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaestroEmailFocusLost
        if(this.MaestroEmail.getText().equals("")){
            this.MaestroEmail.setText(" Email");
        }
    }//GEN-LAST:event_MaestroEmailFocusLost

    private void MaestroEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaestroEmailMouseClicked
        if(this.MaestroEmail.getText().equals(" Email")){
            this.MaestroEmail.setText("");
        }
    }//GEN-LAST:event_MaestroEmailMouseClicked

    private void CancelarRegistroMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRegistroMaestroActionPerformed
        this.FondoInicioAdmin.setEnabled(true);
        this.FondoInicioAdmin.setFocusable(true);
        this.FondoInicioAdmin.setVisible(true);
        this.FondoRegistroMaestro.setEnabled(false);
        this.FondoRegistroMaestro.setFocusable(false);
        this.FondoRegistroMaestro.setVisible(false);
    }//GEN-LAST:event_CancelarRegistroMaestroActionPerformed

    private void MaestroFideFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaestroFideFocusLost
        if(this.MaestroFide.getText().equals("")){
            this.MaestroFide.setText(" Id FIDE");
        }
    }//GEN-LAST:event_MaestroFideFocusLost

    private void MaestroFideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaestroFideMouseClicked
        if(this.MaestroFide.getText().equals(" Id FIDE")){
            this.MaestroFide.setText("");
        }
    }//GEN-LAST:event_MaestroFideMouseClicked

    private void ConfirmarRegistroAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarRegistroAdminActionPerformed
        boolean ValidEmail = this.control.ValidateEmail(this.AdminEmail.getText().toLowerCase());
        if(ValidEmail){
            try {
                if(this.control.InsertUser(this.AdminName.getText(), 1, "12345", this.AdminEmail.getText().toLowerCase())){
                    JOptionPane.showMessageDialog(this.FondoRegistroAdmin,"Usuario creado de forma correcta");
                    try {
                        this.mails.send(this.AdminEmail.getText().toLowerCase(), "12345");
                    } catch (MessagingException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            } catch (SQLException ex) {
//                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this.FondoRegistroAdmin,"Este usuario ya existe");
            }
        }
        else{
            JOptionPane.showMessageDialog(this.FondoRegistroAdmin,"Email invalido");
        }
    }//GEN-LAST:event_ConfirmarRegistroAdminActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminEmail;
    private javax.swing.JTextField AdminName;
    private javax.swing.JButton BuscarMaestroBtn;
    private javax.swing.JButton CancelarRegistroAdmin;
    private javax.swing.JButton CancelarRegistroMaestro;
    private javax.swing.JButton ConfirmarRegistroAdmin;
    private javax.swing.JButton ConfirmarRegistroMaestro;
    private javax.swing.JButton EditCuentaBtn;
    private javax.swing.JButton EliminarCuentaBtn;
    private javax.swing.JPanel FondoInicioAdmin;
    private javax.swing.JPanel FondoRegistroAdmin;
    private javax.swing.JPanel FondoRegistroMaestro;
    private javax.swing.JPanel InicioAdmin;
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JTextField MaestroEmail;
    private javax.swing.JTextField MaestroFide;
    private javax.swing.JTextField MaestroName;
    private javax.swing.JTextField MaestroNametf;
    private javax.swing.JButton RegistrarAdminBtn;
    private javax.swing.JButton RegistrarMaestroBtn;
    private javax.swing.JPanel RegistroAdmin;
    private javax.swing.JPanel RegistroMaestro;
    private javax.swing.JLabel TitleRegistroAdmin;
    private javax.swing.JLabel TitleRegistroMaestro;
    private javax.swing.JScrollPane jScrollPaneInicio;
    // End of variables declaration//GEN-END:variables
}
