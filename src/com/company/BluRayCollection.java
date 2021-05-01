package com.company;
//Mashood Khan CSC 1322 Section 02
import java.text.DecimalFormat;

public class BluRayCollection {
    DecimalFormat df2 = new DecimalFormat("#.##");
    private Node first;
    private int count;
    static class Node
    {
        public BluRayDisc bd;
        public Node next;

    }
    public BluRayCollection()
    {
        first = null;
    }
    public void add(BluRayDisc br)
    {
        Node newNode = new Node();
        newNode.bd = br;
        newNode.next = first;
        first = newNode;
        count++;
    }
    public String search(String n)
    {
        Node current = first;
        String ans = "DVD "+n+" Not found";
        int value = 0;
        while(value < count)
        {
            if(current.bd.getTitle().equals(n))
            {
                ans = "DVD "+n+" found: "+current.bd.Tostring();
                value = count+1;
            }
            else
                {
                    current = current.next;
                    value++;
                }
        }
        return ans+"\n";
    }
    public String remove(String n)
    {
        Node current = first;
        Node previous = current;
        String ans = "Unable to delete "+n+"\n"+toString();
        int value = 0;
        while(value < count)
        {
            if(current.bd.getTitle().equals(n))
            {
                if(value == 0) {
                    current = null;
                    value = count + 1;
                    count--;
                    ans = "Delete of " + n + " successful\n"+toString();
                }
                else
                    {
                        previous.next = current.next;
                        current = null;
                        value = count + 1;
                        count--;
                        ans = "Delete of " + n + " successful\n"+toString();

                    }
            }
            else
            {
                if(value == 0) {
                    current = current.next;
                    value++;
                }
                else
                    {
                        current = current.next;
                        previous = previous.next;
                        value++;
                    }
            }
        }
        return ans;
    }

    public String toString()
    {
        Node current = first;
        String data="";
        double value = 0;
        while(current.next!=null)
        {
            value+= current.bd.getcost();
            data+= current.bd.Tostring()+"\n";
            current = current.next;
        }
        value+= current.bd.getcost();
        data+= current.bd.Tostring()+"\n";
        return "My BluRay Collection\n\n"+"Number of BluRayDiscs: "+this.count+"\nTotal cost: $"+df2.format(value)+"\nAverage cost: $"+df2.format((value/count))+"\n\nBluRayDisc List:\n\n"+data;
    }
}
