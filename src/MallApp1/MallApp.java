package MallApp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MallApp {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Category[] categories = CategoryCreator.createCategories();
        Category cat;


        System.out.println("How many Item ? ");
        int no = Integer.parseInt(bufferedReader.readLine());

        Item[] items = new Item[no];

        String name,category;
        int quntity;
        double price;

        for (int i = 0; i < no; i++) {

            System.out.print("Enter item name :");
            name=bufferedReader.readLine();

            System.out.print("Enter item category :");
            category =bufferedReader.readLine();

            System.out.print("Enter item price :");
            price=Double.parseDouble(bufferedReader.readLine());

            System.out.print("Enter item quntity :");
            quntity=Integer.parseInt(bufferedReader.readLine());

            cat=CategoryCreator.getCategory(category);

            items[i] = new Item(name, price, quntity, cat);


        }
        ReceiptPrinter.printReceipt(items);
    }


}

