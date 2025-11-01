public class sortedandrotatedarraysearch {

    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // target found
        if (arr[mid] == target) {
            return mid;
        }

        //mid on line one 
        if(arr[si]<=arr[mid]){ 
            //case a : left 
            if(arr[si]<=target&&target<=arr[mid]){ 
                return search(arr, target, si, mid-1); 
            } else{ 
                //case b :right 
                return search(arr, target, mid+1, ei); 
            }
         } 
         //mid on line two else
        else{ 
            if(arr[mid]<=target&&target<=arr[ei]){ 
                //case c : rigth 
                return search(arr, target, mid+1,ei); 
            } 
            else{ 
                 //case d :left 
                 return search(arr, target, si, mid-1); 
            }
        }
    }
     

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; // sorted & rotated array
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("Target found at index: " + targetIdx);
    }
}
