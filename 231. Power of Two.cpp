class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
            
        // if floor = ceil then the number is integer 
        if(int(log2(n))  == ceil(log2(n))  && pow(2,int(log2(n))) == n)
            return true;
        else 
            return false;
    }
};
