/*
* @Author: Tony Liu
* @Date:   2020-01-29 16:03:35
* @Last Modified by:   Liu Zhenhua
* @Last Modified time: 2020-01-29 19:18:34
*/

/*
	Java Array Basic Application
*/

public class ArrayApp{
	public static void main(String[] args){

		/*
			To declare a int array and initialize it.
		*/
		int[] firstArray = new int[10];
		for(int i=0;i<firstArray.length;i++){
			firstArray[i] = i + 1;
		}


		/*
			for-each Elements in Array
		*/
		for(int value: firstArray){
			System.out.println(value);
		}

		/*
			We can modify the value of Array
			directly by their index;
		*/
		firstArray[3] = 100; //change value by 

		/*
			Using tranditional for loop 
			to output each value of Array
		*/
		for(int i=0;i<firstArray.length;i++){
			System.out.println(firstArray[i]);
		}

	}
}