package ar.edu.utn.frc.backend.application.controller;

import ar.edu.utn.frc.backend.application.ResponseHandler;
import ar.edu.utn.frc.backend.domain.model.User;
import ar.edu.utn.frc.backend.service.TokenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TokenController {

    private final TokenService service;

    public TokenController(TokenService aService){
        this.service = aService;
    }

    @GetMapping("/")
    public ResponseEntity<Object> getToken(User user){
        // devuelve todos los token del usuario

        // arma la lista de los token...
        var result = service.getAllTokens(user);

        // se lo pasa al responseHandler...
        return ResponseHandler.generateResponse("OK", HttpStatus.OK, result);

    };

    @PostMapping("/")
    public ResponseEntity<Object> postToken(){
        // Crea un nuevo token
        //return service.generateToken();

        return ResponseHandler.internalServerError();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteToken(){
        return ResponseHandler.internalServerError();

    }

    @GetMapping("/version")
    public String getVersion(){
        return "v1.0";
    }

}
