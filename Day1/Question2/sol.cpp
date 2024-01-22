#include <iostream>
#include <vector>

void rotate(std::vector<int>& nums, int k) {
    int n = nums.size();
    k = k % n;  // To handle cases where k is greater than the array size

    std::reverse(nums.begin(), nums.end());
    std::reverse(nums.begin(), nums.begin() + k);
    std::reverse(nums.begin() + k, nums.end());
}

int main() {
    std::vector<int> nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    rotate(nums, k);

    for (int num : nums) {
        std::cout << num << " ";
    }

    return 0;
}
