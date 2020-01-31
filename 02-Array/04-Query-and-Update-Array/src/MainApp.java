public class MainApp{
	public static void main(String[] args){
		ArrayList array = new ArrayList(20);

		array.addFirst(45);
		array.addFirst(15);
		array.addFirst(30);
		System.out.println(array);
		System.out.println(array.getElement(0));
	}
}
