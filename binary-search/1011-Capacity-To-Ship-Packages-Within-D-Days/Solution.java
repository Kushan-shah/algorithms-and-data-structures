class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low=0, high=0;

        for(int i=0 ; i < weights.length ; i++){
            low = Math.max(low , weights[i]); // at least max weight
            high += weights[i]; // sum of all
        }

        int ans = high;

        while(low <= high){

            int mid = low +(high - low) / 2;

            if( canShip(weights , days , mid) ){

                ans = mid;
                high = mid - 1;

            }else{
                low = mid + 1;
            }
        }

        return ans;
    }


    private boolean canShip(int[] weights , int days , int capacity){

        int d = 1;
        int load = 0;

        for(int i = 0 ; i < weights.length ; i++){

            if(load + weights[i] > capacity){
                d++;
                load = weights[i];
            }else{
                load += weights[i];
            }

            if(d > days) return false;
        }

        return true;
    }
}
