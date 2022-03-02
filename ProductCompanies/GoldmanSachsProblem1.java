package ProductCompanies;
//Given a range of numbers [l, r] and an integer q. The task is to count all such number in the given range such that any digit
// of the number does not match with any digit in its product with the given number q.

//Example 1:

        //Input: l = 10, r = 12, q = 2
        //Output: 1
        //Explanation:
        //10*2 = 20 which has 0 as same digit
        //12*2 = 24 which as 2 as same digit
        //11*2 = 22 no same digit


public class GoldmanSachsProblem1 {
    static int countNumber(int l,int r,int q){
        int ans = 0;

        for(int i=l;i<=r;i++){
            int product = Math.multiplyExact(i,q);
            String iArray = String.valueOf(i);
            char[] arr = String.valueOf(product).toCharArray();
            boolean match=false;
            for(Character ch: arr){
                if(iArray.indexOf(ch) != -1){
                    match=true;
                }
            }
            if(!match){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countNumber(10,15,2));

    }
}
