package com.mousycoder.mycode.jvm;

import javax.smartcardio.CardTerminal;

/**
 * 数值字面量增量
 *
 * @Author: mousycoder
 * @Date: 2019-01-07 10:58
 * @Version 1.0
 */
public class Literals {
    public static void main(String[] args) {
        Literals literals = new Literals();
        System.out.println(literals.getBinaryInt("100"));
        System.out.println(literals.getBinaryIntLiterals());
    }


    public int getBinaryInt(String number){
        int a = -1;
        try {
            a = Integer.parseInt(number,2);
        } catch (NumberFormatException e){

        }
        return a;
    }

    public int getBinaryIntLiterals(){
        int a = 0b0100;
        return a;
    }
}
