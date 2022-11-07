public class Datum {

    public static double average(Person[]objects){
        double sum = 0;
        for(Person obj:objects){
            sum = sum + obj.getMeasure();
        }
        return sum/objects.length;
    }
    public static Person getMax(Person[]objects){
        if(objects.length<0)
        {
            return null;
        }
        Person max = objects[0];
        for(int i=0;i<objects.length;i++){
            if(objects[i].getMeasure()>max.getMeasure()){
                max = objects[i];
            }
        }
        return max;
    }
}