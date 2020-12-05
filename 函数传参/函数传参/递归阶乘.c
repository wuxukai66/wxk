#include<stdio.h>
#include<windows.h>
int text( int i)
{
	if (i == 1)
	{
		return 1;
	}
	else
	{
	return i*text(i - 1);
	}
}
int main()
{
	printf("%d\n",text(5));
	system("pause");
	return 0;
}