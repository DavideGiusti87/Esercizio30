import java.util.ArrayList;
import java.util.Arrays;

/*
String Handling 03
Exercise: String handling 3

define array1 that contains the following strings:
" I want "
" to learn "
" how to code! "
remove all the whitespaces at the beginning and at the end of each string, assigning the new values to array2
print the boolean result of !(statement1 > statement2), where
statement1 corresponds to the lexicographical comparison between the first item of array2 and I want
statement2 corresponds to the comparison ignoring the case of the second item of array2 and To learn
 */
public class Main {
    public static void main(String[] args) {
        String[] array1 = {
                " I want ",
                " to learn ",
                " how to code! "
        };

        ArrayList <String> array2= new ArrayList<>();
        for ( int i=0; i< array1.length; i++){
            array2.add(array1[i].trim());
        }
        System.out.println(
                !(
                        (
                                array2.get(0)
                                        .compareTo("I want")
                        ) > (
                                array2.get(1)
                                        .compareToIgnoreCase("to learn")
                        )
                )
        );

    }
}
