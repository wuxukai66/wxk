#include<stdio.h>
#include<windows.h>
void runnian()
{
	int i;
	for (i = 1000; i <= 2000;i++)
	if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
	{
		printf("%d ",i);
	}
}
int main()
{
	runnian();
	system("pause");
	return 0;
}