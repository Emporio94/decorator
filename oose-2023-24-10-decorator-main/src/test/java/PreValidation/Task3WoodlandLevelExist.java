package PreValidation;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class Task3WoodlandLevelExist{
  final String file_name = "src/main/java/WoodlandLevel.java";
  File file = new File(file_name);
  JavaFile javaFile = new JavaFile(file);

  @Test
  void fileExists() {
    assertTrue(file.isFile());
  }

  @Test
  void generateLevelReturnsString(){
    assertEquals("String", javaFile.getMethodByName("generateLevel").getReturnType());
  }

}