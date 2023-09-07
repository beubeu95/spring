import kr.co.teaspoon.dto.Sample;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LombokTest {
    private static final Logger log = LoggerFactory.getLogger("LombokTest.class");

    @BeforeClass
    public static void testStart(){
        System.out.println("전체 테스트 시작");
        //log.info("전체 테스트 시작"); -> 실제론 connect
    }

    @AfterClass
    public static void textEnd(){
        System.out.println("전체 테스트 종료");
        //log.info("전체 테스트 종료"); -> 실제론 close
    }

    @Before
    public void testBeforePrint(){
        //log.info("Junit 테스트 시작");
        System.out.println("Junit 테스트 시작");
    }

    @Test
    public void testLombok(){
        Sample dto = new Sample();
        dto.setNo(1);
        dto.setName("김기태");
        System.out.println(dto.toString());
    }

    @Test
    public void testLombok2(){
        Sample dto = new Sample();
        dto.setNo(2);
        dto.setName("김");
        System.out.println(dto.toString());
    }

    @After
    public void testAfterPrint(){
        //log.info("Junit 테스트 종료");
        System.out.println("Junit 테스트 종료");
    }


}
