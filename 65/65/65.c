//����������
//^����Ӧ�Ķ������������ʱ����Ϊ1����ͬ��ʱ��Ϊ0��
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
//ѭ����λ
#define  _CRT_SECURE_NO_WARNINGS//ѭ������
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
#define  _CRT_SECURE_NO_WARNINGS//ѭ������
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