import com.langhus.calculator.*;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.*;

//import static org.junit.Assert.assertEquals;

//import org.junit.Assert;

//@SpringBootTest
class CalculatorTests {

      private Calculator calculator  = new Calculator();
//	@Test
	//void contextLoads() {
	//}
    
    @Test
    public void testSum() {

          assertEquals(5, calculator.sum(2,3));
    }

}
