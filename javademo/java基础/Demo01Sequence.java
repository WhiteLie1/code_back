//顺序结构
/*public class Demo01Sequence {
	public static void main(String[] args) {
		System.out.println("今天天气不错");
		System.out.println("挺风和日丽的");
		System.out.println("我们下午没课");
		System.out.println("这的确挺爽");
	}
}*/
//if语句
/*public class Demo01Sequence {
	public static void main(String[] args) {
		System.out.println("看到网吧");
		int age = 20;
		if (age >= 18) {
			System.out.println("进入网吧开始骂街！");
			System.out.println("感觉不爽，结账走人！");
		}		
		System.out.println("回家吃饭！");		
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int score = 100;
		if (score < 0 || score > 100) {
			System.out.println("输入错误！请重新输入");
		}else if(score >= 90 && score <= 100){
			System.out.println("你的成绩是：优秀!");
		}else if(score >= 80 && score <= 89){
			System.out.println("你的成绩是：好!");
		}else if(score >= 70 && score <= 79){
			System.out.println("你的成绩是：良!");
		}else if(score >= 60 && score <= 69){
			System.out.println("你的成绩是：及格!");
		}else{
			System.out.println("你的成绩是：不及格!");
		}
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//首先使用三元运算符
		int max = a > b ? a : b;
		System.out.println("最大值："+max);

	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;	
			default:
				System.out.println("数据错误！");
				break;
		}

	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		for(int i = 1;i<=10;i++){
			System.out.println("我错了，原谅我吧"+i);
		}
		System.out.println("============");
		int i = 1;
		while(i<=10){
			System.out.println("我错了，原谅我吧"+i);
			i++;
		}

	}
}*/


/*public class Demo01Sequence {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			System.out.println("起来吧，地上怪凉的！"+i);
		}
		System.out.println("***********");
		
		int i = 1;
		do{
			System.out.println("起来吧，地上怪凉的！"+i);
			i++;
		}while(i<=10);

	}
}*/

/*题目：求出1-100之间的偶数的和
1.从1-100的数字一个一个进行检查
2.用if语句进行判断 num%2==0
3.用一个变量，来进行累加操作，好比存钱罐
*/
/*public class Demo01Sequence {
	public static void main(String[] args) {
		int sum = 0;//用来累加的存钱罐
		for(int i = 1;i<=100;i++){
			if(i%2 == 0){
				sum += i;
			}
		}
		System.out.println("结果是："+sum);
		
	}
}*/

/*public class Demo01Sequence {
	public static void main(String[] args) {
		for(int i =1;i<=10;i++){
			if(i==4){
				continue;//打断整个循环
			}
			System.out.println(i+"层到了");
		}
	}
}*/

public class Demo01Sequence {
	public static void main(String[] args) {
		for(int hour = 0;hour<24;hour++){
			for(int minute = 0 ;minute<60;minute++){
				for(int second = 0;second<60;second++){
					System.out.println(hour+"点"+minute+"分"+second+"秒");
				}			 
			}			
		}
	}
}











