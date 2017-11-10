
package Lesson3;

import Infrastructure.webdrivermanager.WebDriverManager;

public class Lecture3 {
    public static void main(String[] args) {

        WebDriverManager wdm = new WebDriverManager();

        System.out.println(wdm.getAvailableWebDriver());

    }
}