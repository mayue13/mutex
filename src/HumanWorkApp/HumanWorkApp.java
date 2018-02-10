package HumanWorkApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanWorkApp {
    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many person details you want to insert :");
        int noPerson=Integer.parseInt(bufferedReader.readLine());
        HumanWork[] obj=new HumanWork[noPerson];

        int choice;

        for (int i = 0; i <noPerson; i++) {



            System.out.println("which person details want to insert :");
            System.out.println("1) Employee  2) Student  3) Teacher");
            System.out.print("Enter Your choice :");
            choice=Integer.parseInt(bufferedReader.readLine());

            switch (choice){

                case 1:
                       obj[i]=new Employee();

                       System.out.print("Enter name :");
                       obj[i].setName(bufferedReader.readLine());

                       System.out.println("Enter Work :");
                       obj[i].setWork(bufferedReader.readLine());
                       break;

                case 2:
                    obj[i]=new Student();

                    System.out.print("Enter name :");
                    obj[i].setName(bufferedReader.readLine());

                    System.out.println("Enter Work :");
                    obj[i].setWork(bufferedReader.readLine());
                    break;

                case 3:
                    obj[i]=new Teacher();

                    System.out.print("Enter name :");
                    obj[i].setName(bufferedReader.readLine());

                    System.out.println("Enter Work :");
                    obj[i].setWork(bufferedReader.readLine());
                    break;
            }
        }



        HumanDetailsPrinter.getHumanDetails(obj);

    }
}
