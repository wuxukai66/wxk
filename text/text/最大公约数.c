#include<stdio.h>
#include<windows.h>
void gongyueshu(int x,int y)
{
	if (x > y&&x%y == 0)
	{
		printf("最大公约数为%d\n", y);	
	}
	else if (x < y&&y%x == 0)
	{
		printf("最大公约数为%d\n", x);
	}
	else
	{	
		printf("最大公约数为1\n");
	
	}

}
int main()
{
	gongyueshu(2, 9);
	system("pause");
	return 0;
}