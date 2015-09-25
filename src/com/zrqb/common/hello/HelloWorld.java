/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zrqb.common.hello;

/**
 *
 * @author 蔚林
 */
public class HelloWorld {

    private String name;
    private String something;
    
    public HelloWorld(String name,String something){
        this.name = name;
        this.something = something;
    }
    
    public void saySomething(){
        System.out.println(name + "say" + something);
    }
    
}
