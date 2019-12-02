#define  _CRT_SECURE_NO_WARNINGS
#include<stdlib.h>//指针函数求两个数之间的大小
#include<stdio.h>
int *zuidazhi(int i, int j){
	if (i > j){
		return (&i);
	}
	else{
		return (&j);
	}
}
void main(){
	int y;
	int *p;
	int x;
	printf("input y and x:");
	scanf("%d%d", &x,&y);
	p = zuidazhi(x, y);
	printf("zuidazhi=%d\n",*p);
	system("pause");
}
int minp(int *x, int *y){
	int *q;
	q = *x < *y ? x : y;
	return(q);
}
int main(){
	int a, b, *p;
	printf("input a and b");
	scanf("%d%d", &a, &b);
	p = minp(&a, &b);
	printf("\nminp=%d", *p);
	system("pause");
	return 0;
}