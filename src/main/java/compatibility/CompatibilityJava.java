package compatibility;

public class CompatibilityJava {

    public void sayHello() {
        CompatibilityKt compatibilityKt = new CompatibilityKt();
        System.out.println(String.format("收到对面Kt的一条消息：%s", compatibilityKt.greetings()));
    }

    public String greetings() {
        return "你好吗？";
    }

    public static void main(String[] args) {
        new CompatibilityJava().sayHello();
    }
}
