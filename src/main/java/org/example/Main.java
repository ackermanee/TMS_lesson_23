package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
1. Создать программу для сохранения заказа на покупку товара в файл.
Данные о заказе (наименование товара, количество, общая стоимость)
вводятся пользователем с клавиатуры.
Сделать логироване действий пользователя в файл.
Предусмотреть различные уровни логирования: общая информация,
предупреждающее сообщения, сообщения об ошибках.

2. Для предыдущего задания создать unit-тесты. Предусмотреть покрытие
кода тестами минимум на 50%.
 */
public class Main {

    private static final Logger log =Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            try(FileWriter writer = new FileWriter("Orders.txt"))
            {
                log.info("Вводим данные о наименовании товара");
                System.out.println("Введите наименование товара:");
                writer.write("Наименовани товара: "+in.nextLine()+"\n");

                log.info("Вводим данные о количестве товара");
                System.out.println("Введите количество товара:");
                writer.write("Количество товара: "+in.nextLine()+ "\n");

                log.info("Вводим данные об общей стоимости товара");
                System.out.println("Введите общую стоимость товара:");
                writer.write("Общая стоимость: "+in.nextLine()+"\n");

                log.info("Записываем данные в файл Orders.txt");

            }
            catch(IOException ex){
                log.warning("Ошибка во время создания заказа: " + ex);
            }
        }catch (Exception e){
            log.warning("что-то пошло не так"  + e);
        }
    }
}