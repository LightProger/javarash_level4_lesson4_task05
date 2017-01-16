package Alexandr_Nikitchenko;

import java.io.BufferedReader;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        if (a > 0) {
            System.out.println(a * 2);
        } else {
            System.out.println(a + 1);
        }

    }

}
