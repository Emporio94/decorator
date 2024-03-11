package PreValidation;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class Task4MountainLevelExist{
  final String file_name = "src/main/java/MountainLevel.java";
  File file = new File(file_name);
  JavaFile javaFile = new JavaFile(file);

  @Test
  void fileExists() {
    assertTrue(file.isFile());
  }

  @Test
  void calculateChallengeReturnsInt(){
    assertEquals("int", javaFile.getMethodByName("calculateChallenge").getReturnType());
  }

}