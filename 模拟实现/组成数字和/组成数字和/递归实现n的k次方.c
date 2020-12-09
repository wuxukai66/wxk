#include<stdio.h>
#include<windows.h>
int cifang(int n,int k)
{
	if (k == 1)
	{
		return n;
	}
	else
	{
		return n*cifang(n, k - 1);
	}
}
int main()
{
	printf("%d", cifang(2,5));
	system("pause");
	return 0;
}