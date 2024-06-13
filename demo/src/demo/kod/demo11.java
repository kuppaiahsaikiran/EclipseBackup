package demo.kod;


public class demo11 {
		String name;
		long salary;
		public demo11(String string, int i) {
			// TODO Auto-generated constructor stub
		}
		void work(){
			System.out.println("working");
		}
		void comunicate(){
			System.out.println("Comunicating");
		}
		public void employeeclass2(String name,long salary) {
			this.name=name;
			this.salary=salary;
		}
		class test{
		public static void main(String[] args) {
		demo11 e1 = new demo11("are",77664);
		
		demo11 e2 = new demo11("iuyit",87685);
		
		demo11 e3 = new demo11("jyutuy",897687);
		
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		
	}

		}
}
