package HumanWorkApp;


public class HumanWork {

   protected String name;
   public String work;

    public HumanWork(String name, String work) {
        this.name = name;
        this.work = work;
    }

    public HumanWork() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }



}
