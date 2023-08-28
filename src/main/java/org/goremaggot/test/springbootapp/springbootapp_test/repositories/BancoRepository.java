package org.goremaggot.test.springbootapp.springbootapp_test.repositories;

import java.util.List;

import org.goremaggot.test.springbootapp.springbootapp_test.models.Banco;

public interface BancoRepository {
    List<Banco> findAll();

    Banco findById(Long id);

    void update(Banco banco);
}
