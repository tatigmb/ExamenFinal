/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Infraestructure.Models;

/**
 *
 * @author Deku
 */
public class UsuarioModel {
    private int IdUsuario;
    private PersonaModel persona;
    private String Usuario;
    private String Contraseña;
    private String estado;


    public UsuarioModel(int IdUsuario, PersonaModel persona, String Usuario, String Contraseña, String estado) {
        this.IdUsuario = IdUsuario;
        this.persona = persona;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.estado = estado;
    }

    public UsuarioModel() {
        
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
