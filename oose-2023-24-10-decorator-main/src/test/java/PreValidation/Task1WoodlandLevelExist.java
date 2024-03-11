package PreValidation;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class Task1WoodlandLevelExist{
  final String file_name = "src/main/java/WoodlandLevel.java";
  File file = new File(file_name);
  JavaFile javaFile = new JavaFile(file);

  @Test
  void fileExists() {
    assertTrue(file.isFile());
  }

  @Test
  void WoodlandLevelReturnsWoodlandlevel(){
    assertEquals("WoodlandLevel", javaFile.getMethodByName("WoodlandLevel").getReturnType());
  }

}