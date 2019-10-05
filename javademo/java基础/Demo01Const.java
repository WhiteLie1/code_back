/*public class Demo01Const{
	public static void main(String[] args){
		//字符串常量
		System.out.println("ABC");
		System.out.println("");//字符串两引号中间的内容为空
		System.out.println("xyz");
	}
}*/

//变量的示例
/*public class Demo01Const{
	public static void main(String[] args){
		int num1;
		num1 = 10;
		System.out.println(num1);
		//改变变量当中本来数字，变成新的数字
		num1 = 20;
		System.out.println(num1);
		System.out.println("***************");

		byte num2 = 127;
		System.out.println(num2);
	}
}*/

/*public class Demo01Const{
	public static void main(String[] args){
		int num1 = 10;

	}
}*/

/*public class Demo01Const{
	public static void main(String[] args){
		System.out.println(1024);
	}
}*/

/*public class Demo01Const{
	public static void main(String[] args){
		int num = (int)100L;
		System.out.println(num);
	}
}*/

/*public class Demo01Const{
	public static void main(String[] args){
		char zifu1 = '1';
		System.out.println(zifu1+0);//49
	}
}*/

/*public class Demo01Const{
	public static void main(String[] args){
		//int a = 20;
		//int b = 30;
		//System.out.println(a-b);//49
		int x = 10;
		int y = 3;
		int result1 = x/y;
		System.out.println(result1);
		
		int result2 = x % y;
		System.out.println(result2);
	}
}*/

public class Demo01Const{
	public static void main(String[] args){
		cook();
	
	}
	//我
	public static void me(){		
		System.out.println("吃");
	}
	//厨子
	public static void cook(){		
		System.out.println("洗菜");
		System.out.println("切菜");
		System.out.println("炒菜");
		System.out.println("装盘");
	}
	//小商贩
	public static void seller(){		
		System.out.println("运输到农贸市场");
		System.out.println("抬高价格");
		System.out.println("吆喝");
		System.out.println(" 卖给厨子");
	}
	//农名伯伯
	public static void farmer(){
		System.out.println("播种");
		System.out.println("浇水");
		System.out.println("施肥");
		System.out.println("除虫");
		System.out.println("收割");
		System.out.println("卖给小商贩");
	}
}












