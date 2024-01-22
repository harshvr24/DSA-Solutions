#include <iostream>
#include <vector>
#include <algorithm>

std::vector<int> sortedSquares(std::vector<int>& nums) {
    std::vector<int> result(nums.size());

    for (int i = 0; i < nums.size(); ++i) {
        result[i] = nums[i] * nums[i];
    }

    std::sort(result.begin(), result.end());

    return result;
}

int main() {
    std::vector<int> nums = {-4, -1, 0, 3, 10};
    std::vector<int> result = sortedSquares(nums);

    for (int num : result) {
        std::cout << num << " ";
    }

    return 0;
}
