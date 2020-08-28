package com.zcw.shangguigu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: AndrewBar
 * @Date: Created in 13:49 2020/8/16
 */
public class Graph {

    private ArrayList<String> vertexList;//存储顶点集合
    private int[][] edges;//存储图对应的邻接矩阵
    private int numOfEdges;//表示边的数目
    private boolean[] isVisited;

    public static void main(String[] args) {
        //测试
        int n = 5;//节点的个数
        String VertexValue[] = {"A","B","C","D","E"};
        //创建图对象
        Graph graph = new Graph(n);
        //循环的添加顶点
        for (String vertex : VertexValue) {
            graph.insertVertex(vertex);
        }
        //添加边
        graph.insertEdge(0,1,1);//A-B
        graph.insertEdge(0,2,1);//A-B
        graph.insertEdge(1,2,1);//A-B
        graph.insertEdge(1,3,1);//A-B
        graph.insertEdge(1,4,1);//A-B

        graph.showGraph();
    }

    //构造器
    public Graph(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
        isVisited = new boolean[5];
    }

    //得到第一个邻接节点的下标w
    public int getFirstNeughbor(int index){
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[index][i] > 0){
                return i;//如果存在返回下标
            }
        }
        return -1;
    }
    //根据前一个邻接节点的下标来获取下一个邻接节点
    public int getNextNeughbor(int v1,int v2){
        for (int i = v2 + 1; i < vertexList.size(); i++) {
            if (edges[v1][i] > 0){
                return i;//如果存在返回下标
            }
        }
        return -1;
    }
    //深度优先算法
    public void dfs(boolean[] isVisited,int i){
        //首先访问该节点,输出
        System.out.println(getValueByIndex(i) + "->");
        //将该节点设为已访问
        isVisited[i] = true;
        //查找节点i 的第一个邻接节点w
        int w = getFirstNeughbor(i);
        while(w != -1){//说明有
            if(!isVisited[w]){
                dfs(isVisited,w);
            }
            //如果w节点已经被访问过
            w = getNextNeughbor(i,w);
        }
    }
    //对dfs 进行重载,遍历所有的节点并进行dfs



    //图中常用的方法
    //显示图对应的矩阵
    public void showGraph(){
        for (int[] link : edges) {
            System.out.println(Arrays.toString(link));
        }
    }
    //返回节点的个数
    public int getNumOfVertex(){
        return vertexList.size();
    }
    //得到边的数目
    public int getNumOfEdges(){
        return numOfEdges;
    }
    //返回节点i(下标)对应的数据
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    //返回v1和v2的权值
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }


    //插入节点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }
    //添加边
    /**
     *
     * @param v1 表示点的下标即是第几个顶点
     * @param v2 第二个顶点的下标
     * @param weight 表示权值
     */
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }
}
