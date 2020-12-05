#include <stdio.h>
#include <windows.h>
void Swap(a,b)
{
	printf("%d %d\n", a, b);
	a = a + b;
	b = a - b;
	a = a - b;
	printf("%d %d\n", a, b);
}
int main()
{
	Swap(1, 2);
	system("pause");
	return 0;
}