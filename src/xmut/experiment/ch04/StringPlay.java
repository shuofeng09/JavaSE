package xmut.experiment.ch04;

public class StringPlay {
    public static void main(String[] args) {
        String college = new String("PoDunk College");
        // part(a)
        String town = "Anytown, USA";
        int stringLength;
        String change1, change2, change3;
        // part(b)
        stringLength = college.length();
        System.out.println(college + " contain " + stringLength + " characters ");
        // part(c)
        change1 = college.toLowerCase();
        // part(d)
        change2 = change1.replace("O", "*");
        // part(e)
        change3 = college.concat(town);
        System.out.println("The final string is " + change3);
    }
}
