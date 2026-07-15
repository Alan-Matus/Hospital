package Vista;

import Modelo.Paciente;
import Modelo.Limpiador; 
import Modelo.Validador;
import javax.swing.JOptionPane;

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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jcbGenero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtEdad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        jspnHora = new com.toedter.components.JSpinField();
        jLabel2 = new javax.swing.JLabel();
        jspnMinuto = new javax.swing.JSpinner();
        jdcEntrada = new com.toedter.calendar.JDateChooser();
        txtIdPaciente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbTipoSangre = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTipoPaciente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtPacienteConsulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        btnGuardarConsulta = new javax.swing.JButton();
        btnVaciarConsulta = new javax.swing.JButton();
        jrbSi = new javax.swing.JRadioButton();
        jrbNo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        spnMinuto = new javax.swing.JSpinner();
        spnHora = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jtxtPaciente = new javax.swing.JTextField();
        txtPacienteEgreso = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DEL PACIENTE"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO"));

        txtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO PATERNO"));

        txtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO MATERNO"));

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO" }));
        jcbGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("GENERO"));

        jLabel1.setText("FECHA DE NACIMIENTO");

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("EDAD"));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnVaciar.setText("VACIAR");
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);

        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder("PESO"));

        jLabel2.setText("ENTRADA");

        txtIdPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PACIENTE"));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtAltura.setBorder(javax.swing.BorderFactory.createTitledBorder("ALTURA"));

        jLabel5.setText("TIPO DE SANGRE");

        cbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel6.setText("TIPO DE PACIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnGuardar)
                                .addGap(85, 85, 85)
                                .addComponent(btnVaciar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(cbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jspnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jspnMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdcEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jspnHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspnMinuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnVaciar))
                .addGap(62, 62, 62))
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

        btnGuardarConsulta.setText("GUARDAR");
        btnGuardarConsulta.addActionListener(this::btnGuardarConsultaActionPerformed);

        btnVaciarConsulta.setText("VACIAR");
        btnVaciarConsulta.addActionListener(this::btnVaciarConsultaActionPerformed);

        jrbSi.setText("SI");
        jrbSi.addActionListener(this::jrbSiActionPerformed);

        jrbNo.setText("NO");
        jrbNo.addActionListener(this::jrbNoActionPerformed);

        jLabel4.setText("PACIENTE APTO PARA SALIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnGuardarConsulta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnVaciarConsulta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbSi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jrbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarConsulta)
                    .addComponent(btnVaciarConsulta))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("CONSULTA", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("EGRESO"));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.setBorder(javax.swing.BorderFactory.createTitledBorder("OBSERVACIONES"));
        jScrollPane1.setViewportView(txt3);

        jLabel3.setText("SALIDA");

        jtxtPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID PACIENTE"));

        txtPacienteEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("PACIENTE"));

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
                        .addGap(71, 71, 71)
                        .addComponent(btnActualizar)
                        .addGap(97, 97, 97)
                        .addComponent(btnLimpiar)))
                .addContainerGap(143, Short.MAX_VALUE))
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
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EGRESO", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("VISTA DE PACIENTES"));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

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

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscar)
                .addGap(33, 33, 33)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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