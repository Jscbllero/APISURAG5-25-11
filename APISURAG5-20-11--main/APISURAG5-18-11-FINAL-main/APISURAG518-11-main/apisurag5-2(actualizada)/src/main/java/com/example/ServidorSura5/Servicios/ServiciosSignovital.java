package com.example.ServidorSura5.Servicios;

import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.Repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosSignovital {

    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    public SignoVital guardarSignoVital(SignoVital datosSignoVital)throws Exception{

        try{
            return iRepositorioSignoVital.save(datosSignoVital);
        }catch(Exception error){
        throw new Exception(error.getMessage());
    }

    }
    public List<SignoVital> buscarSignovitales()throws Exception{
        try{
            return iRepositorioSignoVital.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
