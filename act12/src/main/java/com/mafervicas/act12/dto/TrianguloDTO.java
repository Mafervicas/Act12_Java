package com.mafervicas.act12.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mafervicas.act12.entity.Triangulo;
import lombok.Data;
/**
 *
 * @author Mafer Vicas
 */
@Data
public class TrianguloDTO {
    private Integer id;
    private Integer base;
    private Integer altura;
    
    public Integer area(){
        return (base*altura)/2;
           }

    public TrianguloDTO() {
    }

    public TrianguloDTO(Triangulo triangulo) {
        this.id = triangulo.getId();
        this.base = triangulo.getBase();
        this.altura = triangulo.getAltura();
    }
    
   
}