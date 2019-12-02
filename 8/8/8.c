#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int  sum(int n){
	if (n <= 0){
		return("date error\n");
	}
	if (n == 1){
		return 1;
	}
	else
		return ( sum(n - 1) + n);
}
int main(){
	int n=0;
	printf("input n:");
	scanf("%d", &n);
	sum(n);
	printf("sum=%d", sum(n));
	system("pause");
	return 0;
}