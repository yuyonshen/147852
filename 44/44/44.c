#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[10];
	int i;
	int *p1, **p2;
	int count=0;
	for (p1 = a; p1 - a < 10; p1++){
		p2 = &p1;
		printf("**p2=");
		scanf("%d", *p2);
	}
	printf("%d\n", **p2);
	for (p1 = a; p1 - a < 10; p1++){
		if (**p2 % 2 == 0){
			printf("%d\n", **p2);
			count++;
		}
	}
	printf("%d\n", count);
	system("pause");
	return 0;
}