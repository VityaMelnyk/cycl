package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
	String text = new String(Files.readAllBytes(Paths.get("F:/JS/Lesson/harry.txt")));

	String first200 = text.substring(0,20); //сабстринг отрезали и вывели 200 символов

        System.out.println(first200);
//освободили текст от мусора командой регекс
        String textTrashFree = text.replaceAll( "[^A-Za-z`\\-]","");

        System.out.println();
        first200 = textTrashFree.substring(0,200);
        System.out.println(first200);

        String [] wordsArray = textTrashFree.split(" ");
        System.out.println(wordsArray.length);

        for (int i = 0; i <wordsArray.length; i++) {

            //все слова длина которых больше 3 или ровны согласно условии

            if ((wordsArray[i].length() >= 3) && (wordsArray[i].charAt(0) == 'a' )){
                                                    //первая буква charAt слова "a"
                                                    // есть первая "нулевая"!!!ЗАПОМНИТЕ!!
                                                    // charAt берется в одиночных скобах



                System.out.print(i + ". "); //выводит номер слова
                System.out.println(wordsArray[i]);// ето выводит слово на каком номере
            }
        }
      }
    }

