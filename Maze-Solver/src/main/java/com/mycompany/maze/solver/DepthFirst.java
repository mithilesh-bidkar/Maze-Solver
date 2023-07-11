/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze.solver;

import java.util.List;

/**
 *
 * @author mithi
 */
public class DepthFirst {
    
    public static boolean dfs(int[][] maze,int i,int j ,List<Integer> path){
        
        if(maze[j][i]==9){
            path.add(i);
            path.add(j);
            return true;
        }
        
        if(maze[j][i]==0){
            
            maze[j][i]=2;
            
            
            
            //left
            if(dfs(maze,i-1,j,path)){
              path.add(i);
              path.add(j);
              return true;
            }  
        
  
            //right
            if(dfs(maze,i+1,j,path)){
              path.add(i);
              path.add(j);
              return true;
            }  
            
               //up
            if(dfs(maze,i,j-1,path)){
              path.add(i);
              path.add(j);
              return true;
            }  
            

            //down
            if(dfs(maze,i,j+1,path)){
              path.add(i);
              path.add(j);
              return true;
            }  
            
             
         
        }
        
        return false;
    }
}
