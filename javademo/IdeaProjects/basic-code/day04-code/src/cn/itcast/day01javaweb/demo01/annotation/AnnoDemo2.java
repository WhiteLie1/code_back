package cn.itcast.day01javaweb.demo01.annotation;

/**
 *
 * jdk中预定义的一些注解
 *
 * *@override 检测被该注解标注的方法是否是继承自父类接口的
 * *@Deprecated 该注解标注的内容表示已经过时了
 * *@SupperssWarning 压制警告
 *
 */
// 压制所有警告
@SuppressWarnings("all")
public class AnnoDemo2 {
    // 重写toString方法
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1(){
        // 有缺陷
    }

    public void show2(){
        // 替代show1方法
    }
    public void demo(){
        show1();
    }
}
