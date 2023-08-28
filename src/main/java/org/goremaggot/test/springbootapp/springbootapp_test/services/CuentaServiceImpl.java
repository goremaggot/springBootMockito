package org.goremaggot.test.springbootapp.springbootapp_test.services;

import java.math.BigDecimal;

import org.goremaggot.test.springbootapp.springbootapp_test.models.Banco;
import org.goremaggot.test.springbootapp.springbootapp_test.models.Cuenta;
import org.goremaggot.test.springbootapp.springbootapp_test.repositories.BancoRepository;
import org.goremaggot.test.springbootapp.springbootapp_test.repositories.CuentaRepository;

public class CuentaServiceImpl implements CuentaService {

    private CuentaRepository cuentaRepository;
    private BancoRepository bancoRepository;

    public CuentaServiceImpl(CuentaRepository cuentaRepository, BancoRepository bancoRepository) {
        this.cuentaRepository = cuentaRepository;
        this.bancoRepository = bancoRepository;
    }

    @Override
    public Cuenta findByid(Long id) {
        return cuentaRepository.findById(id);
    }

    @Override
    public int revisarTotalTransferencias(Long bancoId) {
        Banco banco = bancoRepository.findById(bancoId);
        return banco.getTotalTransferencias();
    }

    @Override
    public BigDecimal revisarSaldo(Long cuentaId) {
        Cuenta cuenta = cuentaRepository.findById(cuentaId);
        return cuenta.getSaldo();
    }

    @Override
    public void transferir(Long cuentaOrigen, Long cuentaDestino, BigDecimal monto) {
        Banco banco = bancoRepository.findById(1L);
        int totalTransferencia = banco.getTotalTransferencias();
        banco.setTotalTransferencias(++totalTransferencia);
        bancoRepository.update(banco);

        Cuenta cuentaO = cuentaRepository.findById(cuentaOrigen);
        cuentaO.debito(monto);
        cuentaRepository.update(cuentaO);
        
        Cuenta cuentaD = cuentaRepository.findById(cuentaDestino);
        cuentaD.credito(monto);
        cuentaRepository.update(cuentaD);

    }

}
