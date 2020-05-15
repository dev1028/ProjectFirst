package com.yedam.database;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] emps = dao.getEmpList();
//		for(Employee emp : emps) {
//			if(emp != null) {
//				System.out.println(emp.toString());
//			}
//		}
		
		Emp emp = new Emp("asdasd", "1999-10-10");
		emp.setEmployeeId(300);
		emp.setSalary(1000);
		dao.insertEmp(emp);
	}
}
