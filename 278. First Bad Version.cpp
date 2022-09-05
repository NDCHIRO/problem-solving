// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        unsigned  int res = getFirstBad(1,n);
        return res;
    }
    
    int getFirstBad(unsigned  int min, unsigned  int max)
    {
        
        unsigned  int mid= (min+max)/2;
        if(isBadVersion(mid) == true && isBadVersion(mid-1) == false)
        {
            return mid;
        }
        
        else if(isBadVersion(mid) == false)
        {
            min = mid+1;
            return getFirstBad(min,max);
        }
        
        else
        {
            max = mid-1;
            return getFirstBad(min,max);
        }
    }
};
