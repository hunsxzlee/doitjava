package chapter08;

public class KumhoRire extends Tire {
	//�ʵ�
	
		//������
		public KumhoRire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		//�޼ҵ�
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location + "KumhoRire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
				return true;
			} else {
				System.out.println("***" + location + "KumhoRire ��ũ ***");
				return false;
			}
		}
	}