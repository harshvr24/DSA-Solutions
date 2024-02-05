class Solution {
public:
    int minDominoRotations(vector<int>& tops, vector<int>& bottoms) {
        int flips = 0;

        const int num = tops.size();

        int top = tops[0];
        int bottom = bottoms[0];

        int symmetricals = (top == bottom) ? 1 : 0;

        for (int i = 1; i < num; i++) {
            int currTop = tops[i];
            int currBottom = bottoms[i];

            if (currTop == currBottom) {
                symmetricals++;
            }
            if (currTop == top || currBottom == bottom) {
                if (currTop != top) {
                    top = -1;
                }
                else if (currBottom != bottom) {
                    bottom = -1;
                }
            }
            else if (currTop == bottom && currBottom == top) {
                flips++;
            } else if (currBottom == top) {
                flips++;
                bottom = -1;
            } else if (currTop == bottom) {
                flips++;
                top = -1;
            }
            else {
                return -1;
            }
        }
        if (top == -1 && bottom == -1) {
            return -1;
        }
        if (flips * 2 > num - symmetricals) {
            flips = (num - flips) - symmetricals;
        }
        return flips;
    }
};
