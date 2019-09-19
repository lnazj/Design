package com.example.demo.Adaptor;

import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */
public class abstractTargetTest {
    @Test
    public void request() throws Exception {
        AbstractTarget target=new Adaptor();
        target.request();
    }
}