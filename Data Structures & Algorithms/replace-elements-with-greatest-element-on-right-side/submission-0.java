class Solution {
    public int[] replaceElements(int[] arr) {
        int maxFromRight = -1;

        for(int i=arr.length-1; i>=0; i--){
            int newMax = Math.max(maxFromRight, arr[i]);
            arr[i] = maxFromRight;
            maxFromRight = newMax;
        }

        // for(int i=0; i<arr.length; i++){
        //     int max = -1;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(max < arr[j]){
        //             max = arr[j];
        //         }
        //     }
        //     arr[i]=max;
        // }
        return arr;
    }
}