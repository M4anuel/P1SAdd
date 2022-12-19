import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheorieAufgaben {

    public static void main(String[] args) {
        try{
            CDPlayer cdPlayer = (CDPlayer) mPlayer;
        }catch(ClassCastException ignored){}

        try{
            Scanner fileScan = new Scanner(new File("xxx.txt"));
        }catch(FileNotFoundException ignored){}
    }

    public void increaseSemester(Student s) throws NotInitializedException{
        if (s==null){
            throw new NotInitializedException("Not yet initialized");
        }
    }
}
