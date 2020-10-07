package models;

import application.repository.IdolRepository;
import domain.Idol;
import domain.IdolList;
import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Finder;

import java.util.List;

public class IdolRepositoryImpl implements IdolRepository {

    public EbeanServer ebean;
    public static Finder<Integer, IdolEntity> find = new Finder<Integer, IdolEntity>(IdolEntity.class);

    public IdolRepositoryImpl() {
        this.ebean = Ebean.getDefaultServer();
    }

    @Override
    public List<IdolEntity> ListAll(){
        return find.all();
    }
}
