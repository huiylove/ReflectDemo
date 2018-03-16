package com.huiy.javaimprove.datastructuer;
/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2018��2��5��
 * @version 1.0
 * �������ڴ��в������Ŀռ䣬�����ɾ��Ч�ʸߣ���ѯЧ�ʵͣ�ÿ���ڵ㱣������һ���ڵ�ĵ�ַ
 * ��ָ����С����չ����
 * 
 * 
 */
public class Node {
	public int data;
	public Node next;
	
	public Node head;//ͷ�ڵ�  ָ���ƶ�
	

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
		while(temp.next!=null){//���������һ���ڵ�
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void insertNodeByIndex(int index,Node node){
		Node temp = head;
		int length = 1;//����Ϊʲô�Ǵ�1��ʼ
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
		int length = 1;//����Ϊʲô�Ǵ�1��ʼ
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
		int length = 0;//����Ϊʲô�Ǵ�0��ʼ
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

