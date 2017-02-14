package NazarV.bank;

public class Runner {
    public static void main(String[] args) {
       /*Client cl1 = new Client();
        Client cl2 = new Client("Nazar", "Mykhailiv", "0971073443");

        cl1.information();
        System.out.println(" ");
        cl2.information();

        cl1.setPhone("0971073443");
        cl2.setPhone();

        System.out.println(" ");
        cl2.information();*/
        Human hm1 = new Human();
        Human hm2 = new Human();
        System.out.println(hm1.toString());

        hm2.setName("Igor");
        hm2.setSurname("Kupchak");
        System.out.println(hm2.toString());

        //hm1.setName();
        //hm1.setSurname();
        //System.out.println(hm1.toString());

        hm1.setName(hm2);
        System.out.println(hm1.toString());



    }
}
