
public class Main {

	public static void main(String[] args) {
			//Создал Main
		int n = (int)(Math.random()*100) + 1;
		int[] arr = new int[n];
		System.out.println("Рандомный массив из " + n + " чисел:");

		 for(int i = 0; i < arr.length; i++){
		   arr[i] = (int)(Math.random()*1000);
		   System.out.print(arr[i] + " ");
		}
		 
		 Shaker.shaker(arr);
		 System.out.println();
		 System.out.println("Отсортированный шейкером рандомный массив:");
		 for(int i = 0; i < arr.length; i++){
			   System.out.print(arr[i]+" ");
		}
		 

		 Bubble.bubble(arr);
		 System.out.println();
		 System.out.println("Отсортированный пузырьком рандомный массив:");
		 for(int i = 0; i < arr.length; i++){
			   System.out.print(arr[i]+" ");
		}
	}

}
