class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        if (weights.size() == 0)
			return 0;

		if (weights.size() < days)
			return 0;

		int minVal = weights[0], maxVal = 0;
		for (auto& elem : weights)
		{
			if (elem > minVal)
				minVal = elem;
			maxVal += elem;
		}
		int start = minVal, end = maxVal, mid;
		while (start < end)
		{
			int pieces = 1, sum = 0;
			mid = start + (end - start) / 2;
			for (auto& elem : weights)
			{
				sum += elem;
				if (sum > mid)
				{
					++pieces;
					sum = elem;
				}
			}
			if (pieces > days)
				start = mid + 1;
			else
				end = mid;
		}
		return start;
    }
};
