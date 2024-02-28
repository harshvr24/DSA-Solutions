class MedianFinder {
public:
    MedianFinder() {}
    priority_queue<int> maxh;
    priority_queue<int,vector<int>,greater<int>> minh;

    void addNum(int num) {
        if(maxh.empty() || num<=maxh.top()){
            maxh.push(num);
        }else{
            minh.push(num);
        }

        // Balance the heaps
        if(maxh.size() > minh.size()+1){
            minh.push(maxh.top());
            maxh.pop();
        }else if(maxh.size() < minh.size()){
            maxh.push(minh.top());
            minh.pop();
        }
    }

    double findMedian() {
        if(maxh.size() == minh.size()){
            return (maxh.top() + minh.top()) / 2.0;
        }else{
            return maxh.top();
        }
    }
};
