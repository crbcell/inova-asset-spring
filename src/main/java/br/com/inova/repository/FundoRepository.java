package br.com.inova.repository;

import br.com.inova.model.Fundo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface FundoRepository extends Repository<Fundo, Long> {

    @Query("select f from Fundo f where f.RISCO_FUNDO = :f")
    List<Fundo> findFundoByRisco(@Param("f") String f);

    @Query("select f from Fundo f where f.DATA_ENCERRAMENTO_FUNDO is null")
    List<Fundo> findFundosAtivos();
    List<Fundo> findAll();

}

