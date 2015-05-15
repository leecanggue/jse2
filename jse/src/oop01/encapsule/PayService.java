package oop01.encapsule;

public class PayService {
	PayVo vo = new PayVo();

	int CalculateIncome(String name, int salary){
		vo.setName(name);
		vo.setSalary(salary);
		vo.setIncome((int)(vo.getSalary()-(vo.getSalary()*PayVo.TAX)));
		return vo.getIncome();
	}
	int tax(int salary){
		return (int)(salary*PayVo.TAX) ;
	}
}