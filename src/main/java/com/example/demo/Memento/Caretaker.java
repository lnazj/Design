package com.example.demo.Memento;

/**
 * 备忘录
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class Caretaker {
    public Menento getMenento() {
        return menento;
    }

    public void setMenento(Menento menento) {
        this.menento = menento;
    }

    private Menento menento;

}
