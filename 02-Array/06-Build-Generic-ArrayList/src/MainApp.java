public class MainApp{
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<>(20);

		for(int i=0;i<10;i++)
			array.addLast(i+1);

		//Output the Element from ArrayList
		System.out.println(array);

		
		//remove the Element 4 from ArrayList
		array.deleteElement(4);
		System.out.println(array);
		

	}
}
