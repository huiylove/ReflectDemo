package com.huiy.javaimprove.datastructuer;
/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年2月5日
 * @version 1.0
 * 单链表—内存中不连续的空间，插入和删除效率高，查询效率低，每个节点保留着下一个节点的地址
 * 不指定大小，扩展方便
 * 
 * 
 */
public class Node {
	public int data;
	public Node next;
	
	public Node head;//头节点  指针移动
	

	public Node(){
	}
	
	public Node(int data){
		this.data = data;
	}
	
	public void setHead(Node head){
		this.head = head;
	}
	
	
	public void addNode(Node node){
		Node temp = head;
		while(temp.next!=null){//遍历到最后一个节点
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void insertNodeByIndex(int index,Node node){
		Node temp = head;
		int length = 1;//？？为什么是从1开始
		while(temp.next!=null){
			if(index==length++){
				node.next = temp.next;
				temp.next = node;
				return ;
			}
			temp = temp.next;

		}
	}
	
	public void deleteNodeByIndex(int index,Node node){
		Node temp = head;
		int length = 1;//？？为什么是从1开始
		while(temp.next!=null){
			if(index==length++){
				temp.next = temp.next.next;
				return ;
			}
			temp = temp.next;

		}
	}
	
	
	public int length(){
		Node temp = head;
		int length = 0;//？？为什么是从0开始
		while(temp.next!=null){
			length ++;
			temp = temp.next;
		}
		return length;
	}
	
	public void selectSortNode(){
		Node temp = head;
		while(temp.next!=null){
			Node secondTemp = temp.next;
			while(secondTemp.next!=null){
				if(temp.next.data>secondTemp.next.data){
					int t = secondTemp.next.data;
					secondTemp.next.data = temp.next.data;
					temp.next.data = t;
				}
				secondTemp = secondTemp.next;
			}
			temp = temp.next;
		}
	}
	
	public void selectBubbleSortNode(){
		Node temp = head;
		Node maxTemp = head;
		while(temp.next!=null){
			Node secondTemp = head;
			while(secondTemp.next!=null&&secondTemp.next!=maxTemp){
				if(secondTemp.data>secondTemp.next.data){
					int t = secondTemp.next.data;
					secondTemp.next.data = secondTemp.data;
					secondTemp.data = t;
				}
				secondTemp = secondTemp.next;
			}
			maxTemp = secondTemp;
			temp = temp.next;
		}
	}
	
	public void iterator(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args){
		Node node = new Node();
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(8);
		Node node3 = new Node(5);
		Node node4 = new Node(3);
		Node node5 = new Node(2);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node.setHead(node0);
		node.selectBubbleSortNode();
		node.iterator();
	}
	
	
}

