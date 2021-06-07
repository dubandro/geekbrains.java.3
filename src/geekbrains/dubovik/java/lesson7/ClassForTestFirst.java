package geekbrains.dubovik.java.lesson7;

public class ClassForTestFirst {
    @BeforeSuite
    void beforeTest(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    void afterTest(){
        System.out.println("AfterSuite");
    }

    @Test
    void priorityDefaultFirst(){
        System.out.println("priorityDefault First");
    }

    @Test
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
