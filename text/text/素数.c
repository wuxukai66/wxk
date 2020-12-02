#include<stdio.h>
#include<windows.h>
void sushu()
{
	int i;
	int j;
	for (i = 100; i < 201; i++)
	{
		int flag = 0;
		for (j = 2; j <= i / 4; j++)
		{
			if (i%j == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			printf("%d ",i);
	}
}
int main()
{
	sushu();
	system("pause");
	return 0;
}