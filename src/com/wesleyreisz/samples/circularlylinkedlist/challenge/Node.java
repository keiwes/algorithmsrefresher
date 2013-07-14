package com.wesleyreisz.samples.circularlylinkedlist.challenge;

class Node    {
    int value;
    Node next;
    Node prev;
    Node(int initialValue)    {
        value = initialValue;
        next =  null;
        prev = null;
    }
    public int getValue()    {
        return this.value;
    }
}