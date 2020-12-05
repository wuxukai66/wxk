#include<stdio.h>
#include<windows.h>
void num(int n)
{
	if (n != 0)
	{
		/*{
			return;
			}
			else
			{*/
		num(n / 10);
		printf("%d ", n % 10);
	}
	//}
	
}
int main()
{
	num(123);
	system("pause");
	return 0;
}