package ar.edu.utn.frc.backend.application.controller;

import ar.edu.utn.frc.backend.application.ResponseHandler;
import ar.edu.utn.frc.backend.application.request.CreateTokenRequest;
import ar.edu.utn.frc.backend.application.request.GetAllTokenRequest;
import ar.edu.utn.frc.backend.domain.model.User;
import ar.edu.utn.frc.backend.repository.TokenRepository;
import ar.edu.utn.frc.backend.service.ITokenService;
import ar.edu.utn.frc.backend.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TokenController {

    @Autowired
    private ITokenService service;


    @GetMapping("/")
    public ResponseEntity<Object> getToken(@RequestBody GetAllTokenRequest request){
        // devuelve todos los token del usuario

        // arma la lista de los token...
        var result = service.getAllToken(request);

        // se lo pasa al responseHandler...
        return ResponseHandler.generateResponse("OK", HttpStatus.OK, result);

    }

    @PostMapping("/")
    public ResponseEntity<Object> postToken(@RequestBody CreateTokenRequest model){
        // Crea un nuevo token
        // recibe un nombre y el expire date
        //return service.generateToken();
        var result = service.addToken(model);
        //return ResponseHandler.internalServerError();
        return ResponseHandler.generateResponse(result.guid(), HttpStatus.OK, result);
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
