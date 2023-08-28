package org.goremaggot.test.springbootapp.springbootapp_test.repositories;

import java.util.List;

import org.goremaggot.test.springbootapp.springbootapp_test.models.Cuenta;

public interface CuentaRepository {
    List<Cuenta> findAll();

    Cuenta findById(Long id);

    void update(Cuenta cuenta);

}
