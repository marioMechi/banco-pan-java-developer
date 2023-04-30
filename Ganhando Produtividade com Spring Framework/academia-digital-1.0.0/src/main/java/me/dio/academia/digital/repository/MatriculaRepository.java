package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository {
    Matricula save(Matricula matricula);

    List<Matricula> findAll();

    List<Matricula> findByAlunoBairro(String bairro);
}
