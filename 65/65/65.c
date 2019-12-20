//”异或“运算符
//^当对应的二进制数相异的时候结果为1，相同的时候为0；
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a, b;
	unsigned result;
	printf("please input a:");
	scanf("%d", &a);
	printf("plaese input b:");
	scanf("%d", &b);
	printf("a=%d,b=%d", a, b);
	result = a^b;
	printf("\na^b=%u\n", result);
	system("pause");
	return 0;
		
}
//循环移位
#define  _CRT_SECURE_NO_WARNINGS//循环左移
#include<stdio.h>
#include<stdlib.h>
int left(unsigned value, int n){
	unsigned z;
	z = (value >> (32 - n) | value << n);
	return z;
}
int main(){
	unsigned a;
	int n;
	printf("plaese input a:\n");
	scanf("%o", &a);
	printf("plaese input n:\n");
	scanf("%d", &n);
	printf("the result is %o:\n", left(a, n));
	system("pause");
	return 0;
}*/
#define  _CRT_SECURE_NO_WARNINGS//循环右移
#include<stdio.h>
#include<stdlib.h>
int left(unsigned value, int n){
	unsigned z;
	z = (value <<(32 - n) | value >> n);
	return z;
}
int main(){
	unsigned a;
	int n;
	printf("plaese input a:\n");
	scanf("%o", &a);
	printf("plaese input n:\n");
	scanf("%d", &n);
	printf("the result is %o:\n", left(a, n));
	system("pause");
	return 0;
}