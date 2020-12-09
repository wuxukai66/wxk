#include<stdio.h>
#include<windows.h>
void reverse_string(char * string)
{
	if (*string == '\0')
		{return;
	}
	reverse_string(string+1);
	printf("%c", *string);
}
int main()
{
	reverse_string("hello");
	system("pause");
	return 0;
}