//�ǵݹ�
#include<stdio.h>
#include<windows.h>
int my_strlen(const char*str)
{
	int count = 0;
	while (*str){
		count++;
		str++;
	}
	return count;
}
int main(){
	printf("�ַ�������Ϊ%d",my_strlen("dshjadjshj"));
	system("pause");
	return 0;
}
//�ݹ�
#include<stdio.h>
#include<windows.h>
int my_strlen(const char*str)
{
	int count = 0;
	if (*str == '\0')
	{
		return 0;
	}
else
	return 1 + my_strlen(str+1);
}
int main(){
	printf("�ַ�������Ϊ%d", my_strlen("dshjadjshj"));
	system("pause");
	return 0;
}