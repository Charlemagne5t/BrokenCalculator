import java.rmi.MarshalException;

public class Solution {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while (target != startValue){
            if(target % 2 != 1  && target > startValue){
                target = target / 2;
            }else target++;
            count++;
        }

        return count;
    }
}
