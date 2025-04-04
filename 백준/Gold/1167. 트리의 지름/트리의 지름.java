import java.io.*;
import java.util.*;

public class Main {
	//트리 관련 정보 클래스
	static class tree{
		int next, length;
		public int getNext() {
			return next;
		}

		public int getLength() {
			return length;
		}
		public tree(int next, int length) {
			this.next = next;
			this.length = length;
		}
		
	}
	static int N,max=Integer.MIN_VALUE;
	static ArrayList<ArrayList<tree>> tree = new ArrayList<>();	//트리 관련 정보 리스트
	static int[] length;		//최대 길이 구하는 배열
	static boolean[] visited;	//점 방문 확인 배열
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력값 처리하는 BufferedReader
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //결과값 출력하는 BufferedWriter
    	StringTokenizer st;
    	N = Integer.parseInt(br.readLine());
        //트리 관련 리스트 초기화
    	for(int i=0;i<=N;i++) 
    		tree.add(new ArrayList<>());
            //트리 관련 정보 저장
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine()," ");
    		int point = Integer.parseInt(st.nextToken());
    		while(true) {
    			int next = Integer.parseInt(st.nextToken());
    			if(next==-1)
    				break;
    			int length = Integer.parseInt(st.nextToken());
    			tree.get(point).add(new tree(next,length));
    		}
    	}
        bfs(1);			//아무 점에서 BFS탐색 시작, 저는 1부터 시작했습니다.
        int index = getMax();	//가장 먼 점 구하기
        bfs(index);		//가장 먼 점 기준 BFS 탐색 시작
        max = Integer.MIN_VALUE;
        index = getMax();
    	bw.write(length[index] + "\n");	//지름 BufferedWriter 저장
    	bw.flush();		//결과 출력
    	bw.close();
    	br.close();
    }
    //BFS 탐색 후 가장 먼 점 구하는 함수
    static int getMax() {
    	int index = 0;
    	for(int i=1;i<=N;i++) {
    		if(max<length[i]) {
    			index = i;
    			max = length[i];
    		}
    	}
    	return index;
    }
    //BFS탐색으로 시작 점에서 각 점의 거리 구하는 함수
    static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	length = new int[N+1];
    	visited = new boolean[N+1];
    	visited[start] = true;
    	queue.add(start);
    	while(!queue.isEmpty()) {
    		int cur = queue.poll();
    		for(tree value : tree.get(cur)) {	//현재 점 인접한 점 탐색
    			if(!visited[value.next]&&length[cur] + value.getLength() > length[value.next]) {
    				length[value.next] = length[cur] + value.getLength();
    				visited[value.next] = true;
    				queue.add(value.next);
    			}
    		}
    	}
    	return;
    }
}