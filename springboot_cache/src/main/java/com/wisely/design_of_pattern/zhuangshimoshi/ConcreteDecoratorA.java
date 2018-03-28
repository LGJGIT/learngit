package com.wisely.design_of_pattern.zhuangshimoshi;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午2:23 18/3/28
 */

public class ConcreteDecoratorA extends Decorator {
    private String addedState;  //本类独有功能

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New state";
        System.out.println("具体装饰对象A的操作!");
    }
}
