package org.subhakar.services.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.subhakar.services.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	List<Employee> findByDepartmentId(Long departmentId);

	List<Employee> findByOrganizationId(Long organizationId);
}
