package com.example.ejemplomvvmtrabajofinal.dm;

public class Estudiante {
    private int id;
    private String email;
    private String nombre;
    private String telefono;

    public Estudiante() { }

    public Estudiante(int id, String email, String nombre, String telefono) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
