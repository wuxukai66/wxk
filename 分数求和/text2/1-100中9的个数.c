#include<stdio.h>
#include<windows.h>
void geshu()
{
	int count=0;
	int i;
	for (i = 1; i < 101; i++)
	{
		if (i % 10 == 9)
		{
			count++;
		}
		
	}printf("%d", count);
}


int main()
{
	geshu();
	system("pause");
	return 0;
}