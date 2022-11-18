package br.com.inova.repository;

import br.com.inova.model.Cota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CotaRepository extends Repository<Cota, Long> {

    @Query("select c from Cota c where c.COD_FUNDO = :c")
    List<Cota> findQuotaByCodFund(@Param("c") int c);

    List<Cota> findAll();
}
