package leetorg4g;

public class SumArrayBeforePivotEqSumAfterPivot {

    public static int partitionArray(int ar[]){ // O(n) Space O(n) time ew!
        if(ar==null || ar.length==0) return -1;

        int n = ar.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = ar[0];
        suf[n-1] = ar[n-1];

        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+ar[i];
        }

        for(int j= n-2; j>0;j--){
            suf[j] = suf[j+1]+ar[j];
        }

        for(int i=0;i<n;i++){
            if(suf[i]==pre[i]) return i;
        }
        return -1;
    }

    public static int pivotIndex(int[] nums) { //O(1) space O(n) time
        int sum = 0;
        int curSum = 0;
        for(int num:nums){
            sum += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(sum - nums[i] == 2 * curSum) return i;
            curSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[]={3,1,2,4,8,7,3};
        System.out.println(ar[partitionArray(ar)]);
        System.out.println(ar[pivotIndex(ar)]);
    }
}
