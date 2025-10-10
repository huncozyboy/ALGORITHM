import java.io.*;
import java.util.*;

class Solution {
    private static final int MAX_NODE_ID = 1_000_000;

    public int[] solution(int[][] edges) {
        int[] inDegree = new int[MAX_NODE_ID + 1];
        int[] outDegree = new int[MAX_NODE_ID + 1];
        boolean[] present = new boolean[MAX_NODE_ID + 1];

        // 간선 집계 + 등장 표시
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            outDegree[from]++;
            inDegree[to]++;
            present[from] = true;
            present[to] = true;
        }

        // 생성 정점: 등장한 정점만 검사
        int generatedNode = 0;
        for (int node = 1; node <= MAX_NODE_ID; node++) {
            
            if (!present[node]) 
                continue;
            
            if (inDegree[node] == 0 && outDegree[node] >= 2) {
                generatedNode = node;
                break;
            }
        }

        // 막대 + 8자 개수: 등장 정점만
        int stickCount = 0; 
        int eightCount = 0; // (생성 정점 제외)
        for (int node = 1; node <= MAX_NODE_ID; node++) {
            
            if (!present[node] || node == generatedNode) 
                continue; 
            int out = outDegree[node];
            
            if (out == 0) 
                stickCount++;
            
            else if (out == 2) 
                eightCount++;
        }

        // 생성 정점의 가지 수 - 막대 - 8자
        int donutCount = outDegree[generatedNode] - stickCount - eightCount;

        return new int[] { generatedNode, donutCount, stickCount, eightCount };
    }
}