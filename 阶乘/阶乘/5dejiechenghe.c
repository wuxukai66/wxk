#include <stdio.h>
#include <windows.h>
int main()
{
	int i = 1;
	int ret = 1;
	int j = 1;
	int sum = 0;
	while (j <= 5)
	{
	while (i <= j)
	{
		ret *= i;
		i++;
	}
	
	sum += ret;
	j++;
	}
	printf("%d\n", sum);
	system("pause");
	return 0;


}

