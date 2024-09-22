package munene.tech.springboot_learning;


public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from my First Class ==> MyVar = " + myVar;
    }
}
