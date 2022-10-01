package com.co.coffilombia;

import com.co.coffilombia.dao.UsuarioDAO;
import com.co.coffilombia.pojo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControllerInicio {

    @Autowired
    private UsuarioDAO usuariodao;

    @GetMapping("/")
    public String inicio() {

        return "index";
    }
    @GetMapping("/login")
    public String inicioSecion() {
      
        return "inicioSecion";
    }
    @GetMapping("/loginadmin")
    public String loginadmin(Model model){
        var usuarios = usuariodao.findAll();
        model.addAttribute("usuarios", usuarios);
        return "loginadmin";
    }
    @GetMapping("/details")
    public String details(Model model) {
        var usuarios = usuariodao.findAll();
        model.addAttribute("usuarios", usuarios);
        return "details";
    }
    @GetMapping("/registro")
    public String registro() {

        return "registro";
    }
   
    @GetMapping("/team")
    public String team() {

        return "team";
    }
    @GetMapping("/blog")
    public String blog() {

        return "blog";
    } 
     
    @GetMapping("/registrar")
    public String registrar(){
        return "registrar";
    }
    @GetMapping("/single")
    public String single(){
        return "single";
    }
    
    @PostMapping("/guardar")
    public String guardar(Usuario usuarios){
        usuariodao.save(usuarios);
        return "redirect:/loginadmin";
    }
    
    @GetMapping("/editar/{idcliente}")
    public String editar(@PathVariable("idcliente") Integer idusuario, Model model){
        var usuarios = usuariodao.findById(idusuario);
        model.addAttribute("usuarios", usuarios);
        return "modificar";
        
    }
    
    @GetMapping("/eliminar/{idusuario}")
    public String eliminar(@PathVariable("idusuario") Integer idusuario){
        usuariodao.deleteById(idusuario);
    
        return "redirect:/loginadmin";
        
    }
    
    @GetMapping("/tablaRegi")
    public String tablaRegir(Model model) {
        var usuarios = usuariodao.findAll();
        model.addAttribute("usuarios", usuarios);
        return "tablaRegi";
    } 
    
   

}
