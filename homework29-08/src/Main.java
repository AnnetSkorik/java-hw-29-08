import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        combineName();
        }
        public static void combineName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово, состоящее из четного количества букв: ");
            String first = scanner.nextLine();

            int lettersCount = 0;
            for (int i =0; i<first.length(); i++){
                if(Character.isAlphabetic(first.charAt(i))){
                    lettersCount++;
                }
            }
            System.out.println(lettersCount);

            System.out.println("Введите слово, состоящее из четного количества букв: ");
            String second = scanner.nextLine();

            int lettersCount1 = 0;
            for (int i =0; i<second.length(); i++){
                if(Character.isAlphabetic(second.charAt(i))){
                    lettersCount++;
                }
            }
            System.out.println(lettersCount);

            String firstHalf = first.substring(0,first.length()/2);
            String secondHalf = second.substring(second.length()/2);

            System.out.println(firstHalf + secondHalf);
        }

    }

// №1
// Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
// (проверьте количество букв в слове).
// Нужно получить слово, состоящее из первой половины первого слова
// и второй половины второго слова. распечатать на консоль.
//  Например: ввод - mama, papa
//            вывод - mapa
//
// №2
//  Реализовать программу, выводящую на экран результаты:
//  Сложения двух чисел
//  Вычитания двух чисел
//  Умножения двух чисел
//  Деления двух чисел
//  Каждая из арифметических операций должна быть реализована как отдельный метод.

