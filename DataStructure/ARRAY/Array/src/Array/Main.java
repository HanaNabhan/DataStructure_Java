package Array;

/// 07/11/2024

public class Main {

	

	public static void main(String[] args) {

		Array a = new Array(10);
		a.Fill();
		a.Display();
		a.Delete(2);
		System.out.println("after delete");
        a.Display();
        a.Append(5);
		System.out.println("after append");  
        a.Display();
        a.Insert(3, 5);
		System.out.println("after insert");  
        a.Display();

	}

}
