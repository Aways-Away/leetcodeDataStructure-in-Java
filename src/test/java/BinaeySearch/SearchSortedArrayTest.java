package BinaeySearch;

import BinarySearch.SearchSortedArray;

/**
 * Created by LiuCui on 2020/12/7
 */
public class SearchSortedArrayTest {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int res = new SearchSortedArray().search(nums, target);
        System.out.println("Output: "+res);

    }
}
