/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mafervicas.act12.repository;

import com.mafervicas.act12.entity.Triangulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mafer Vicas
 */
public interface TrianguloRepository extends JpaRepository <Triangulo, Integer>{
    //Lo que va adelante de Triangulo es el tipo de dato de la llave primaria
}
