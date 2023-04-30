package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatriculaServiceImpl implements IMatriculaService{
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public Matricula create(Matricula form) {
        Matricula matricula = new Matricula();
        matricula.setAluno(form.getAluno());
        matricula.setId(form.getId());
        matricula.setDataDaMatricula(form.getDataDaMatricula());

        return matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if(bairro == null){
            return matriculaRepository.findAll();
        }else {
            return matriculaRepository.findByAlunoBairro(bairro);
            }
    }

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }


    @Override
    public void delete(Long id) {

    }
}
