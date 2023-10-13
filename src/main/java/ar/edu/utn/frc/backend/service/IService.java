package ar.edu.utn.frc.backend.service;

import ar.edu.utn.frc.backend.domain.model.Token;

import java.util.List;

public interface IService {

    String generateToken();

    List<Token> getAllTokens(String user);

    String saveToken(String tok);

    void deleteToken(String user);
}
