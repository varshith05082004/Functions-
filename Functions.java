public class Functions {
    static int a=10;
    public static void main(String[] args) {
        Greet ab=new Greet();
        Greet.Hi ac=ab.new Hi();
        System.out.println("Hello World! "+a);
        System.out.printf("Hai, Hello %d", ac.Msg(a));
    }
}
class Greet{
    static int b=20;
    public class Hi{
        public int Msg(int a){
            System.out.println("Hi! World "+a+" "+b);
            return b;
        }
    }
}
