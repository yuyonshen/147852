//指针
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int a;
	int b;
	int *num1;
	int *num2;
	printf("请输入两个数：");
	scanf("%d%d", &a, &b);
	num1 = &a;
	num2 = &b;
	printf("%d,%d\n", *num1, *num2);
	system("pause");
	return 0;
}
//指针的自加自减的运算方法
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int i;
	int *p;
	printf("请输入这个数字：\n");
	scanf("%d", &i);
	p = &i;
	printf("%d\n", p);
	p++;//p++指的是地址加了一位这个一位与他的类型有关如int占四个字节所以加了四
	printf("%d\n", p);
	system("pause");
	return 0; 
}
//指针变量加一表示地址先后移动了这与他的类型有关如char类型 p++移动了一位
//int类型 p++移动了四个字节
#define  _CRT_SECURE_NO_WARNINGS
#include<stdlib.h>
#include<stdio.h>
int main(){
	int *p;
	int *q;
	int a[5], b[5];
	p = &a[0];
	q = b;
	printf("请输入五个数字：\n");
	for (int i = 0; i < 5;i++)
	scanf("%d", p++);
	printf("请输入五个数字：\n");
	for (int i = 0; i < 5; i++)
		scanf("%d\n", q++);
	p = a;
	q = b;
	for (int i = 0; i < 5; i++){
		printf("%d\n", *p++);
	}
	for (int i = 0; i < 5; i++){
		printf("%5d\n", *q++);
	}
	system("pause");
	return 0;
}