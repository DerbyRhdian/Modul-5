/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author derby rahadian
 */
public class node {
     protected int data;
    protected node link;

    //Constructor//
    public node()
    {
        link = null;
        data = 0;
    }
    //Constructur//
    public node(int d,node n) {
        data = d;
        link = n;
    }
    //function to set link to next Node//
    public void setLink(node n)
    {
        link = n;
    }

    //Function to set data to current Node//
    public void setData(int d) {
        data = d;
    }

    //Function to get link to next Node//
    public node getLink() {
        return link;
    }

    //Function to get data from current Node//
    public int getData() {
        return data;
    }
}

