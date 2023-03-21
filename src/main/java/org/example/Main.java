package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            Order order = new Order();
            try (FileWriter writer = new FileWriter("Orders.txt", true)) {
                logger.info("Вводим данные о наименовании товара");
                System.out.println("Введите наименование товара:");
                order.setName(in.nextLine());

                logger.info("Вводим данные о количестве товара");
                System.out.println("Введите количество товара:");
                order.setQuantity(Integer.parseInt(in.nextLine()));

                logger.info("Вводим данные об общей стоимости товара");
                System.out.println("Введите общую стоимость товара:");
                order.setTotalPrice(Double.parseDouble(in.nextLine()));

                writer.write(order.toString() + "\n");

                logger.info("Записываем данные в файл Orders.txt");

                System.out.println("Хотите добавить еще один заказ? (y/n)");
                String answer = in.nextLine();

                if (answer.equals("n")) {
                    isRunning = false;
                }

            } catch (IOException ex) {
                logger.warn("Ошибка во время создания заказа: " + ex);
            } catch (NumberFormatException ex) {
                logger.warn("Ошибка при вводе числовых данных: " + ex);
            }
        }
    }
}