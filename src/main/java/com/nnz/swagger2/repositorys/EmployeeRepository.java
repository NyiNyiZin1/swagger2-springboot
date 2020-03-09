package com.nnz.swagger2.repositorys;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nnz.swagger2.entitys.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
