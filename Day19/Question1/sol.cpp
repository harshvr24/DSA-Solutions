class Solution {
public:
  std::vector<int> smallestRange(std::vector<std::vector<int>> const &nums)
  {
    auto S = nums.size();
    std::vector<std::pair<std::vector<int>::const_iterator,
                          std::vector<int>::const_iterator>>
        ps(S);
    std::transform(nums.begin(),
                   nums.end(),
                   ps.begin(),
                   [](auto const &num)
                   {
                     return std::make_pair(std::begin(num), std::end(num));
                   });
    auto less_val = [](auto i, auto j)
    {
      return *(i.first) < *(j.first);
    };
    auto max_i    = std::max_element(ps.begin(), ps.end(), less_val);
    auto best_max = max_i->first;
    auto best_min = std::min_element(ps.begin(), ps.end(), less_val)->first;
    while (max_i->first != max_i->second)
    {
      for (auto &[begin, end] : ps)
      {
        begin = std::upper_bound(begin, end, *(max_i->first)) - 1;
      }
      auto min_i = std::min_element(ps.begin(), ps.end(), less_val);
      if (*max_i->first - *min_i->first < *best_max - *best_min)
      {
        best_max = max_i->first;
        best_min = min_i->first;
      }
      min_i->first++;
      max_i = min_i;
    }
    return std::vector<int>({ *best_min, *best_max });
  }
};
