package comcom.codewithdurgesg.blog.blogappapis;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAppApisApplicationTests {
   private  Calculators c = new Calculators();
   
	@Test
	void contextLoads() {
	}
	 @Test
	void testSum()
	{
		  int expectedResult=17;
		 // int actualResult = c.doSum(a:12,b:3,c:2);
		int actualResult = c.doSum(a:12,b:3,c:2);
		 assertThat(actualResult).isEqualTo(expectedResult);
		
	}

}
