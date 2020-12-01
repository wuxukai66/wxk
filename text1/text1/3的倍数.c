#include <stdio.h>
#include <windows.h>
void beishu(i)
{
	for (i = 1; i <= 100; i++)
	{
		if (i % 3 == 0)
		{
			printf("%d ", i);
		}
	}
}

int main()
{
	beishu();
	system("pause");
	return 0;
}