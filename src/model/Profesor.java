/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Sandra
 * ESTÁ COMENTADO EL EJEMPLO DE PROFESOR DE LA CLASE 22-01-2019
 */
public class Profesor implements Serializable {

    private int id;
    private Nombre nombre;
    private TipoFuncionario tipoFuncionario;
    //private String nombre;
   // private String ape1;
   // private String ape2;

    public Profesor() {
    }

      public Profesor(Nombre nombre, TipoFuncionario tipoFuncionario) {
        this.nombre = nombre;
        this.tipoFuncionario=tipoFuncionario;
    }

    /*public Profesor(String nombre, String ape1, String ape2) {
    this.nombre = nombre;
    this.ape1 = ape1;
    this.ape2 = ape2;
    }*/
    
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
    
     public Nombre getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    /*
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }*/

}
