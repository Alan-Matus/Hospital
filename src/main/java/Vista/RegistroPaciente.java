package Vista;

import Modelo.Paciente;
import Modelo.Limpiador; 
import Modelo.Validador;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RegistroPaciente extends javax.swing.JFrame {

    public RegistroPaciente() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        
        // Llamada corregida con los nombres exactos:
        Paciente.inicializarFormulario(txtIdPaciente, txtNombre, txtApellidoP, txtApellidoM, 
            txtPeso, txtAltura, txtEdad, txtTipoPaciente, 
            jdcFechaNacimiento, jdcEntrada, spnHora, jspnMinuto, // <-- INGRESO AQUÍ
            txtPacienteConsulta, jrbSi, jrbNo, jTabbedPane1, 
            jtxtPaciente, txtPacienteEgreso, jdcFechaSalida, spnHora, spnMinuto // <-- EGRESO AQUÍ
        );
        Validador.aplicarSoloLetras(txtNombre);
    Validador.aplicarSoloLetras(txtApellidoP);
    Validador.aplicarSoloLetras(txtApellidoM);
    
    aplicarDisenoFormulario();
    }
    
    private void aplicarDisenoFormulario() {
          this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        // 1. Paleta de colores clínicos modernos
        Color colorFondoPaneles = new Color(248, 249, 250);   // Blanco/Gris muy claro
        Color azulPrincipal = new Color(0, 123, 255);       // Azul institucional médico
        Color grisBotonSecundario = new Color(140, 145, 155); // Gris para vaciar/limpiar
        Color grisBotonRegresar = new Color(90, 100, 110);    // Gris oscuro para regresar
        Color colorBordeSuave = new Color(220, 224, 230);     // Borde plano estético
        
        // 2. Fuentes
        Font fuenteGeneral = new Font("Segoe UI", Font.PLAIN, 12);
        Font fuenteBotones = new Font("Segoe UI", Font.BOLD, 12);
        Font fuentePestanas = new Font("Segoe UI", Font.BOLD, 13);
        
        // 3. Estilizar el JTabbedPane (Pestañas)
        jTabbedPane1.setFont(fuentePestanas);
        jTabbedPane1.setBackground(Color.WHITE);
        jTabbedPane1.setBorder(BorderFactory.createLineBorder(colorBordeSuave, 1));
        
        // 4. Estilizar los fondos de los Paneles
        JPanel[] paneles = {jPanel1, jPanel2, jPanel3, jPanel4};
        for (JPanel panel : paneles) {
            panel.setBackground(colorFondoPaneles);
            // Reemplazamos los bordes toscos de fábrica por un título con tipografía limpia
            panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(colorBordeSuave, 1), 
                panel.getBorder() != null ? ((javax.swing.BorderFactory.createTitledBorder("")).getTitle()) : "",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new Font("Segoe UI", Font.BOLD, 12),
                new Color(50, 65, 85)
            ));
        }
        
        // 5. Estilizar Botones de Acción Principal (Azul)
        JButton[] botonesAzules = {btnGuardar, btnGuardarConsulta, btnActualizar, btnBuscar};
        for (JButton btn : botonesAzules) {
            btn.setBackground(azulPrincipal);
            btn.setForeground(Color.WHITE);
            btn.setFont(fuenteBotones);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        }
        
        // 6. Estilizar Botones de Acción Secundaria (Gris Claro Neutro)
        JButton[] botonesGrises = {btnVaciar, btnVaciarConsulta, btnLimpiar};
        for (JButton btn : botonesGrises) {
            btn.setBackground(grisBotonSecundario);
            btn.setForeground(Color.WHITE);
            btn.setFont(fuenteBotones);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        }
        
        // 7. Estilizar Botón Regresar
        btnRegresar.setBackground(grisBotonRegresar);
        btnRegresar.setForeground(Color.WHITE);
        btnRegresar.setFont(fuenteBotones);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        
        // 8. Estilo estético para la Tabla
        jTable1.setFont(fuenteGeneral);
        jTable1.setRowHeight(25); // Filas más altas y cómodas de leer
        jTable1.setGridColor(colorBordeSuave);
        jTable1.setSelectionBackground(new Color(230, 242, 255)); // Azul traslúcido al seleccionar
        jTable1.setSelectionForeground(Color.BLACK);
        jScrollPane5.setBorder(BorderFactory.createLineBorder(colorBordeSuave, 1));
        jPanel4.removeAll();
        jPanel4.setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbc4 = new java.awt.GridBagConstraints();
        gbc4.insets = new java.awt.Insets(10, 15, 10, 15);
        
        txtBuscar.setPreferredSize(new java.awt.Dimension(250, 30));
        
        // Fila 0: Barra superior de búsqueda integrada
        gbc4.gridy = 0; gbc4.gridx = 0;
        gbc4.weightx = 1.0; gbc4.weighty = 0.0;
        gbc4.fill = java.awt.GridBagConstraints.HORIZONTAL;
        
        roundedPanel1.removeAll();
        roundedPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 8));
        roundedPanel1.add(new javax.swing.JLabel("Buscar Paciente (ID/Nombre):"));
        roundedPanel1.add(txtBuscar);
        roundedPanel1.add(btnBuscar);
        roundedPanel1.add(btnRegresar);
        jPanel4.add(roundedPanel1, gbc4);
        
        // Fila 1: Tabla expandible
        gbc4.gridy = 1;
        gbc4.weighty = 1.0;
        gbc4.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jScrollPane5, gbc4);
        
        // --- ACOPLAMIENTO CENTRALIZADO DEFINITIVO DEL CONTENTPANE ---
        this.getContentPane().setLayout(new java.awt.GridBagLayout());
        java.awt.GridBagConstraints gbcVentana = new java.awt.GridBagConstraints();
        gbcVentana.gridx = 0; gbcVentana.gridy = 0;
        gbcVentana.weightx = 1.0; gbcVentana.weighty = 1.0;
        gbcVentana.fill = java.awt.GridBagConstraints.BOTH;
        gbcVentana.insets = new java.awt.Insets(15, 15, 15, 15);
        
        // Insertar el JTabbedPane directo y limpio en la ventana
        this.getContentPane().add(jTabbedPane1, gbcVentana);
        
        // Refrescar y pintar los contenedores recalculados
        this.revalidate();
        this.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtTipoPaciente = new javax.swing.JTextField();
        cbTipoSangre = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jdcEntrada = new com.toedter.calendar.JDateChooser();
        jspnMinuto = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jspnHora = new com.toedter.components.JSpinField();
        txtEdad = new javax.swing.JTextField();
        jcbGenero = new javax.swing.JComboBox<>();
        txtIdPaciente = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        roundedPanel4 = new Componentes.RoundedPanel();
        btnGuardar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtPacienteConsulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jrbSi = new javax.swing.JRadioButton();
        jrbNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        roundedPanel3 = new Componentes.RoundedPanel();
        btnGuardarConsulta = new javax.swing.JButton();
        btnVaciarConsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        spnMinuto = new javax.swing.JSpinner();
        spnHora = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jtxtPaciente = new javax.swing.JTextField();
        txtPacienteEgreso = new javax.swing.JTextField();
        roundedPanel2 = new Componentes.RoundedPanel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        roundedPanel1 = new Componentes.RoundedPanel();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DEL PACIENTE"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO"));

        txtTipoPaciente.addActionListener(this::txtTipoPacienteActionPerformed);

        cbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel6.setText("TIPO DE PACIENTE");

        txtAltura.setBorder(javax.swing.BorderFactory.createTitledBorder("ALTURA"));

        jLabel5.setText("TIPO DE SANGRE");

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        jLabel2.setText("ENTRADA");

        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder("PESO"));

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("EDAD"));

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO" }));
        jcbGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("GENERO"));

        txtIdPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PACIENTE"));

        txtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO PATERNO"));

        txtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO MATERNO"));

        jLabel1.setText("FECHA DE NACIMIENTO");

        roundedPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnVaciar.setText("VACIAR");
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(64, 64, 64)
                .addComponent(btnVaciar)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnVaciar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jspnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jspnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jdcEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(720, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jspnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("INGRESO", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CONSULTA"));

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PACIENTE"));

        txtPacienteConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("PACIENTE"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("ALERGIAS"));
        jScrollPane2.setViewportView(jTextArea1);

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("OBSERVACIONES"));
        jScrollPane3.setViewportView(txtObservaciones);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        txtDiagnostico.setBorder(javax.swing.BorderFactory.createTitledBorder("DIAGNOSTICO"));
        jScrollPane4.setViewportView(txtDiagnostico);

        jrbSi.setText("SI");
        jrbSi.addActionListener(this::jrbSiActionPerformed);

        jrbNo.setText("NO");
        jrbNo.addActionListener(this::jrbNoActionPerformed);

        jLabel4.setText("PACIENTE APTO PARA SALIR");

        roundedPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardarConsulta.setText("GUARDAR");
        btnGuardarConsulta.addActionListener(this::btnGuardarConsultaActionPerformed);

        btnVaciarConsulta.setText("VACIAR");
        btnVaciarConsulta.addActionListener(this::btnVaciarConsultaActionPerformed);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnGuardarConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVaciarConsulta)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarConsulta)
                    .addComponent(btnVaciarConsulta))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPacienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(890, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbSi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jrbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPacienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbSi)
                    .addComponent(jrbNo)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTA", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("EGRESO"));

        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.setBorder(javax.swing.BorderFactory.createTitledBorder("OBSERVACIONES"));
        jScrollPane1.setViewportView(txt3);

        jLabel3.setText("SALIDA");

        jtxtPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PACIENTE"));

        txtPacienteEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("PACIENTE"));

        roundedPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnActualizar)
                .addGap(55, 55, 55)
                .addComponent(btnLimpiar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jtxtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPacienteEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(877, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPacienteEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(spnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EGRESO", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("VISTA DE PACIENTES"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable1);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar)
                .addGap(26, 26, 26)
                .addComponent(btnRegresar)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1502, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("VISTA DE PACIENTES", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConsultaActionPerformed
        // TODO add your handling code here:
       if (jrbSi.isSelected()) {
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setSelectedIndex(2); 
        } else if (jrbNo.isSelected()) {
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setSelectedIndex(3); 
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione si el paciente está apto para salir.");
        }
    }//GEN-LAST:event_btnGuardarConsultaActionPerformed
    private void btnVaciarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarConsultaActionPerformed
        // TODO add your handling code here:
        // Limpiamos todo de una
        Limpiador.limpiarTextos(txtId, txtPacienteEgreso, txtObservaciones, txtDiagnostico);
        buttonGroup1.clearSelection(); 
        jTabbedPane1.setEnabledAt(2, false);
    }//GEN-LAST:event_btnVaciarConsultaActionPerformed
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        // Limpiamos ID, Nombre y Observaciones (cambia "txtObservacionesEgreso" por el nombre real de tu variable)
        Modelo.Limpiador.limpiarTextos(jtxtPaciente, txtPacienteEgreso, txt3);
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void jrbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSiActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(2, true);        
    }//GEN-LAST:event_jrbSiActionPerformed
    private void jrbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(2, false);
    }//GEN-LAST:event_jrbNoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
         Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre.getText().trim().isEmpty() ||
            txtApellidoP.getText().trim().isEmpty() ||
            txtApellidoM.getText().trim().isEmpty() ||
            txtPeso.getText().trim().isEmpty() ||
            txtAltura.getText().trim().isEmpty() ||
            jdcFechaNacimiento.getDate() == null) {

            JOptionPane.showMessageDialog(this, "Debe completar todos los campos del formulario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double peso = Double.parseDouble(txtPeso.getText().trim());
            double altura = Double.parseDouble(txtAltura.getText().trim());

            if (peso <= 0 || peso > 635.0) {
                JOptionPane.showMessageDialog(this, "El peso ingresado debe ser mayor a 0 y máximo 635 kg.", "Error de Rango", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (altura <= 0 || altura > 3.0) {
                JOptionPane.showMessageDialog(this, "Ingrese una altura válida en metros.", "Error de Rango", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Los datos de peso y altura deben ser numéricos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "¡Validaciones aprobadas con éxito! Procesando registro...");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        // TODO add your handling code here:
        // Limpiamos todos los campos de texto de una
        Limpiador.limpiarTextos(txtNombre, txtApellidoP, txtApellidoM, txtPeso, txtAltura, txtEdad, txtTipoPaciente);
        jdcFechaNacimiento.setDate(null);
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void txtTipoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPacienteActionPerformed

    public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    // Asegúrate de usar 'Ventana' y no 'NewJFrame'
    java.awt.EventQueue.invokeLater(() -> {
        new RegistroPaciente().setVisible(true);
    });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarConsulta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVaciarConsulta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcbGenero;
    private com.toedter.calendar.JDateChooser jdcEntrada;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JRadioButton jrbNo;
    private javax.swing.JRadioButton jrbSi;
    private com.toedter.components.JSpinField jspnHora;
    private javax.swing.JSpinner jspnMinuto;
    private javax.swing.JTextField jtxtPaciente;
    private Componentes.RoundedPanel roundedPanel1;
    private Componentes.RoundedPanel roundedPanel2;
    private Componentes.RoundedPanel roundedPanel3;
    private Componentes.RoundedPanel roundedPanel4;
    private javax.swing.JSpinner spnHora;
    private javax.swing.JSpinner spnMinuto;
    private javax.swing.JTextArea txt3;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPacienteConsulta;
    private javax.swing.JTextField txtPacienteEgreso;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTipoPaciente;
    // End of variables declaration//GEN-END:variables
}