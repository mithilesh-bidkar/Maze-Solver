/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze.solver;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author mithi
 */
public class AppFrame extends JFrame{
    
    public int[][] maze = {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,1,0,1,0,1,0,0,0,0,0,1},
                    {1,0,1,0,0,0,1,0,1,1,1,0,1},
                    {1,0,1,1,1,1,1,0,0,0,0,0,1},
                    {1,0,0,1,0,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,0,0,1},
                    {1,0,1,0,1,0,0,0,1,1,1,0,1},
                    {1,0,1,0,1,1,1,0,1,0,1,0,1},
                    {1,0,0,0,0,0,0,0,0,0,1,9,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    public List<Integer> path = new ArrayList<>();
    
    AppFrame(){
        this.setTitle("Maze ▦ Solver");
        this.setSize(640, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        DepthFirst.dfs(maze,1,1,path);
        
        
    }
    
    @Override
    public void paint(Graphics g){
      g.translate(50, 150);
        
        for(int i= 0;i<maze.length;i++){
            for(int j = 0;j<maze[0].length;j++){
                Color color;
                switch(maze[i][j]){
                    case 1: color = Color.black;break;
                    case 9: color = Color.red;break;
                    default:color = Color.white;
                }
                g.setColor(color);
                g.fillRect(40*j, 40*i, 40, 40);
                g.setColor(Color.red);
                g.drawRect(40*j, 40*i , 40, 40);
                
            }
        }
        
        
        for(int i = 0;i<path.size();i+=2){
            int x = path.get(i);
            int y = path.get(i+1);
            
            g.setColor(Color.ORANGE);
            g.fillRect(40*x , 40*y, 30, 30);
        }
    }
    
    public static void main(String[] args){
        AppFrame frame = new AppFrame();
        frame.setVisible(true);
        
    }
    
}
