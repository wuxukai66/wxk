#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<time.h>
void menu()
{
	printf("*********************\n");
	printf("********1play********\n");
	printf("********2exit********\n");
	printf("*********************\n");
}
void game()
{
	int random_num = rand() % 100 + 1;
	int input = 0;
	while (1)
	{
		printf("������µ�����\n");
		do
		{
			scanf("%d", &input);
			if (input > random_num)
			{
				printf("�´���\n");
			}
			else if (input < random_num)
			{
				printf("��С��\n");
			}
			else
				printf("��ϲ��¶���\n");
			break;
		} while (1);
}
}
int main()
{
	int input = 0;
	srand((unsigned)time(NULL));
	do
	{
		menu();
		printf("��������Ĳ�����");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			break;
		default:
			printf("����������������룡\n");
		}
	} while (input);
	system("pause");
	return 0;
}