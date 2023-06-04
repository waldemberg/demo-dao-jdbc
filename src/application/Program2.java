package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: Department insert ===");
		Department dep = new Department(null, "Mechanic");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== Teste 2: Department update ===");
		dep.setId(5);
		dep.setName("Desk");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== Teste 3: Department delete ===");
		departmentDao.deleteById(12);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== Teste 4: Department findById ===");
		Department depTeste = departmentDao.findById(5);
		System.out.println(depTeste);
		
		System.out.println("\n=== Teste 5: Department findByAll ===");
		List<Department> lista = departmentDao.findAll();
		for(Department list : lista) {
			System.out.println(list.getId() + " - " + list.getName());
		}
	}

}
