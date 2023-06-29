public class SquareRoot {

    static int squareRoot(int x){

        int s=0;
        int e = x;
        int res=0;

        while(s<=e){
            int mid = (s+e)/2;

            if(mid*mid == x){
                return mid;
            }else if(mid*mid < x){
                res = mid;
                s = mid+1;
            }else {
                e = mid-1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int x = 50;
        int result = squareRoot(x);
        System.out.println(result);
    }
}
