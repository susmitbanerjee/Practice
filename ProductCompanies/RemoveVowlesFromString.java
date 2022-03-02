package ProductCompanies;

public class RemoveVowlesFromString {
    public static void main(String[] args) {
        String str = new String("Susmit");
        System.out.println(str.replaceAll("[aeiouAEIOU]",""));
    }
}
