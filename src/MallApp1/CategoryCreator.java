package MallApp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CategoryCreator {
    private static Category[] categories;

    
    public static Category[] createCategories() throws IOException {

         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("How many categories ? ");
        int noCatagories=Integer.parseInt(bufferedReader.readLine());
        categories = new Category[noCatagories+1];

        String catName;
        double gstRate;

        for (int i = 0; i <noCatagories ; i++) {

            System.out.println("Enter categity name :");
            catName=bufferedReader.readLine();

            System.out.println("Enter gst rate :");
            gstRate=Double.parseDouble(bufferedReader.readLine());

            categories[i]=new Category(catName,gstRate);

        }
        categories[noCatagories]=new Category("other",6);
        
        return categories;
    }


    public static Category getCategory(String category) {

        for (int i = 0; i <categories.length ; i++) {

            if (category.equalsIgnoreCase(categories[i].getName())) {

                return categories[i];
            }

        }
        return (categories[0]);
    }
}
