//数据类型的先习题
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	printf("input i:");
	scanf("%d", &i);
	printf("i=%d\n", i);
	system("pause");
	return 0;
	}
int main(){
	static int a = 3;
	int num = 1;
	int j = 1;
	for (j = 1; j <= 3; j++){
		num = num*a;
	}
	printf("num=%d\n", num);
	system("pause");
	return 0;
}
int main(){
	char cChar;
	cChar = 'F';
	printf("%c\n", cChar);
	cChar = 'i';
	printf("%c\n", cChar);
	cChar = 'n';
	printf("%c\n", cChar);
	cChar = 'e';
	printf("%c\n", cChar);
	cChar = 'D';
	printf("%c\n", cChar);
	cChar = 'a';
	printf("%c\n", cChar);
	cChar = 'y';
	printf("%c\n", cChar);
	cChar = '!';
	printf("%c\n", cChar);
	system("pause");
	return 0;
}
