package nestedclasess;



class Universitys{
	void announcement() {
		System.out.println("Exams Stars from Dec 1st");
		class Department{
			void examPapers() {
				System.out.println("Exams Papers are being Prepared");
			}
		
	}
		Department cse=new Department();
		cse.examPapers();
	}
}

public class Localinnerclsex1 {

	public static void main(String[] args) {
		Universitys jntu=new Universitys();
		jntu.announcement();	

	}

}
