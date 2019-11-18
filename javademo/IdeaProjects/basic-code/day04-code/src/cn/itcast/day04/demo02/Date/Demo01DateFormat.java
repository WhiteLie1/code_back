package cn.itcast.day04.demo02.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
DateFormat是日期/时间格式化子类的抽象类，它以语言无关的方式格式化和分析日期或时间。 日期/时间格式化子类（如SimpleDateFormat ）
允许格式化（即日期文本），解析（文本日期）和归一化。 该日期表示为一个Date对象，或自1970年1月1日00:00:00 GMT以来的毫秒。
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }
    /*
    用parse来把文本解析为日期
    注意：
          parse声明了一个异常叫做 ParseException
          如果字符串和构造方法的模式不一样，就会抛出异常
          调用一个抛出异常的方法，就必须处理这个异常，要么throws抛出这个异常，要么try catch处理
     */
    private static void demo02() throws ParseException {
        // 1.创建simpleDate对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 2.调用SimpleDateFormat中的Parse方法，按照构造方法中指定的模式，把date日期格式解析为Date日期
        Date date = sdf.parse("2019年11月18日 16时50分"); // 少了一个秒参数则报错
        System.out.println(date);
    }

    /*
    使用DateFormat类中的方法format，把日期格式化为文本
     */
    private static void demo01() {
        // 1.创建simpleDate对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 2.调用SimpleDateFormat中的format方法，按照构造方法中指定的模式，把date日期格式化为符合模式的字符串
        // 3.按照指定的模式把Date日期格式转化为符合模式的字符串
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(d); // 2019年11月18日 16时50分06秒
    }
}
