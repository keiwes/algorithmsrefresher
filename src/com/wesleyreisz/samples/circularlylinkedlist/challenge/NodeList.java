package com.wesleyreisz.samples.circularlylinkedlist.challenge;

class NodeList    {
    Node pointer;
    NodeList()    {
        pointer = null;
    }
    public void insertNode(int nodeValue)    {
        Node newNode = new Node(nodeValue);
        if( pointer == null )    {
            newNode.next = newNode;
            newNode.prev = newNode;
        }else if( pointer.next == null && pointer.prev == null && pointer != null )    {
            newNode.next = pointer;
            newNode.prev = pointer;
            pointer.prev = newNode;
            pointer.next = newNode;
        }
        else if( pointer != null )    {
            newNode.next = pointer.next;
            newNode.prev = pointer;
            pointer.next.prev = newNode;
            pointer.next = newNode;
        }
        pointer = newNode;
        System.out.println("Successfully inserted : " + pointer.getValue());
    }
    public void printRing( boolean direction )    {
        Node tempNode = pointer;
        do    {
            System.out.println("Value = " + tempNode.getValue() );
            tempNode = direction ? tempNode.next : tempNode.prev;
        } while( tempNode.value != pointer.value );    
    }    
}
