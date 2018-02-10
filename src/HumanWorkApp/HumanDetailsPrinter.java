package HumanWorkApp;

/**
 * Created by mayue on 07-Feb-18.
 */
public class HumanDetailsPrinter {

    public static void getHumanDetails(HumanWork[] obj) {

        System.out.println("\n****person details****");
        System.out.println("\nName\tWork\n");

        for (HumanWork  humanWork :obj) {

            System.out.print(humanWork.getName()+"\t"+humanWork.getWork());

        }
    }
}
