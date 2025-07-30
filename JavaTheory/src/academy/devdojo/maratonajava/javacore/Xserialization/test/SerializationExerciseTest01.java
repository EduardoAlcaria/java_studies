package JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.test;


import JavaTheory.src.academy.devdojo.maratonajava.javacore.Xserialization.domain.PlayerData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializationExerciseTest01 {
    public static final String pathToFile = "C:\\Users\\EduardoAlcaria\\IdeaProjects\\java_studies\\JavaTheory\\src\\academy\\devdojo\\maratonajava\\javacore\\Xserialization\\output\\playerdata.dat";
    public static void main(String[] args) {
        List<String> achievements = new ArrayList<>();
        achievements.add("kill 100 curses");
        PlayerData playerData = new PlayerData("Satoru", 1000, achievements);
        //serialize(playerData);
        deserialize(playerData);
    }

    private static void serialize(PlayerData player){

        Path path = Paths.get(pathToFile);
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(player);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void deserialize(PlayerData player){
        Path path = Paths.get(pathToFile);
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            PlayerData playerData = (PlayerData) ois.readObject();
            System.out.println(playerData);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }

}
