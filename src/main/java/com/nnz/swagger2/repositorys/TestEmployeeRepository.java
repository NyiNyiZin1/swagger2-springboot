package com.nnz.swagger2.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nnz.swagger2.entitys.TestEmployee;

@Repository
public interface TestEmployeeRepository extends JpaRepository<TestEmployee, Long>{

}
