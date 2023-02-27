/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        long l = 1;
        long r= n;
        long mid = (r+l)/2;
        while(mid>0)
        {
            mid = (r+l)/2;
            if(isBadVersion((int)mid)==true && mid == 1)
                return (int)mid;
            if(isBadVersion((int)mid)==true && isBadVersion((int)mid-1)==false)
                return (int)mid;
            else if (isBadVersion((int)mid)==false)
            {
                l = mid+1;
            }
            else
                r = mid-1;
        }
        return (int)mid;
    }
}