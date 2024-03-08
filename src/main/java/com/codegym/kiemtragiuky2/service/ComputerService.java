package com.codegym.kiemtragiuky2.service;

import com.codegym.kiemtragiuky2.model.Computer;
import com.codegym.kiemtragiuky2.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ComputerService implements IComputerService{
    @Autowired
    private IComputerRepository iComputerRepository;
    @Override
    public Iterable<Computer> findAll() {
        return iComputerRepository.findAll();
    }

    @Override
    public Optional<Computer> findById(Long id) {
        return iComputerRepository.findById(id);
    }

    @Override
    public Computer save(Computer computer) {
        return iComputerRepository.save(computer);
    }

    @Override
    public void remove(Long id) {
    iComputerRepository.deleteById(id);
    }
}
