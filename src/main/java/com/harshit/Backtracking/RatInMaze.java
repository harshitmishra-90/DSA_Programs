package com.harshit.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {

        ArrayList<String> list=new ArrayList<>();
        public void maze(int[][] maze,int i,int j,StringBuilder str)
        {
            if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || maze[i][j] == 0) {
                return;
            }
            if(i==maze.length-1&&j==maze[0].length-1)
            {
                list.add(str.toString());
                return;
            }
            maze[i][j]=0;
            if(j+1<maze.length&&maze[i][j+1]==1)
            {
                str.append("R");
                maze(maze,i,j+1,str);
                str.deleteCharAt(str.length()-1);

            }
            if(i+1<maze.length&&maze[i+1][j]==1)
            {
                str.append("D");
                maze(maze,i+1,j,str);
                str.deleteCharAt(str.length()-1);
            }
            if(j>0&&maze[i][j-1]==1)
            {
                str.append("L");
                maze(maze,i,j-1,str);
                str.deleteCharAt(str.length()-1);
            }
            if(i>0&&maze[i-1][j]==1)
            {
                str.append("U");
                maze(maze,i-1,j,str);
                str.deleteCharAt(str.length()-1);
            }
            maze[i][j]=1;

        }
        public ArrayList<String> ratInMaze(int[][] maze) {
            // code here

            StringBuilder str=new StringBuilder("");
            maze(maze,0,0,str);
            Collections.sort(list);
            return list;
        }
    }

