package Modelo;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Component;

public class Medico {
    
    // --- ATRIBUTOS ---
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String cedula;
    private String telefono;
    private String correo;
    private String especialidad;
    private String hospital;

    // --- CONSTRUCTOR ---
    public Medico(String nombre, String apellidoP, String apellidoM, String cedula, String telefono, String correo, String especialidad, String hospital) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.hospital = hospital;
    }

    // --- MÉTODOS DE VALIDACIÓN Y CONTROL (Lógica Integrada) ---

    // Valida que ningún campo obligatorio esté vacío
    public static boolean validarCamposCompletos(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                campo.requestFocus(); // Enfoca automáticamente el cursor en el campo vacío
                return false; 
            }
        }
        return true; 
    }

    // Procesa el registro extrayendo los datos de la interfaz
    public static boolean registrarNuevoMedico(
            JTextField txtNombre, JTextField txtApellidoP, JTextField txtApellidoM, 
            JTextField txtCedula, JTextField txtTelefono, JTextField txtCorreo, 
            JTextField txtEspecialidad, JTextField txtHospital, Component vista) {
        
        // 1. Validar si todos los campos requeridos están llenos
        boolean estanLlenos = validarCamposCompletos(
            txtNombre, txtApellidoP, txtApellidoM, txtCedula, 
            txtTelefono, txtCorreo, txtEspecialidad, txtHospital
        );

        if (!estanLlenos) {
            JOptionPane.showMessageDialog(vista, "Debe completar todos los campos del formulario.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // 2. Instanciar el objeto del modelo con la información limpia
        Medico nuevoMedico = new Medico(
            txtNombre.getText().trim(),
            txtApellidoP.getText().trim(),
            txtApellidoM.getText().trim(),
            txtCedula.getText().trim(),
            txtTelefono.getText().trim(),
            txtCorreo.getText().trim(),
            txtEspecialidad.getText().trim(),
            txtHospital.getText().trim()
        );

        // =======================================================================
        // 3. [FUTURO] Integración JDBC para base de datos relacional (ej. PostgreSQL)
        // Aquí invocarás tu clase Conexion y ejecutarás la operación de Crear (C del CRUD).
        // =======================================================================
        
        JOptionPane.showMessageDialog(vista, "Médico guardado con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        return true; 
    }

    // --- GETTERS Y SETTERS ---

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoP() { return apellidoP; }
    public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }

    public String getApellidoM() { return apellidoM; }
    public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getHospital() { return hospital; }
    public void setHospital(String hospital) { this.hospital = hospital; }
}