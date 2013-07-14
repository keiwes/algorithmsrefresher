package com.wesleyreisz.samples.circularlylinkedlist.challenge;

class Circular    {
    public static void main( String[] args )    {
        NodeList myList = new NodeList();
        myList.insertNode(10);
        myList.insertNode(20);
        myList.insertNode(30);
        myList.insertNode(40);
        myList.insertNode(50);
        myList.printRing( true );
    }
}