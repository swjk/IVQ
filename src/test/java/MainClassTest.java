import sc.MainClass;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainClassTest{
  @Test
  public void mainTest(){
    int test = MainClass.count;
    MainClass newone = new MainClass();

    assertEquals(0, test, "Must be equal");
  }
}
