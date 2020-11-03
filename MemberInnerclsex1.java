package nestedclasess;

class University{
	void announcement() {
		System.out.println("Exams Stars from Dec 1st");
		Department cse=new Department();
		cse.examPapers();
	}
	class Department{
		void examPapers() {
			System.out.println("Exams Papers are being Prepared");
		}
	}
}

public class MemberInnerclsex1 {

	public static void main(String[] args) {
		University jntu=new University();
		jntu.announcement();
		

	}

}
