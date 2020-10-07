package models;

import io.ebean.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class IdolEntity extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String unitname;

    public IdolEntity() {
        super();
    }

    public IdolEntity(int id, String name, String unitname) {
        super();
        this.id = id;
        this.name = name;
        this.unitname = unitname;
    }
}
