package com.example.demo.Memento;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class Originator {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    // 创建备忘录
    public Menento createMenento(){
        return new Menento(state);
    }

    // 恢复备忘录
    public void setMenento(Menento menento){
        state=menento.getState();
    }

    // 显示状态
    public void show(){
        System.out.println("当前状态："+state);
    }
}
