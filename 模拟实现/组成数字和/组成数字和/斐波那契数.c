//µÝ¹é
#include<stdio.h>
#include<windows.h>
int fib(int n)
{
	int f1 = 1;
	int f2 = 1;
	int f3 = 1;
	int i = 0;
	for (i = 3; i <= n; i++)
	{
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
	}
	return f3;
}
int main()
{
	printf("%d",fib(5));
	system("pause");
	return 0;
}
//·ÇµÝ¹é
#include<stdio.h>
#include<windows.h>
int fib(int n)
{
	if (n == 1 || n == 2)
	{
		return 1;
	}
	int sum = fib(n-1) + fib(n - 2);
	return sum;
}
int main()
{
	printf("%d", fib(5));
	system("pause");
	return 0;
}