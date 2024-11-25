package com.example.ServidorSura5.Servicios;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.Repositorios.IRepositorioEnfermedad;
import com.example.ServidorSura5.Repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosEnfermadad {

    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    //se programa las funciones para las distintas opercaiones en bd

    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad)throws Exception{
        try{
            return iRepositorioEnfermedad.save(datosEnfermedad);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
