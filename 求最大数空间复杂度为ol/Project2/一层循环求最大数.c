#include<stdio.h>
#include<windows.h>
void big_search(int*arr,int n)
{
	int max = 0;
	int i = 0;
	for (i = 1; i < n; i++)
	{
		if (arr[max] < arr[i])
		{
			arr[max] = arr[i];
		}
	}
}
void text()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 11, 9, 10 };
	big_search(arr, 10);
	printf("%d\n",arr[0]);
}
int main()
{
	text();
	system("pause");
	return 0;
}