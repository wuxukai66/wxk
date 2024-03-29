public class Text {
    /**
     * 给你两个版本号 version1 和 version2 ，请你比较它们。
     *
     * 版本号由一个或多个修订号组成，各修订号由一个 '.' 连接。每个修订号由 多位数字 组成，可能包含 前导零 。每个版本号至少包含一个字符。修订号从左到右编号，下标从 0 开始，最左边的修订号下标为 0 ，下一个修订号下标为 1 ，以此类推。例如，2.5.33 和 0.1 都是有效的版本号。
     *
     * 比较版本号时，请按从左到右的顺序依次比较它们的修订号。比较修订号时，只需比较 忽略任何前导零后的整数值 。也就是说，修订号 1 和修订号 001 相等 。如果版本号没有指定某个下标处的修订号，则该修订号视为 0 。例如，版本 1.0 小于版本 1.1 ，因为它们下标为 0 的修订号相同，而下标为 1 的修订号分别为 0 和 1 ，0 < 1 。
     *
     * 返回规则如下：
     *
     * 如果 version1 > version2 返回 1，
     * 如果 version1 < version2 返回 -1，
     * 除此之外返回 0。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/compare-version-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[]arr1=version1.split("\\.");
            String[]arr2=version2.split("\\.");
            int len=Math.max(arr1.length,arr2.length);
            int[] array1=new int[len];
            int[] array2=new int[len];
            for(int i=0;i<len;i++){
                if(i<arr1.length){
                    array1[i]=Integer.valueOf(arr1[i]);
                }
                if(i<arr2.length){
                    array2[i]=Integer.valueOf(arr2[i]);
                }
                if(array1[i]>array2[i]){
                    return 1;
                }
                if(array1[i]<array2[i]){
                    return -1;
                }
            }
            return 0;
        }
    }


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

