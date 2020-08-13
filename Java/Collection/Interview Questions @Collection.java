//UBER QUESTION
//Implementation of MAP
//Create a map which perform following function
//All this operation should happen in O(1)
a) get(key)
b) insert(key,value)
c) remove (key)
d) getRandom()


//hashCode and equals interview questions
//implement class employee such that size of map is 1
HashMap<Employee, String> hm;
e1=new Employee("1","Prakhar");
e2=new Employee("1","Prakhar");

hm.put(e1,"abc");
hm.put(e2, "def");

class Employee {
	@Override
	public boolean equals(Object e) { //this is imp
		Employee emp=(Employee) e;
		if(this.id == emp.id && this.name == emp.name)
			return true;

		return false;
	}

	@Override
	int hashCode {
		return this.id;
	} 
}
