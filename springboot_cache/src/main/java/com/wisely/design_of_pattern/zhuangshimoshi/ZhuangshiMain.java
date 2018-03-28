package com.wisely.design_of_pattern.zhuangshimoshi;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description: 客户端代码
 * @Date Created in 下午2:31 18/3/28
 */

public class ZhuangshiMain {
    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}
