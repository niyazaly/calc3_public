import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class Converter {

    private static final TreeMap<Integer, String> ARABIC = new TreeMap<>();
    static {
        ARABIC.put(100, "C");
        ARABIC.put(90, "XC");
        ARABIC.put(50, "L");
        ARABIC.put(40, "XL");
        ARABIC.put(10, "X");
        ARABIC.put(9, "IX");
        ARABIC.put(5, "V");
        ARABIC.put(4, "IV");
        ARABIC.put(1, "I");
    }

    private static final Map<String, Integer> ROMAN = new HashMap<>();
    static {
        ROMAN.put("I",1);
        ROMAN.put("II",2);
        ROMAN.put("III",3);
        ROMAN.put("IV",4);
        ROMAN.put("V",5);
        ROMAN.put("VI",6);
        ROMAN.put("VII",7);
        ROMAN.put("VIII",8);
        ROMAN.put("IX",9);
        ROMAN.put("X",10);
    }

    public String toRoman(int number) {
        int n = ARABIC.floorKey(number);
        return number == n ? ARABIC.get(number) : ARABIC.get(n) + toRoman(number - n);
    }

    public int toArabic(String number) {
        return ROMAN.get(number);
    }

}