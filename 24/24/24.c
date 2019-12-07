#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a;
	int b;
	int tmp;
	int i;
	printf("input a and b:");
	scanf("%d%d", &a, &b);
	if (a<b){
		tmp = a;
		a = b;
		b = tmp;
	}
	for (i = a; i>0; i++){
		if (i%a == 0 && i%b == 0){
			printf("%d", i);
			break;
		}
	}
	system("pause");
	return 0;
}