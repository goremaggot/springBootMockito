package org.goremaggot.test.springbootapp.springbootapp_test.services;

import java.math.BigDecimal;

import org.goremaggot.test.springbootapp.springbootapp_test.models.Cuenta;

public interface CuentaService {
    Cuenta findByid(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long cuentaOrigen, Long cuentaDestino, BigDecimal monto);
}
