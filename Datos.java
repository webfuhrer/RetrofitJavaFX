/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocontaminacionretrofit;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author FPMananaA
 */
public class Datos {
    
    private List<Estacion> data;

    public List<Estacion> getData() {
        return data;
    }

    public void setData(List<Estacion> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Datos{" + "data=" + data + '}';
    }
    
}
