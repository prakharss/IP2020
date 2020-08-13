/*
	Obj1 will have access to all methods (M1, M2 and M3 - it is for PRO USERS)
	Obj2 will have access to m1 and m2 methods only (it is for NORMAL USERS)
*/
interface I1 {
	m3();
}

interface I2 {
	m1();
	m2();
}

class A implements I1,I2 {
	m1() {

	}

	m2() {

	}

	m3() {

	}
}

class Test {
	psvm() {
		I1 obj1=new A(); 
		I2 obj2=new A();
	}
}