package com.codegym.kiemtragiuky2.repository;
import com.codegym.kiemtragiuky2.model.Computer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface IComputerRepository extends PagingAndSortingRepository<Computer, Long> {
}
