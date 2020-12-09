#include<stdio.h>
#include<windows.h>
int Digitsum(int n)
{
	if (n < 10)
	{
		return n;
	}
	else
		return (n % 10) + Digitsum(n / 10);
}
int main()
{
	printf("%d",Digitsum(1729));
	system("pause");
	return 0;
}