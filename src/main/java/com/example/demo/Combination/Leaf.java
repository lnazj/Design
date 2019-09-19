package com.example.demo.Combination;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("can't add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("can't remove");
    }

    @Override
    public void display(int depth) {
        System.out.println('-'+depth+name);
    }
}
