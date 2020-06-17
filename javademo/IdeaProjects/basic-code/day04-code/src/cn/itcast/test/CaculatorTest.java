package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {
    /**
     * 初始化方法测试方法在执行前
     * 用于资源申请，所有测试方法在执行前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init......");
    }
    /**
     * 初始化方法测试方法在执行前
     * 用于资源申请，所有测试方法在执行前都会先执行该方法
     */
    @After
    public void close(){
        System.out.println("close ......");
    }


    /**
     * 测试add方法
    */
    @Test
    public void testAdd(){
//        System.out.println("我被执行了！");
        // 1.创建计算器对象
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        // 2.调用add方法
        int result = c.add(1,2);
//        一般不会直接输出结果来进行一个判断
//        System.out.println(result);
        // 3.断言 我断言这个结果是3
        Assert.assertEquals(3,result);
    }

    public void testSub(){
        // 1.创建计算器对象
        System.out.println("testSub...");
        Calculator c = new Calculator();
        int result = c.sub(1,2);
        Assert.assertEquals(3,result);
    }

}
