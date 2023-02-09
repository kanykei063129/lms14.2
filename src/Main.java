public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana("A,B,C,D-vitamin");
        Orange orange = new Orange("sweet,", "Верна,Салустиана,Гамлин,","orange,",20,banana);
        System.out.println(orange);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Apple apple = new Apple("sweet,"," Голден,Гала,Спартан,","red,",15,banana);
        System.out.println(apple);
    }
}