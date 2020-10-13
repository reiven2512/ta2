import java.util.*;

public class Main {
    public static final int START = 0;
    public static final int DIGITS = 1;
    public static void main(String[] args) {
        List<Character> digits = new ArrayList<>();
        for(char c = 'A'; c <= 'Z'; c++){
            digits.add(c);
        }
        Set<Integer> endStates = Collections.singleton(DIGITS);
        StateMachine sm = new StateMachine(START, endStates);
        sm.add(START, digits, DIGITS);
        sm.add(DIGITS, digits, DIGITS);
        String str = "ABBa 01.01.2017 XyZyZ 02.02.2017";
        sm.findAll(str);
    }
}