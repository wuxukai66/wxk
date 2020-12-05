#define _CRE_SECURE_NO_WARNINGS1
#include <stdio.h>
#include <windows.h>
void text()
{
	int n;
	scanf_s("%d",&n);
	int i = 0;
	int j = 0;
	for (i = 1; i <=n; i++)
	{
		for (j = 1; j < i; j++)
		{
			printf("%dx%d=%d\t", j, i, i*j);
		}
		printf("\n");
	}
}
int main()
{
	text();
	system("pause");
	return 0;
}