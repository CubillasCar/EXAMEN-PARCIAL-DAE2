package pe.isil.service;

import java.util.List;

public interface BaseService<C, K> {

    void create(C c);
    void update(C c);
    void deleteById(K k);

    List<C> findAll();
    C findById(K k);
}
