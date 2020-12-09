#include <stdio.h>
#include<windows.h>
int My_strlen(const char*str){
	int count = 0;
	while (*str){
		count++;
		str++;
	}
	printf("%d", count);
	return count;
}int main(){
	My_strlen("assdhsahd");
	system("pause");
	return 0;
}