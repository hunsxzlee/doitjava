package chapter07;

public class ObjCopy02 {
	public static void main(String[] args) {
		String[][] outArr1 = new String[2][2];
		String[][] outArr2 = new String[2][2];
		String[] arr1 = new String[] {"태백산맥", "조정래"};
		String[] arr2 = new String[] {"데미안", "헤세"};
		outArr1[0] = arr1;
		outArr1[1] = arr2;
		String[] arr3 = new String[2];
		String[] arr4 = new String[2];
		
		System.arraycopy(arr1, 0 , arr2, 0, 2);
		System.arraycopy(arr2, 0 , arr4, 0, 2);
		outArr2[0] = arr3;
		outArr2[1] = arr4;
		
		for(int i = 0; i < outArr2.length; i++) {
			for(int j = 0; j < outArr2[i].length; j++) {
				System.out.print(outArr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		arr1[0] = "소백산맥";
		
		for(int i = 0; i < outArr2.length; i++) {
			for(int j = 0; j < outArr2[i].length; j++) {
				System.out.print(outArr2[i][j] + " ");
				}
			}
		}
	}