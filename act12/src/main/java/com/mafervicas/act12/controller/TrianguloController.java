package com.mafervicas.act12.controller;

import com.mafervicas.act12.dto.TrianguloDTO;
import com.mafervicas.act12.entity.Triangulo;
import com.mafervicas.act12.service.TrianguloService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
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
    public String viewHomePage(HttpSession session, Model model) {
        List<Triangulo> listTriangulos = trianguloService.listAll();
            session.setAttribute("mySessionAttribute", "sasas");
            model.addAttribute("listTriangulos", listTriangulos);
            return "index";
        }
    
    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Triangulo triangulo = new Triangulo();
        model.addAttribute("triangulo", triangulo);

        return "new_triangulo";
    }
    
     @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTriangulo(@ModelAttribute("triangulo") Triangulo triangulo) {
        trianguloService.save(triangulo);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTrianguloPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_triangulo");
        Triangulo triangulo = trianguloService.get(id);
        mav.addObject("triangulo", triangulo);

        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteTriangulo(@PathVariable(name = "id") int id) {
        trianguloService.delete(id);
        return "redirect:/";
    }
    
    @RequestMapping("/triangulo")
    public List<TrianguloDTO> getTriangulos() {
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(123);
        triangulo.setBase(123);
        trianguloService.save(triangulo);
        return trianguloService.getTriangulos();
    }
    
      

  
}
