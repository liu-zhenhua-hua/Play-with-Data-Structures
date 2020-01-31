public class MainApp{
	public static void main(String[] args){
		
		ArrayList array = new ArrayList(15);

		array.addFirst(45);
		array.addFirst(60);
		array.addFirst(88);
		array.addFirst(100);
		array.addFirst(124);
		array.addFirst(145);

		System.out.println("First Element is : "+array.getElement(0));	
	}
}
