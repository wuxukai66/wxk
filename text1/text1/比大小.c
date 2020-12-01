#include<stdio.h>
#include<windows.h>
int MAX(int a, int b)
{
	return a > b ? a : b;
}
int MAX2(int a, int b, int c)
{
	return MAX(MAX(a, b), c);
}
int main()
{
	printf("%d\n", MAX2(3, 2, 1));
	system("pause");
	return 0;
}