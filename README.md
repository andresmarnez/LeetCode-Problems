# LeetCode Problems and Tests

## Problem 1: Matrix


> @param { number [ ] [ ] } **matrix**
> @return { void } Do not return anything, modify matrix in-place instead.


Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

**Example 1:**
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
||||
-|-|-
1|1|1
1|0|1
1|1|1
||

Output: [[1,0,1],[0,0,0],[1,0,1]]
||||
-|-|-
1|0|1
0|0|0
1|0|1
||

**Example 2:**
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
|||||
-|-|-|-
0|1|2|0
3|4|5|2
1|3|1|5
||

Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
|||||
-|-|-|-
0|0|0|0
0|4|5|0
0|3|1|0
||
