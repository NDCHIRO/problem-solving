#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    
    void solve(vector<vector<char>>& board) {

        vector<vector<char>> prevBoard= board;
        bool boardsEqual = true;
        int count = 0;
        //mark all the O's in the boarder as 1's to define the boarder O's for the intermediate O's
        for (auto i = 0; i < board.size(); i++)
            for (auto j = 0; j < board[i].size(); j++)
                if (board[i][j] == 'O' && (i == board.size() - 1 || i == 0 || j == board[i].size()-1 || j == 0))
                        board[i][j] = '1';
                
            
       
        while (boardsEqual)
        {
            count = 0;
            // make a new board to save the previous state of the board so if the previous State of the board is equal to the current board
            // so we are done and we get out of the loop
            for (auto i = 0; i < board.size(); i++)
                for (auto j = 0; j < board[i].size(); j++)
                    prevBoard[i][j] = board[i][j];

            
            for (auto i = 0; i < board.size(); i++)
            {
                for (auto j = 0; j < board[i].size(); j++)
                {
                    //mark all the intermediate O's in the board and didn't find close '1' as Z because  they may find a new 1 but did not appear yet 
                    if (board[i][j] == 'O' && !(board[i + 1][j] == '1' || board[i - 1][j] == '1'
                        || board[i][j + 1] == '1' || board[i][j - 1] == '1'))
                    {
                        board[i][j] = 'Z';
                    }
                    // if there is  O is connected to 1 mark it as 1 
                    else if (board[i][j] == 'O' && (board[i + 1][j] == '1' || board[i - 1][j] == '1'
                            || board[i][j + 1] == '1' || board[i][j - 1] == '1'))
                    {
                        board[i][j] = '1';
                    }
                    // if there is  Z is connected to 1 mark it as 1 
                    else if (board[i][j] == 'Z' && (board[i + 1][j] == '1' || board[i - 1][j] == '1'
                        || board[i][j + 1] == '1' || board[i][j - 1] == '1'))
                    {
                        board[i][j] = '1';
                    }
                }
            }

            //if all the for loops pass so count will be equal to the board size so previous board is equal to the current board so we break from the while
            for (auto i = 0; i < board.size(); i++)
                for (auto j = 0; j < board[i].size(); j++)
                    if (prevBoard[i][j] == board[i][j])
                        count++;

            if (count == (board.size() * board[0].size()))
                boardsEqual = false;

        }


        //change all the 1's to be O's and all the Z's to X's
        for (auto i = 0; i < board.size(); i++)
            for (auto j = 0; j < board[i].size(); j++)
                if (board[i][j] == '1' )
                     board[i][j] = 'O';
                else if (board[i][j] == 'Z')
                       board[i][j] = 'X';
                

        for (auto i = 0; i < board.size(); i++)
        {
            for (auto j = 0; j < board[i].size(); j++)
            {
                cout << board[i][j];
            }
            cout << endl;
        }


    }
};

int main()
{
    Solution s;
    

    vector<vector<char>> board = { { 'O', 'X', 'X', 'O', 'X'},{'X', 'O', 'O', 'X', 'O'},{'X', 'O', 'X', 'O','X'},{'O', 'X', 'O', 'O', 'O'},{'X', 'X', 'O', 'X', 'O' } }; //example 2
    s.solve(board);
    
    //{ {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O','X'}, {'X', 'O', 'X','X'}}; //example 1
}
