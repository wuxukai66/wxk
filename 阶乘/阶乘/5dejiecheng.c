#include <stdio.h>
#include <windows.h>
int main()
{
	int i = 1;
	int ret = 1;

	while (i <= 5)
	{
		ret *= i;
		i++;
	}
	printf("%d\n", ret);
	system("pause");
	return 0;


}

