package com.better517na.rewardCheckComputeService.util;

import java.util.List;

/**
 * 分页工具类.
 * 
 * @author manshu
 *
 */
public class PageUtil {

    /**
     * 获取parentList第pageIndex页内容.
     * 
     * @param parentList 父List.
     * @param pageSize 分页大小.
     * @param pageIndex 页索引:从0开始.
     * @return 第pageIndex页内容.
     */
    public static List<? extends Object> getSubList(List<? extends Object> parentList, int pageSize, int pageIndex) {
        if (parentList == null || pageSize <= 0 || pageIndex > parentList.size() / pageSize) {
            throw new IllegalArgumentException("分页所必需的参数有误!");
        }

        // 最大索引
        int maxIndex = parentList.size() - 1;
        // 起始索引
        int formIndex = pageSize * pageIndex;
        // 参考截止索引
        int referenceToIndex = pageSize * (pageIndex + 1) - 1;
        // 截止索引
        int toIndex = maxIndex > referenceToIndex ? referenceToIndex : maxIndex;

        return parentList.subList(formIndex, toIndex + 1);
    }

    // public static void main(String[] args) {
    // List<Integer> list = new ArrayList<Integer>();
    // for (int i = 1; i <= 11; i++) {
    // list.add(i);
    // }
    //
    // System.out.println(getSubList(list, 13, 0));
    // }

}
