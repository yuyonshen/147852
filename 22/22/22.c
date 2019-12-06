//. 获取一个整数二进制序列中所有的偶数位和奇数位。
//要求：分别打印出二进制序列。
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int num;
	int i;
	printf("input num:");
	scanf("%d", &num);
	printf("偶数\n");
	for (i = 31; i >= 1; i -= 2){
		if ((num >> i) & 1){
			printf("%d ", 1);
		}
		else
			printf("%d ",0);
	}
	printf("\n");
	printf("奇数\n");
	for (i = 30; i >= 0; i -= 2){
		if ((num >> i) & 1){
			printf("%d ", 1);
		}
		else
			printf("%d ", 0);
	}
	system("pause");
	return 0;
}