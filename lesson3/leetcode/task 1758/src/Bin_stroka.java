//You are given a string s consisting only of the characters '0' and '1'. In one operation,
// you can change any '0' to '1' or vice versa.

//The string is called alternating if no two adjacent characters are equal.
// For example, the string "010" is alternating, while the string "0100" is not.

//Return the minimum number of operations needed to make s alternating.

// Example 1:

//Input: s = "0100"
//Output: 1
//Explanation: If you change the last character to '1', s will be "0101", which is alternating.

// Example 2:

//Input: s = "10"
//Output: 0
//Explanation: s is already alternating.

//Example 3:

//Input: s = "1111"
//Output: 2
//Explanation: You need two operations to reach "0101" or "1010".


//Constraints:

//1 <= s.length <= 104
//s[i] is either '0' or '1'.

public class Bin_stroka {
    public static void main(String[] args) {
        String str = "01101";
        int schetchik = 0; int schetchik1 = 0;
        char[] stroka = str.toCharArray();
        char[] stroka1 = str.toCharArray();

        if (stroka[0] == '1'){ //Рассматриваем сразу 2 случая: строка может выглядеть как 01010 (stroka) или 10101 (stroka1)
            stroka1[0] = '0';
            schetchik1++; //счетчик изменений в строке stroka1
        }
        else {stroka1[0] = '1'; schetchik1++;}

        for (int i = 0; i < str.length()-1; i++) { //проходимся по строке и сравниваем значения соседних элементов

            if (stroka[i] == stroka[i+1]){//если находим одинаковые значения рядом - заменяем второе на 1 или 0
                schetchik++;
                if (stroka[i+1] == '1')
                    stroka[i+1] = '0';
                else stroka[i+1] = '1';
            }
            //если повторяются соседние значения в строке stroka, то эти значения никогда не повторятся в строке stroka1 (и наоборот)
            //пример: когда мы дошли до 48 строки кода stroka имеет значение 01101, а stroka1 11101
            //на 48 строке происходит сравнение двух первых элементов строки stroka соответственно 0 и 1 они не равны друг другу
            //но если посмотреть на строку stroka1, то ее первые 2 значения 1 и 1 (равные между собой) следовательно нужно
            // поменять 2ую единицу на 0, что и происходит в строке 62
            else {
                schetchik1++;
                if (stroka[i+1] == '1')
                    stroka1[i+1] = '0';

                else
                    stroka1[i+1] = '1';
            }
        }
        if (schetchik1<schetchik) //выбираем наим.кол-во изменений в строке
            System.out.println("Кол-во изменений: "+schetchik1); //счетчик изменений в stroka1
        else System.out.println("Кол-во изменений: "+schetchik); //счетчик изменений в stroka
    }
}