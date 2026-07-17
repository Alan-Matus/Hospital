package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        aplicarDisenoModerno();
    }

    private void aplicarDisenoModerno() {
         this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        // 1. Colores de la paleta clínica moderna
        Color colorFondo = new Color(244, 246, 249);      // Gris azulado muy limpio
        Color azulPrincipal = new Color(0, 123, 255);    // Azul médico para botones de acción
        Color grisBotonSecundario = new Color(108, 117, 125); // Gris moderno para el botón Salir
        Color azulOscuroTexto = new Color(15, 44, 89);     // Azul marino para el título principal
        Color grisTextoSecundario = new Color(100, 110, 120); // Gris intermedio para subtítulos
        
        // 2. Tipografías modernas
        Font fuenteTitulo = new Font("Segoe UI", Font.BOLD, 26);
        Font fuenteSubtitulo = new Font("Segoe UI", Font.PLAIN, 14);
        Font fuenteBotones = new Font("Segoe UI", Font.BOLD, 13);
        
        // 3. Aplicar fondo a la ventana principal
        this.getContentPane().setBackground(colorFondo);
        
        // 4. Estilizar Etiquetas de Texto (Labels)
        jLabel1.setFont(fuenteTitulo);
        jLabel1.setForeground(azulOscuroTexto);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel2.setFont(fuenteSubtitulo);
        jLabel2.setForeground(grisTextoSecundario);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        // 5. Estilizar los Botones Principales (Arreglo para optimizar código)
        JButton[] botonesPrincipales = {btnPaciente, btnMedico, btnArchivo};
        for (JButton btn : botonesPrincipales) {
            btn.setBackground(azulPrincipal);
            btn.setForeground(Color.WHITE);
            btn.setFont(fuenteBotones);
            btn.setFocusPainted(false);
            // Crea un borde interno (padding) para que los botones se vean más altos y robustos
            btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        }
        
        // 6. Estilizar el Botón de Salir (Acción secundaria)
        btnSalir.setBackground(grisBotonSecundario);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFont(fuenteBotones);
        btnSalir.setFocusPainted(false);
        btnSalir.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        // Organizar botones dentro del panel redondeado
        roundedPanel1.removeAll(); 
        roundedPanel1.setLayout(new GridBagLayout());
        
        GridBagConstraints gbcPanel = new GridBagConstraints();
        gbcPanel.insets = new Insets(10, 40, 10, 40); 
        gbcPanel.fill = GridBagConstraints.HORIZONTAL; // Ancho uniforme para todos los botones
        gbcPanel.gridx = 0;
        
        gbcPanel.gridy = 0; roundedPanel1.add(btnPaciente, gbcPanel);
        gbcPanel.gridy = 1; roundedPanel1.add(btnMedico, gbcPanel);
        gbcPanel.gridy = 2; roundedPanel1.add(btnArchivo, gbcPanel);
        
        gbcPanel.insets = new Insets(20, 40, 20, 40); // Más separación para el botón salir
        gbcPanel.gridy = 3; roundedPanel1.add(btnSalir, gbcPanel);

        // Crear contenedor intermedio para centrar títulos y panel juntos
        JPanel contenedorCentral = new JPanel(new GridBagLayout());
        contenedorCentral.setBackground(colorFondo);
        
        GridBagConstraints gbcCentro = new GridBagConstraints();
        gbcCentro.gridx = 0;
        gbcCentro.fill = GridBagConstraints.HORIZONTAL;
        
        gbcCentro.insets = new Insets(0, 0, 5, 0);
        gbcCentro.gridy = 0; contenedorCentral.add(jLabel1, gbcCentro);
        
        gbcCentro.insets = new Insets(0, 0, 25, 0);
        gbcCentro.gridy = 1; contenedorCentral.add(jLabel2, gbcCentro);
        
        gbcCentro.insets = new Insets(0, 0, 0, 0);
        gbcCentro.fill = GridBagConstraints.NONE; 
        gbcCentro.gridy = 2; contenedorCentral.add(roundedPanel1, gbcCentro);
        
        // Aplicar centrado absoluto en el Frame principal
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbcVentana = new GridBagConstraints();
        gbcVentana.gridx = 0; 
        gbcVentana.gridy = 0;
        gbcVentana.anchor = GridBagConstraints.CENTER; // Anclar al centro de la pantalla
        
        this.getContentPane().add(contenedorCentral, gbcVentana);
        
        // Actualizar interfaz
        this.revalidate();
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel1 = new Componentes.RoundedPanel();
        btnSalir = new javax.swing.JButton();
        btnArchivo = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO");

        jLabel2.setText("ELIGE UNA OPCION");

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        btnArchivo.setText("ARCHIVO");
        btnArchivo.addActionListener(this::btnArchivoActionPerformed);

        btnMedico.setText("REGISTRAR MEDICO");
        btnMedico.addActionListener(this::btnMedicoActionPerformed);

        btnPaciente.setText("REGISTRAR PACIENTE");
        btnPaciente.addActionListener(this::btnPacienteActionPerformed);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        // TODO add your handling code here:
        RegistroPaciente ventanaPaciente = new RegistroPaciente();
        ventanaPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        // TODO add your handling code here:
        RegistrarMedico ventanaMedico = new RegistrarMedico();
        ventanaMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        Archivo ventanaArchivo = new Archivo();
        ventanaArchivo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        try {
            // Reemplazamos Nimbus por el diseño del Sistema Operativo Nativo
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Componentes.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
