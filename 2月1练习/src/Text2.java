public class Text2 {
    /**
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     *
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sort-colors
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     */
    //class Solution {
    public void sortColors(int[] nums) {
        int r1=-1;
        int r2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<2){
                r2++;
                swap(nums,i,r2);
                if(nums[r2]<1){
                    r1++;
                    swap(nums,r1,r2);
                }
            }
        }

    }
    public   void swap(int[]nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}

