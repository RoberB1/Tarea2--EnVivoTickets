/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaenvivotickets;

/**
 *
 * @author rb122
 */
public class Usuario {
    int idUsuario;
    String nombre;
    String email;
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void recibirNotificacion(String msg) {
        System.out.println(nombre + " ha recibido una notificación: " + msg);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
