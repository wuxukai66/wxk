#include<stdio.h>
#include<windows.h>
void gongyueshu(int x,int y)
{
	if (x > y&&x%y == 0)
	{
		printf("���Լ��Ϊ%d\n", y);	
	}
	else if (x < y&&y%x == 0)
	{
		printf("���Լ��Ϊ%d\n", x);
	}
	else
	{	
		printf("���Լ��Ϊ1\n");
	
	}

}
int main()
{
	gongyueshu(2, 9);
	system("pause");
	return 0;
}