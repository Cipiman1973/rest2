package cz.cipisek.rest.managers;

import cz.cipisek.rest.entities.ZviratkoEntity;

import javax.enterprise.context.ApplicationScoped;

import java.io.Serializable;
import java.util.HashMap;


@ApplicationScoped
public class RestManager implements Serializable {


    private HashMap<Integer, ZviratkoEntity> zviratka = new HashMap<>();

    public HashMap<Integer, ZviratkoEntity> getAll() {
        return zviratka;
    }

    public void create(ZviratkoEntity zviratko) {
        zviratka.put(zviratko.getId(), zviratko);
        zviratko.getId();
    }

    public void edit(Integer id, ZviratkoEntity zviratko) {
        zviratka.put(id, zviratko);
    }

    public void delete(Integer id) {
        zviratka.remove(id);
    }

    public ZviratkoEntity getOne(Integer id) {
        return zviratka.get(id);
    }
}
