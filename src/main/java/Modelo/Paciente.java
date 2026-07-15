package Modelo;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner; // IMPORTANTE: Usamos el componente nativo
import java.util.Date;
import java.util.Calendar;

public class Paciente {

    // --- ATRIBUTOS ---
    private String idPaciente;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String genero;
    private double peso;
    private double altura;
    private String tipoPaciente;
    private String tipoSangre;
    private Date fechaNacimiento;
    private String edadTexto;
    private Date fechaEntrada;
    private int horaEntrada;
    private int minutoEntrada;

    public Paciente() {
    }

    // --- LÓGICA DE CONTROL ---
    public static void inicializarFormulario(
            JTextField txtIdPaciente, JTextField txtNombre, JTextField txtApellidoP,
            JTextField txtApellidoM, JTextField txtPeso, JTextField txtAltura,
            JTextField txtEdad, JTextField txtTipoPaciente, JDateChooser jdcFechaNacimiento,
            JDateChooser jdcEntrada, JSpinner jspnHora, JSpinner jspnMinuto,
            JTextField txtPacienteConsulta, JRadioButton jrbSi, JRadioButton jrbNo,
            JTabbedPane jTabbedPane1, JTextField jtxtPaciente, JTextField txtPacienteEgreso,
            JDateChooser jdcFechaSalida, JSpinner spnHora, JSpinner spnMinuto) {

        // 1. Bloqueo de campos (Solo lectura)
        txtIdPaciente.setEditable(false);
        txtEdad.setEditable(false);
        txtTipoPaciente.setEditable(false);
        txtPacienteConsulta.setEditable(false);
        txtPacienteEgreso.setEditable(false);

        // Bloqueo de editores de fecha
        if (jdcEntrada.getDateEditor() != null) {
            ((JTextField) jdcEntrada.getDateEditor().getUiComponent()).setEditable(false);
        }
        if (jdcFechaSalida.getDateEditor() != null) {
            ((JTextField) jdcFechaSalida.getDateEditor().getUiComponent()).setEditable(false);
        }

        // Bloqueo de JSpinners (Modo solo lectura)
        bloquearJSpinner(jspnHora);
        bloquearJSpinner(jspnMinuto);
        bloquearJSpinner(spnHora);
        bloquearJSpinner(spnMinuto);

        // 2. Autocompletar Fechas y Horas actuales
        Date fechaActual = new Date();
        Calendar cal = Calendar.getInstance();

        jdcEntrada.setDate(fechaActual);
        jspnHora.setValue(cal.get(Calendar.HOUR_OF_DAY));
        jspnMinuto.setValue(cal.get(Calendar.MINUTE));

        jdcFechaSalida.setDate(fechaActual);
        spnHora.setValue(cal.get(Calendar.HOUR_OF_DAY));
        spnMinuto.setValue(cal.get(Calendar.MINUTE));

        // 3. Aplicar Validaciones
        Validador.aplicarSoloLetras(txtNombre);
        Validador.aplicarSoloLetras(txtApellidoP);
        Validador.aplicarSoloLetras(txtApellidoM);
        Validador.aplicarSoloNumerosDecimales(txtPeso);
        Validador.aplicarSoloNumerosDecimales(txtAltura);

        // 4. Lógica de fechas
        jdcFechaNacimiento.addPropertyChangeListener("date", evt -> {
            Date fechaSel = jdcFechaNacimiento.getDate();
            if (fechaSel != null) {
                txtEdad.setText(Fecha.calcularEdadExacta(fechaSel));
                int anios = Fecha.obtenerAniosNumericos(fechaSel);
                txtTipoPaciente.setText(Fecha.determinarTipoPaciente(anios));
                generarIdAutomatico(txtTipoPaciente, txtIdPaciente);
            }
        });

        // 5. Configuración de RadioButtons
        ButtonGroup grupoEgreso = new ButtonGroup();
        grupoEgreso.add(jrbSi);
        grupoEgreso.add(jrbNo);
        jrbNo.setSelected(true);
        jTabbedPane1.setEnabledAt(2, false);

        jrbSi.addActionListener(e -> jTabbedPane1.setEnabledAt(2, true));
        jrbNo.addActionListener(e -> jTabbedPane1.setEnabledAt(2, false));

        // 6. Eventos de búsqueda
        txtIdPaciente.addActionListener(e -> {
            String nombreCompleto = txtNombre.getText() + " " + txtApellidoP.getText() + " " + txtApellidoM.getText();
            txtPacienteConsulta.setText(nombreCompleto.trim().toUpperCase());
        });

        jtxtPaciente.addActionListener(e -> {
            String nombreCompleto = txtNombre.getText() + " " + txtApellidoP.getText() + " " + txtApellidoM.getText();
            txtPacienteEgreso.setText(nombreCompleto.trim().toUpperCase());
        });
    }

    /**
     * Bloquea la edición manual del campo de texto interno de un JSpinner.
     */
    private static void bloquearJSpinner(JSpinner spinner) {
        if (spinner.getEditor() instanceof JSpinner.DefaultEditor) {
            ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);
        }
    }

    public static void generarIdAutomatico(JTextField txtTipoPaciente, JTextField txtIdPaciente) {
        String tipo = txtTipoPaciente.getText().trim();
        if (tipo.isEmpty()) return;

        String prefijo = "Pac-Gen-";
        if (tipo.equals("PEDIATRICO")) prefijo = "Pac-Ped-";
        else if (tipo.equals("ADULTO")) prefijo = "Pac-Adu-";
        else if (tipo.equals("GERIATRICO")) prefijo = "Pac-Ger-";

        long correlativoSimulado = System.currentTimeMillis() % 10000;
        txtIdPaciente.setText(prefijo + String.format("%04d", correlativoSimulado));
    }

    // --- GETTERS Y SETTERS ---
    public String getIdPaciente() { return idPaciente; }
    public void setIdPaciente(String idPaciente) { this.idPaciente = idPaciente; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public String getTipoPaciente() { return tipoPaciente; }
    public void setTipoPaciente(String tipoPaciente) { this.tipoPaciente = tipoPaciente; }
    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getEdadTexto() { return edadTexto; }
    public void setEdadTexto(String edadTexto) { this.edadTexto = edadTexto; }
    public Date getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(Date fechaEntrada) { this.fechaEntrada = fechaEntrada; }
    public int getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(int horaEntrada) { this.horaEntrada = horaEntrada; }
    public int getMinutoEntrada() { return minutoEntrada; }
    public void setMinutoEntrada(int minutoEntrada) { this.minutoEntrada = minutoEntrada; }
}