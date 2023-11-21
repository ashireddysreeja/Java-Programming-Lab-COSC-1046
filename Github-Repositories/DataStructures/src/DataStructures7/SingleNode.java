/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab7,Part1
 *Any and all work in this file is my own.
 */






package DataStructures7;
public class SingleNode {
    protected String item;
    protected SingleNode next;
    public SingleNode(String item) {
        this(item, null);
    }
    public SingleNode(String item, SingleNode next) {
        this.item = item;
        this.next = next;
    }
}