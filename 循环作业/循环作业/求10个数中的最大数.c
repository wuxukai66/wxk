#include<stdio.h>
#include<windows.h>
void Max(int*a,int n)
{
	int flag = 0;
	int i = 0;
	int j;
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (a[j] < a[j + 1])
			{
				int tmp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = tmp;
				flag = 1;
			}
			if (flag = 0)
				break;
		}
	}
}
void Max2()
{
	int a[] = { 5, 7, 8, 9, 6, 4, 3, 2, 11, 10 };
	Max(a, 10);
	printf("%d\n",a[0]);
}
int main()
{
	Max2();
	system("pause");
	return 0;
}