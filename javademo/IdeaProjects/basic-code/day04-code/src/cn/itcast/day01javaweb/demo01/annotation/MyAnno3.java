package cn.itcast.day01javaweb.demo01.annotation;

import java.lang.annotation.*;

/**
 * 元注解，用于描述注解的注解
 * *@Target 描述注解能够作用的位置
 * *@Retention 描述注解被保留的阶段
 * *@Documented 描述注解是否被抽取到api文档中
 * *@Innerited 描述注解是否被之类继承
 *
 *
 */

@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) // 表示anno3只能作用与类上
@Retention(RetentionPolicy.RUNTIME) // 一般我们是加这个注解
@Documented()
public @interface MyAnno3 {
}
