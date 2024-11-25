package com.example.ServidorSura5.Controladores;


import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.Servicios.ServiciosSignovital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/SignoVital")
public class ControladorSignoVital {
    @Autowired
    ServiciosSignovital serviciosSignoVital;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviciosSignoVital.guardarSignoVital(datos));

        }catch( Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}



