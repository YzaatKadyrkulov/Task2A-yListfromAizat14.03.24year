import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> dog = new ArrayList<>();
        dog.add("Simba");
        dog.add("Simba");

        System.out.println(dog);

        Set<String> setWithoutDuplicates = new HashSet<>(dog);
        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println("List without duplicates: " + listWithoutDuplicates);


    }
}