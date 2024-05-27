package core.lesson3;

public class TV {

    protected String name;
    private int countChanel;

    public void switchChanel(){
        System.out.println("канал переключен!");
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountChanel() {
        return countChanel;
    }

    public void setCountChanel(int countChanel) {
        this.countChanel = countChanel;
    }
}
