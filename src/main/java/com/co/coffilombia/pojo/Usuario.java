
package com.co.coffilombia.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @Id
    public Integer idusuario;
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String correo;
    public String profecion;
    
    
}

 // @GeneratedValue(strategy=GenerationType.IDENTITY)