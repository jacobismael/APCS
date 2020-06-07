public class Runner {
    public static void main(String[] args) {
        Split sp = new Split("john.smith@mvla.net");

        String output1 = sp.getName();
        System.out.println(output1);

        String output2 = sp.getDomain();
        System.out.println(output2);

        String output3 = sp.printLastNameMVLA("jane.doe.@mvla.net");
        System.out.println(output3);

        System.out.println(sp);
    }
}