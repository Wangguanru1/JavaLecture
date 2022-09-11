class Employee{
	String name;
	String id="abc";
	private String team;
	void Employee(String a,String b,String c){
		name=a;
		id=b;
		team=c;
	}
	String getId(){
		return id;
	}

}
class test extends Employee{
	String id="123";

	String getId(){
		return id+id;
	}
	public static void main(String[] args){
		test a=new test();
		System.out.println(a.getId());
		int k,sum=0;
		int q=-12;
		for (k=0;k<=12;k=k+2){
			sum=sum+k;
		}
	}
}
