//˳��ṹ
/*public class Demo01Sequence {
	public static void main(String[] args) {
		System.out.println("������������");
		System.out.println("ͦ���������");
		System.out.println("��������û��");
		System.out.println("���ȷͦˬ");
	}
}*/
//if���
/*public class Demo01Sequence {
	public static void main(String[] args) {
		System.out.println("��������");
		int age = 20;
		if (age >= 18) {
			System.out.println("�������ɿ�ʼ��֣�");
			System.out.println("�о���ˬ���������ˣ�");
		}		
		System.out.println("�ؼҳԷ���");		
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int score = 100;
		if (score < 0 || score > 100) {
			System.out.println("�����������������");
		}else if(score >= 90 && score <= 100){
			System.out.println("��ĳɼ��ǣ�����!");
		}else if(score >= 80 && score <= 89){
			System.out.println("��ĳɼ��ǣ���!");
		}else if(score >= 70 && score <= 79){
			System.out.println("��ĳɼ��ǣ���!");
		}else if(score >= 60 && score <= 69){
			System.out.println("��ĳɼ��ǣ�����!");
		}else{
			System.out.println("��ĳɼ��ǣ�������!");
		}
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//����ʹ����Ԫ�����
		int max = a > b ? a : b;
		System.out.println("���ֵ��"+max);

	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;	
			default:
				System.out.println("���ݴ���");
				break;
		}

	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		for(int i = 1;i<=10;i++){
			System.out.println("�Ҵ��ˣ�ԭ���Ұ�"+i);
		}
		System.out.println("============");
		int i = 1;
		while(i<=10){
			System.out.println("�Ҵ��ˣ�ԭ���Ұ�"+i);
			i++;
		}

	}
}*/


/*public class Demo01Sequence {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			System.out.println("�����ɣ����Ϲ����ģ�"+i);
		}
		System.out.println("***********");
		
		int i = 1;
		do{
			System.out.println("�����ɣ����Ϲ����ģ�"+i);
			i++;
		}while(i<=10);

	}
}*/

/*��Ŀ�����1-100֮���ż���ĺ�
1.��1-100������һ��һ�����м��
2.��if�������ж� num%2==0
3.��һ���������������ۼӲ������ñȴ�Ǯ��
*/
/*public class Demo01Sequence {
	public static void main(String[] args) {
		int sum = 0;//�����ۼӵĴ�Ǯ��
		for(int i = 1;i<=100;i++){
			if(i%2 == 0){
				sum += i;
			}
		}
		System.out.println("����ǣ�"+sum);
		
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		for(int i =1;i<=10;i++){
			if(i==4){
				continue;//�������ѭ��
			}
			System.out.println(i+"�㵽��");
		}
	}
}*/

public class Demo01Sequence {
	public static void main(String[] args) {
		for(int hour = 0;hour<24;hour++){
			for(int minute = 0 ;minute<60;minute++){
				for(int second = 0;second<60;second++){
					System.out.println(hour+"��"+minute+"��"+second+"��");
				}			 
			}			
		}
	}
}











