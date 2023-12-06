package ar.com.cac.entity;

import java.time.LocalDate;

public class Orador {

	private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String tema;
    private LocalDate fechaAlta;

    public Orador(String nombre, String apellido, String email, String tema, LocalDate fechaAlta) {
        init(nombre, apellido, email, tema, fechaAlta);
    }

    public Orador(Long id, String nombre, String apellido, String email, String tema, LocalDate fechaAlta) {
        this.id = id;
        init(nombre, apellido, email, tema, fechaAlta);
    }

    public void init(String nombre, String apellido, String email, String tema, LocalDate fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tema = tema;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", tema="
                + tema + ", fechaAlta=" + fechaAlta + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
