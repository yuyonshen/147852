#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>//通过函数指针求两个是之间最大值
int zuidazhi(int x, int y){
	return (x > y ? x : y);
}
void main(){
	int zuidazhi(int ,int);
	int(*p)(int ,int);
	int a, b, c;
	p = zuidazhi;
	printf("Please input two integer numbers:");
	scanf("%d %d", &a, &b);
	c = (*p)(a, b);
	printf("c=%d\n", c);
	system("pause");
}
