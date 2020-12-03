#include<stdio.h>
#include<windows.h>
void qiuhe()
{
	double i = 1.0;
	int n;
	double sum = 1.0;
	for (n = 2; n < 101; n++)
	{
		i = -i;
		sum += i / n;
	}
	printf("%lf", sum);
}
	//int n;
	//double ret1=0,ret2=0,ret=0;
	//for (n = 1; n < 101; n=n+2)
	//{
	//	ret1 += 1.0/ n;
	//}
	//for (n = 2; n < 101; n=n+2)
	//{
	//	ret2 += 1.0 / n;
	//}
	//ret = ret1 - ret2;
	//printf("%f", ret);
int main()
{
	qiuhe();
	system("pause");
	return 0;
}