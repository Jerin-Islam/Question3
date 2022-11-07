public class quiz implements Person{
    private String name;
    private double height;

    public quiz(String aname, double aheight) {
        name = aname;
        height = aheight;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}
