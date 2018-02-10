package Others;

public class AddTwo {

    public boolean twoAsOne(int a,int b,int c){

        if (a+b==c||b+c==a||a+c==b){
            return true;
        }
        else
            return false;
    }

}
