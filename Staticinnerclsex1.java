package map;

class Universitys{
	static int papers=50;
	static void announcement() {
		
		System.out.println("Exams Stars from Dec 1st");
		class Department{
			void examPapers() {
				System.out.println("Exams Papers are being Prepared"+papers);
			}
		
	}
		Department cse=new Department();
		cse.examPapers();
	}
}

public class Staticinnerclsex1 {

	public static void main(String[] args) {
		
		Universitys.announcement();	

	}

}
