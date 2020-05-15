package com.yeadam.interfaces;

public interface EmpService {
	// 기능정의. 구현X
	// 한건 생성.
	public void createEmp(Employee emp);	// public abstract void createEmp();
	// 전체 조회.
	public void getEmpList();
	// 한건 수정.
	public void changeEmp(Employee emp);
	// 한건 삭제.
	public void removeEmp(int empId);
	
}
