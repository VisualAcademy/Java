import java.util.ArrayList;
import java.util.List;

class Graph {
    private int numVertices; // 그래프의 정점 개수
    private List<Integer>[] adjList; // 그래프를 표현하는 인접 리스트

    // 생성자: 지정된 정점 개수로 그래프 초기화
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // 간선 추가 메서드: 두 정점(u, v) 사이에 간선을 추가
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // 깊이 우선 탐색의 재귀적 보조 메서드
    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; // 정점을 방문한 것으로 표시
        System.out.println("방문한 노드: " + vertex);

        // 인접한 정점들을 순회하며 방문하지 않은 정점에 대해 재귀 호출
        for (int adjacent : adjList[vertex]) {
            if (!visited[adjacent]) {
                dfsUtil(adjacent, visited);
            }
        }
    }

    // 깊이 우선 탐색 메서드: 지정된 정점에서 깊이 우선 탐색을 수행
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices]; // 방문한 정점을 기록하는 배열
        dfsUtil(startVertex, visited); // 깊이 우선 탐색 시작
    }
}

public class DepthFirstSearchExample {
    public static void main(String[] args) {
        Graph graph = new Graph(6); // 6개의 정점을 가진 그래프 객체 생성

        // 간선 추가
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        graph.dfs(0); // 정점 0에서 시작하는 깊이 우선 탐색 수행
    }
}

// 방문한 노드: 0
// 방문한 노드: 1
// 방문한 노드: 3
// 방문한 노드: 4
// 방문한 노드: 2
// 방문한 노드: 5
