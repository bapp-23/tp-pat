package ar.edu.utn.frc.backend.repository;

import ar.edu.utn.frc.backend.infrastructure.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TokenRepository implements  IRepository{

    private IDao dao;
    public TokenRepository( IDao tokenDao ){
        this.dao = tokenDao;
    }

    @Override
    public void save() {
        dao.upsert();
    }

    @Override
    public void getAll() {

    }
}
