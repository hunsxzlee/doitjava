package chapter07;

public class ObjCopy01 {
	public static void main(String[] args) {
		String[][] outArr1 = new String[2][2];
		String[][] outArr2 = new String[2][2];
		String[] arr1 = new String[] {"�¹���", "������"};
		String[] arr2 = new String[] {"���̾�", "�켼"};
		outArr1[0] = arr1;
		outArr1[1] = arr2;
		
		System.arraycopy(outArr1, 0 , outArr2, 0, 2);
		
		for(int i = 0; i < outArr2.length; i++) {
			for(int j = 0; j < outArr2[i].length; j++) {
				System.out.print(outArr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		arr1[0] = "�ҹ���";
		for(int i = 0; i < outArr2.length; i++) {
			for(int j = 0; j < outArr2[i].length; j++) {
				System.out.print(outArr2[i][j] + " ");
				}
			}
		}
	}