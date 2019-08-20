package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.returnOne(2,3);
        System.out.println(args[0]);
        System.out.println( "Hello World!" );
    }
    public int returnOne(int a, int b){
        if (a<b){
            return a;
        }
        else {
            return b;
        }
    }
}
