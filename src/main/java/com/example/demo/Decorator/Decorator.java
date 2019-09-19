package com.example.demo.Decorator;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public abstract class Decorator extends Component {
    private Component component;
    public void setComponent(Component component){
        this.component=component;
    }

    @Override
    public void operation(){
        if(component!=null){
            component.operation();
        }
    }
}
