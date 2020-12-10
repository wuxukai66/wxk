#include <stdio.h>
#include <windows.h>
int bin_search()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	int mid=0;
	int key =5;
	while (left <= right)
	{
		mid = (left + right) / 2;
		if (arr[mid] > key)
		{
			right = mid - 1;
		}
		else if (arr[mid] < key)
		{
			left = mid + 1;
		}
		else
		{return mid;
		}
	}
	return -1;
}
int main()
{
	printf("%d\n",bin_search());
	system("pause");
	return 0;
}