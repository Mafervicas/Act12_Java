package com.mafervicas.act12.controller;

import com.mafervicas.act12.dto.TrianguloDTO;
import com.mafervicas.act12.entity.Triangulo;
import com.mafervicas.act12.service.TrianguloService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mafer Vicas
 */
@Controller
public class TrianguloController {
    @Autowired
    TrianguloService trianguloService;
    
    @RequestMapping("/")
    public String viewHomePage() {
            return "index";
        }
    
    @RequestMapping("/triangulo")
    public List<TrianguloDTO> getTriangulos() {
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(123);
        triangulo.setBase(123);
        trianguloService.guardarTriangulo(triangulo);
        return trianguloService.getTriangulos();
    }

  
}
