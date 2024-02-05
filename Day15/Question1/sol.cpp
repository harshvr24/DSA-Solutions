#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void wiggleSort(vector<int>& nums) {
    sort(nums.begin(), nums.end());

    for (int i = 1; i < nums.size() - 1; i += 2) {
        swap(nums[i], nums[i + 1]);
    }
}

int main() {
    vector<int> nums = {3, 5, 2, 1, 6, 4};
    
    wiggleSort(nums);

    for (int num : nums) {
        cout << num << " ";
    }

    return 0;
}
