public class Persontester {
    public static void main(String[] args) {
        Person person[] =  new quiz[3];
        person[0] = new quiz("Sefuda",70);
        person[1] = new quiz("Rajib",66);
        person[2] = new quiz("Mojiba",54);

        double average = Datum.average(person);
        quiz max = (quiz) Datum.getMax(person);
        System.out.println("The average height (in inch) :"+average);
        System.out.println("The name of the tallest Person:"+max.getName());

