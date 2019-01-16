package com.mousycoder.mycode.jvm;

/**
 * switch 语句中使用string
 *
 * @Author: mousycoder
 * @Date: 2019-01-07 10:48
 * @Version 1.0
 */
public class Switch {

    public static void main(String[] args) {
        Switch tool = new Switch();
        System.out.println(tool.getBankIdByName("CCB"));
    }

    public String getBankIdByName(String bankName) {
        String bankId = "";
        switch (bankName) {
            case "ICBC":
                bankId = "B00001";
                break;
            case "ABC":
                bankId = "B00002";
                break;
            case "CCB":
                bankId = "B00003";
                break;
            case "BOC":
                bankId = "B00004";
                break;
            default:
                bankId = "UNVALID";
        }
        return bankId;
    }

}
