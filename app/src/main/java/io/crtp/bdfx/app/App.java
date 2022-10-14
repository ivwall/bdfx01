/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.crtp.bdfx.app;

import io.crtp.bdfx.list.LinkedList;

import static io.crtp.bdfx.utilities.StringUtils.join;
import static io.crtp.bdfx.utilities.StringUtils.split;
import static io.crtp.bdfx.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
