import java.io.IOException;

public class DemoThrows {
//    private static class ThrowsExample {
//        void method() throws IOException {
//            throw new IOException("Lỗi thiết bị");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            ThrowsExample obj = new ThrowsExample();
//            obj.method();
//
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//
//        }
//        System.out.println("dòng chảy bình thường");
//    }
public static void main(String[] args) {
    DemoThrows.recursivePrint(1);
}

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
