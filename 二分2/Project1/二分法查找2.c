#include <stdio.h>
#include <windows.h>
int bin_search()
{
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	int mid = 0;
	int key = 4;
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
		{
			printf("�ҵ��ˣ��±�Ϊ%d\n",mid);
		return mid;
		}
	}
	printf("û�ҵ�\n");
	return -1;
	
}
int main()
{
	bin_search();
	system("pause");
	return 0;
}