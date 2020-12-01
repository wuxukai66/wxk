#include <stdio.h>
#include<windows.h>
void paixu(int a, int b, int c)
{
	int t=0;
	if (a <b)
	{
		t= a ;
		a = b;
		b = t;
	}
	if (a < c)
	{
		t = a;
		a = c;
		c = t;
	}
	if (b < c)
	{
		t = b;
		b = c;
		c = t;
	}
	printf("%d %d %d", a, b, c);
}
int main()
{
	paixu(2, 1, 3);
	system("pause");
	return 0;
}