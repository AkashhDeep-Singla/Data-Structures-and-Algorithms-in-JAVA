package Practice.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countPaths(3, 3));
//        System.out.println(paths("", 3, 3));
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[maze.length][maze[0].length];
//        System.out.println(pathsAllowed("", maze, 0,0));
//        System.out.println(allPaths("", maze, 0, 0));
        allPathsPrint("", maze, 0, 0, path, 1);
    }

    static int countPaths(int rows, int cols) {
        if(rows == 1 || cols == 1) {
            return 1;
        }
        int left = countPaths(rows-1, cols);
        int right = countPaths(rows, cols-1);
        return left+right;
    }

    static ArrayList<String> paths(String processed, int rows, int cols) {
        if(rows == 1 && cols == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(rows>1) {
            list.addAll(paths(processed+'D', rows-1, cols));
        }
        if(rows>1 && cols>1) {
            list.addAll(paths(processed+"Di", rows-1, cols-1));
        }
        if(cols>1) {
            list.addAll(paths(processed+'R', rows, cols-1));
        }
        return list;
    }

    static ArrayList<String> pathsAllowed(String processed, boolean[][] maze, int rows, int cols) {
        if(rows == 1 && cols == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[rows][cols]) {
            return list;
        }
        if(rows<maze.length-1) {
            list.addAll(pathsAllowed(processed+'V', maze, rows+1, cols));
        }
        if(rows<maze.length-1 && cols<maze[0].length-1) {
            list.addAll(pathsAllowed(processed+'D', maze, rows+1, cols+1));
        }
        if(cols<maze[0].length-1) {
            list.addAll(pathsAllowed(processed+'H', maze, rows, cols+1));
        }
        return list;
    }

    // For going all directions i.e. L,R,U,D instead of only R,D/R,U/L,D/L,U we need to ensure that we don't move back the same path
    // for this we place a false flag on every tile we visit to cancel the recursion call there only
    // If we don't do this we will get stuck in recursion loop forever and eventually exception is thrown

    // All the changes made during recursive calls( i.e. marking the cells as false ) are reverted (mostly done manually) when coming out of a recursive call
    // and moving to the above recursive calls. This is called BACKTRACKING.

    static ArrayList<String> allPaths(String processed, boolean[][] maze, int rows, int cols) {
        if(rows == 1 && cols == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[rows][cols]) {
            return list;
        }
        maze[rows][cols] = false;
        if(rows<maze.length-1) {
            list.addAll(allPaths(processed+'D', maze, rows+1, cols));
        }
        if(rows>0) {
            list.addAll(allPaths(processed+'U', maze, rows-1, cols));
        }
        if(cols>0) {
            list.addAll(allPaths(processed+'L', maze, rows, cols-1));
        }
        if(cols<maze[0].length-1) {
            list.addAll(allPaths(processed+'R', maze, rows, cols+1));
        }
        if(rows<maze.length-1 && cols<maze[0].length-1) {
            list.addAll(pathsAllowed(processed+"Di", maze, rows+1, cols+1));
        }
        // this is where the function for this call ends i.e. we move to above recursive calls
        // so before this function gets returned we also remove the changes made by the current recursive call
        maze[rows][cols] = true;
        return list;
    }

    static void allPathsPrint(String processed, boolean[][] maze, int rows, int cols, int[][] path, int step) {
        if(rows == maze.length - 1 && cols == maze[0].length - 1) {
            path[rows][cols] = step;
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }
        if(!maze[rows][cols]) {
            return;
        }
        maze[rows][cols] = false;
        path[rows][cols] = step;
        if(rows<maze.length-1) {
            allPathsPrint(processed+'D', maze, rows+1, cols, path, step+1);
        }
        if(rows>0) {
            allPathsPrint(processed+'U', maze, rows-1, cols, path, step+1);
        }
        if(cols>0) {
            allPathsPrint(processed+'L', maze, rows, cols-1, path, step+1);
        }
        if(cols<maze[0].length-1) {
            allPathsPrint(processed+'R', maze, rows, cols+1, path, step+1);
        }
        if(rows<maze.length-1 && cols<maze[0].length-1) {
            allPathsPrint(processed+"Di", maze, rows+1, cols+1, path, step+1);
        }
        // this is where the function for this call ends i.e. we move to above recursive calls
        // so before this function gets returned we also remove the changes made by the current recursive call
        maze[rows][cols] = true;
        path[rows][cols] = 0;
        return;
    }
}


