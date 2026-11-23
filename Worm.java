import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class Worm{
    public static void main(String[] args) {
        Path file = Path.of("C:\\WormTest\\testing.txt");

        try {
            for (int i=0 ; i<=5 ; i++){
            String fileName = file.getFileName().toString();
            String extension = "";
            int dotIndex = fileName.lastIndexOf('.');
            if(dotIndex > 0){
                extension = fileName.substring(dotIndex);
            }

            String randomName = UUID.randomUUID().toString()+extension;

            Path desfile = file.resolveSibling(randomName);
            Files.copy(file, desfile);

        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}