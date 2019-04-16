
public class TestConstructor {
    public static void test(String s)
    {
        System.out.println("In String");
    }
    public static void test(Object o) {
        System.out.println("In Object");
    }

    public static void main(String args[]) {
        test(null);
    }
}

/// test method can be called from inside class w/o any object as this is an static method which is bei
//called within an static method. 