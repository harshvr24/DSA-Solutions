class Solution {
public:
    string reverseVowels(string s) {
        unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && vowels.find(tolower(s[left])) == vowels.end()) {
                left++;
            }
            while (left < right && vowels.find(tolower(s[right])) == vowels.end()) {
                right--;
            }

            swap(s[left], s[right]);
            left++;
            right--;
        }

        return s;
    }
};
