class Solution {
  private int[] bestRange;
  public int[] smallestRange(List<List<Integer>> nums) {
    List<Integer> firstList = nums.get(0);
    for (int elem : firstList) {
      int[] range = new int[2];
      range[0] = elem;
      range[1] = elem;
      expandRange(nums, 1, range);
    }
    return bestRange;  
  }
  private void expandRange(List<List<Integer>> nums, int listIndex, int[] currentRange) {
    if (listIndex >= nums.size()) {
      checkBest(currentRange);
      return;
    }
    if (shouldPrune(currentRange)) {
      return;
    }
    List<Integer> newList = nums.get(listIndex);

    int leftIndex = findIndex(newList, currentRange[0], 0, newList.size() - 1);
    int rightIndex = findIndex(newList, currentRange[1], 0, newList.size() - 1);

    boolean needsExpanding = leftIndex == rightIndex && 
      (leftIndex == newList.size() || 
        (newList.get(leftIndex) != currentRange[0] && newList.get(rightIndex) != currentRange[1]));

    if (needsExpanding) {
      int originalLeft = currentRange[0];
      int originalRight = currentRange[1];
      
      if (rightIndex < newList.size()) {
        currentRange[1] = newList.get(rightIndex);
        expandRange(nums, listIndex + 1, currentRange);
        currentRange[0] = originalLeft;
        currentRange[1] = originalRight;
      }
      if (leftIndex > 0) {
        currentRange[0] = newList.get(leftIndex - 1);
        expandRange(nums, listIndex + 1, currentRange);
      }
    } else {
      expandRange(nums, listIndex + 1, currentRange);
    }
  }
  private static int findIndex(List<Integer> list, int value, int left, int right) {
    if (left > right) {
      return left;
    }
    int mid = right - (right - left) / 2;
    int candidate = list.get(mid);

    if (candidate >= value) {
      if (mid == 0 || list.get(mid - 1) < value) {
        return mid;
      }
      return findIndex(list, value, left, mid - 1);
    } else {
      return findIndex(list, value, mid + 1, right);
    }
  }
  private void checkBest(int[] currentRange) {
    if (isBest(currentRange)) {
      if (bestRange == null) {
        bestRange = new int[2];
      }
      bestRange[0] = currentRange[0];
      bestRange[1] = currentRange[1];
    }
  }
  private boolean isBest(int[] currentRange) {
    if (bestRange == null) {
      return true;
    }
    int currentRangeSize = currentRange[1] - currentRange[0];
    int bestRangeSize = bestRange[1] - bestRange[0];
    return currentRangeSize < bestRangeSize || (currentRangeSize == bestRangeSize && currentRange[0] < bestRange[0]);
  }
  private boolean shouldPrune(int[] currentRange) {
    return !isBest(currentRange);
  }
}
