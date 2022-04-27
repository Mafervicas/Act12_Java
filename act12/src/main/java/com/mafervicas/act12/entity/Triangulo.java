/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mafervicas.act12.entity;

import com.mafervicas.act12.dto.TrianguloDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Mafer Vicas
 */
@Entity //Para mapear a la base de datos
@Data //Gets y Sets
public class Triangulo {
    @Id //Siempre va con ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column()
    private Integer base;
    
    @Column()
    private Integer altura;
    
    
    public Triangulo(){
        
    }
    
    public Triangulo(TrianguloDTO trianguloDTO){
        this.id = trianguloDTO.getId();
        this.altura = trianguloDTO.getAltura();
        this.base = trianguloDTO.getBase();
    }
}
