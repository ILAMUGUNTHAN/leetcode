class Solution {
    public int[] sortArray(int[] nums) {
        
        sort(0,nums.length,nums);
        return nums;
    }

    void sort(int s, int e, int arr[]){
        if(s>e || s==e-1){
            return;
        }
        int m=s+(e-s)/2;
        sort(s,m,arr);
        sort(m,e,arr);
        merge(s,m,e,arr);
        return;
    }

    void merge(int s, int m, int e, int arr[]){
        int i=s,j=m,k=0;
        int arr1[]=new int[e-s];
        while(i<m && j<e){ 
            if(arr[i]<arr[j]){
                arr1[k]=arr[i];
                k++;
                i++;
            }
            else{
                arr1[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<m){
            arr1[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            arr1[k]=arr[j];
            j++;
            k++;
        }
        for(i=0;i<e-s;i++){
            arr[s+i]=arr1[i];
        }
        return;
    }
}