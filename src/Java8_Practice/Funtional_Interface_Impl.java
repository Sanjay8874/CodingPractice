package Java8_Practice;

public class Funtional_Interface_Impl implements Java8_Funtional_Interface {

    @Override
    public boolean checkStringPallindrom(String str) {
        /*
         * String reversed = Stream.of(str) // Convert to char stream
         * .flatMapToInt(String::chars) // Reverse the order .mapToObj(c -> (char) c)
         * .collect(Collectors.toCollection(StringBuilder::new));
         */

        return false;
    }

}
