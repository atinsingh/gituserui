package profile_demo.springprofiles;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringProfilesApplicationTests {

    @Test
    void contextLoads() {
    }
    
    @Test
    void dummyTest(){
        System.out.println("This dummy test in release1912");
    }
    @Test
    void dummyTest2(){
        System.out.println("This dummy test in release1912");
    }

    @Test
    void dummyTest4(){
        System.out.println("This dummy test in release1912");
    }

}
