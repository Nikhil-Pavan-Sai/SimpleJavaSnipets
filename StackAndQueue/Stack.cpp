//stack implementation using arrays
#include<iostream>
using namespace std;
#define MAX 200
//Stack class
class stack
{
	int top = -1;
	public:
		int a[MAX];//maximum size
		int size;
		stack()
		{
			cout<<"Enter the size oo the stack :";
			cin>>size;
		}
		void push()//functions of stack
		{
			if(top == size-1)
				cout<<"Stack Overflow"<<endl;
			else
			{
				int x;
				cout<<"Enter the element : ";
				cin>>x;
				a[++top] = x;
			}
		}
		void pop()
		{
			if(top == -1)
				cout<<"Stack Underflow"<<endl;
			else
			{
				cout<<a[top]<<" is the poppedelement"<<endl;
				top--;
			}
		}
		void peek()
		{
			if(top == -1)
				cout<<"Stack is Empty";
			else
				cout<<"The peek element is "<<a[top]<<endl;
		}
		void traverse()
		{
			if(top!=-1)
			{
				cout<<"The stackk data is :"<<endl;
				for(int i =top;i>=0;i-- )
					cout<<a[i]<<endl;
			}
			else
				cout<<"stack is empty"<<endl;
		}
};
//Driver code
int main()
{
	stack s;
	while(true)
	{
		int choice,flag = 0;
		cout<<"1.push"<<"\n2.pop"<<"\n3.peek"<<"\n4.traverse"<<"\n5.quit"<<endl;//display menu
		cout<<"Enter the choice of operation :"<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:s.push();
				break;
			case 2:s.pop();
				break;
			case 3:s.peek();
				break;
			case 4:s.traverse();
				break;
			default:flag = 1;
				cout<<"End of Stack"<<endl;
				break;
		}
		if(flag)
			break;
	}
}
