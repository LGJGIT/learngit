package com.wisely.design_of_pattern.zhuangshimoshi;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description: 待装饰的对象
 * @Date Created in 下午2:20 18/3/28
 */

public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
