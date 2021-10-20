public class Main {

    public static void main(String[] args) {
        String str = "caca";
        int i = str.compareTo("dae");
        int j = "a".compareTo("zu");


        System.out.println(i + "\n" + j);
        System.out.println("thibaud".compareToIgnoreCase("thibaul"));
    }
}