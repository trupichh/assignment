public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue p = new java.util.PriorityQueue();
        for(int i=0;i<=10;i++){
            p.offer(i);
        }
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p.remove());
        System.out.println(p);
    }
}

