package com.example.demo.Exception;

import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.*;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-08
 */
public class AbstractExceptionTest {
    @Test
    public void testException(){
        Context c=new Context();
        List<AbstractException> list=new ArrayList<>();
        list.add(new TerminalException());
        list.add(new NonTerminalException());
        list.add(new TerminalException());
        list.add(new TerminalException());

        for (AbstractException e: list) {
            e.Interpret(c);
        }
    }
}