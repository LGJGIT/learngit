package com.wisely.design_of_pattern.zhuangshimoshi;

/**
 * Created by lvguojun
 *
 * @Author: lvguojun
 * @Description: 抽象装饰器父类
 * @Date Created in 下午2:17 18/3/28
 */

public abstract class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写Operation方法,实际执行的是component的Operation()
     */
    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
