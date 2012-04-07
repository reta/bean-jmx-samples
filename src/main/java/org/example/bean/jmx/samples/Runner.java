package org.example.bean.jmx.samples;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Runner 
{
    public static void main( String[] args ) throws IOException {
        final ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        System.in.read();
    }
}
