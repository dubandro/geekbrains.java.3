package geekbrains.dubovik.java.lesson7;

public class ClassForTestSecond {
    @BeforeSuite
    void beforeTestFirst(){
        System.out.println("BeforeSuite First");
    }

    @BeforeSuite
    void beforeTestSecond(){
        System.out.println("BeforeSuite Second");
    }

    @Test
    void priorityDefaultFirst(){
        System.out.println("priorityDefault First");
    }

//    @Test
    void priorityDefaultSecond(){
        System.out.println("priorityDefault Second");
    }

    @Test (priority = 10)
    void priority10(){
        System.out.println("priority 10");
    }

    @Test (priority = 1)
    void priority1(){
        System.out.println("priority 1");
    }
}
