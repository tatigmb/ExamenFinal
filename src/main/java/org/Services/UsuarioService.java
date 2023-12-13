/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Services;

import org.Infraestructure.DBManagment.Autenticacion;
import org.Infraestructure.Models.UsuarioModel;

/**
 *
 * @author Deku
 */
public class UsuarioService {
    private Autenticacion usuarioDB;
    public UsuarioService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        usuarioDB = new Autenticacion(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public UsuarioModel autenticar(String usuario){
       return usuarioDB.Autenticar(usuario);
    }

    private boolean validarDatos(UsuarioModel usuario) {
        try {
            if (usuario.getUsuario().trim().isEmpty()) {
                throw new Exception("El nombre no debe estar vacío");
            } else if (usuario.getUsuario().trim().length() < 3) {
                throw new Exception("El nombre no tiene la longitud necesaria");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
