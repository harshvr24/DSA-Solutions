class Solution {
public:
    int nextGreaterElement(int n) {
        auto digits = to_string(n);
        nextPermutation(begin(digits), end(digits));
        auto result = stoll(digits);
        return (result > numeric_limits<int>::max() || result <= n) ? -1 : result;
    }
private:
    template<typename BidiIt>
    bool nextPermutation(BidiIt begin, BidiIt end) {
        const auto rbegin = reverse_iterator<BidiIt>(end);
        const auto rend = reverse_iterator<BidiIt>(begin);
        
        auto pivot = next(rbegin);
        while (pivot != rend && *pivot >= *prev(pivot)) {
            ++pivot;
        }
        bool is_greater = true;
        if (pivot != rend) {
            auto change = find_if(rbegin, pivot, bind1st(less<int>(), *pivot));
            swap(*change, *pivot);
        } else {
            is_greater = false;
        }
        reverse(rbegin, pivot);
        return is_greater;
    }
}
