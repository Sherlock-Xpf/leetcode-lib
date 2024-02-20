class Solution{
    public int maxArea(int[] height){
       /*  算法：双指针
            初始化： 双指针 i , j 分列水槽左右两端；
            循环收窄： 直至双指针相遇时跳出；
            更新面积最大值 res；
            选定两板高度中的短板，向中间收窄一格；
            返回值： 返回面积最大值 res 即可
        */
        //核心公式
            // S(i,j)=min(h[i],h[j])×(j−i)
            // res = max(res,S(i,j))
        int i = 0, j = height.length -1, res = 0;
        while(i < j){
            res = height[i] < height[j] ?
                    Math.max(res, (i - j) * height[i++]) :
                    Math.min(res, (j - i) * height[j--]);
        }
        return res;
    }
}

    public static void main(String[] args) {
        height = [1,8,6,2,5,4,8,3,7]
        System.out.println(solution.maxArea(height));
    }
