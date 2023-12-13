/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Infraestructure.DBManagment;

import java.sql.SQLException;
import org.Infraestructure.Models.UsuarioModel;
import org.Infraestructure.conexion.conexion;
import org.Services.PersonaService;

/**
 *
 * @author Deku
 */
public class Autenticacion {
    private conexion conexion1;
    private PersonaService persona1;
    
     public Autenticacion(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        this.conexion1 = new conexion(userBD, passDB, hostDB, portDB,dataBase);
        this.persona1 = new PersonaService(userBD, passDB, hostDB, portDB, dataBase);
    }
     
         public UsuarioModel Autenticar(String usuario){
        try {
            conexion1.setQuerySQL(conexion1.conexionDB().createStatement());
            conexion1.setResultadoQuery(conexion1.getQuerySQL().executeQuery("Select * from usuarios where estado = 'activo' and usuario = '" + usuario + "'"));
            if(conexion1.getResultadoQuery().next()){
                return new UsuarioModel(
                        conexion1.getResultadoQuery().getInt("id_usuario"), 
                        persona1.consultarPorId(conexion1.getResultadoQuery().getInt("id_persona")),
                        conexion1.getResultadoQuery().getString("usuario"),
                        conexion1.getResultadoQuery().getString("contrasenha"),
                        conexion1.getResultadoQuery().getString("estado")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
