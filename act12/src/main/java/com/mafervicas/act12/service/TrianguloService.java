/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mafervicas.act12.service;

import com.mafervicas.act12.dto.TrianguloDTO;
import com.mafervicas.act12.entity.Triangulo;
import com.mafervicas.act12.repository.TrianguloRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mafer Vicas
 */
@Service
@Transactional
public class TrianguloService {
    
    @Autowired
    TrianguloRepository trianguloRepository;
    
    public List<TrianguloDTO> getTriangulos(){
        List<Triangulo> temp = (List<Triangulo>) trianguloRepository.findAll();
        List<TrianguloDTO> list = new ArrayList();
        for (Triangulo triangulo : temp){
            list.add(new TrianguloDTO(triangulo));
        }
        return list;
    }
    
    public List<Triangulo> listAll() {
		return trianguloRepository.findAll();
	}
	
	public void save(Triangulo triangulo) {
		trianguloRepository.save(triangulo);
	}
	
	public Triangulo get(Integer id) {
		return trianguloRepository.findById(id).get();
	}
	
	public void delete(Integer id) {
		trianguloRepository.deleteById(id);
	}
    
}
