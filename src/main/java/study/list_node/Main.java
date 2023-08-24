package study.list_node;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List<Node> list = new LinkedList();



        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);


        System.out.println(list.size());
    }
}
