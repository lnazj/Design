package com.example.demo.Builder;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-09-06
 */

public class directorTest {
    @Test
    public void buildProject() throws Exception {
        abstractBuilder builder1=new concurrentBuilder1();
        director director1=new director(builder1);
        director1.buildProject();


        abstractBuilder builder2=new concurrentBuilder2();
        director director2=new director(builder2);
        director2.buildProject();
        }
    }