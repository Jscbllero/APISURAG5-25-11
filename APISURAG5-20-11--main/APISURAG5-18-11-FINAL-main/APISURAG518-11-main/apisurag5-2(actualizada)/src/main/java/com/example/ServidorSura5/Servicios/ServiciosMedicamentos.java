package com.example.ServidorSura5.Servicios;

import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.Repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMedicamentos {
    //llamar al respositorio respectivo

    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    //se programa las funciones para las distintas opercaiones en bd

    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try{
            return iRepositorioMedicamento.save(datosMedicamento);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}

