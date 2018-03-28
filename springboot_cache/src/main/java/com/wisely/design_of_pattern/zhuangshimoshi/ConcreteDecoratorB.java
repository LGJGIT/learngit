package com.wisely.design_of_pattern.zhuangshimoshi;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description:
 * @Date Created in 下午2:28 18/3/28
 */

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作!");
    }

    //添加具体行为 本类独有方法
    private void addedBehavior(){

    }
}
