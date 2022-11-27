public class Main {
    public static void main(String[] args) {

        owoce apple = new apple();
        owoce pinnaple = new pinneaple();
        owoce strawberry = new strawberry();

        owoce [] tablica = {apple,pinnaple, strawberry};

                for (owoce owoce : tablica){
                    System.out.println(owoce.getName());
                }

    }
}