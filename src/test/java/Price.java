import java.util.Objects;

public class Price {
    private String str;

    private int convertPrice(String str) {
        if (!(Objects.equals(str, ""))) {
            String s = str.contains("TL") ? str.substring(0, str.indexOf("TL")).trim() : "";
            String n;
            if (s.contains(".")) {
                int i = s.indexOf(".");
                int j = s.indexOf(",");
                n = s.substring(0, i) + s.substring(i + 1, j);
            } else {
                int j = s.indexOf(",");
                n = s.substring(0, j);
            }
            return Integer.parseInt(n);
        }
        return 0;
    }

    public int getPrice(String str){
        return convertPrice(str);
    }

}
