/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high = n;
        int low = 1;
        int res = 0;
        while(high >= low)
        {
            int mid = low + (high - low) / 2;
            res = guess(mid);
            if(res == 0)
                return mid;
            else if(res == -1)
                high = mid-1;                    
            else
                low = mid+1;
        }
        return res;
    }
}