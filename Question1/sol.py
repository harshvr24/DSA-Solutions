import heapq

class MedianFinder:

    def __init__(self):
        # max heap for smaller half
        self.maxh = []
        # min heap for larger half
        self.minh = []

    def addNum(self, num):
        if not self.maxh or num <= -self.maxh[0]:
            heapq.heappush(self.maxh, -num)
        else:
            heapq.heappush(self.minh, num)

        # Balance the heaps
        if len(self.maxh) > len(self.minh) + 1:
            heapq.heappush(self.minh, -heapq.heappop(self.maxh))
        elif len(self.maxh) < len(self.minh):
            heapq.heappush(self.maxh, -heapq.heappop(self.minh))

    def findMedian(self):
        if len(self.maxh) == len(self.minh):
            return (-self.maxh[0] + self.minh[0]) / 2.0
        else:
            return -self.maxh[0]
