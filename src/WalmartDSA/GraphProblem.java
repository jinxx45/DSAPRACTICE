package WalmartDSA;

import java.util.*;

public class GraphProblem {
    public static void main(String[] args) {
        int n =7;
        List<List<Integer>> edges = Arrays.asList(
               Arrays.asList(0,1),
               Arrays.asList(1,2),
               Arrays.asList(1,3),
               Arrays.asList(3,4),
               Arrays.asList(3,5),
               Arrays.asList(5,6)
        );

        int steps = findNumberOfSteps(edges,n);
        System.out.println(steps);
    }

    private static int findNumberOfSteps(List<List<Integer>> edges, int n) {
        List<Set<Integer>> graph = new ArrayList<>();
        int degree[] = new int[n];

        for(int i=0;i<n;i++){
            graph.add(new HashSet<>());
        }

        for(List<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
            degree[u]++;
            degree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i] <=1){
                queue.add(i);
            }
        }
        int steps = 0;

        while(!queue.isEmpty()){
            steps+=1;
            int queSize = queue.size();
            for(int i=0;i<queSize;i++){
                int node = queue.poll();
                for(int neighbor: graph.get(node)){
                    graph.get(neighbor).remove(node);
                    degree[neighbor]--;
                    if(degree[neighbor] ==1){
                        queue.add(neighbor);
                    }
                }
            }
        }

        return steps;

    }
}
