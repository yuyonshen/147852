#include<stdio.h>
#include<stdlib.h>
void main(){
	int i = 10, j = 0;
	do{
		j = j + i; i--;
	} while (i > 2);
	printf("%d\n", j);
	system("pause");
	return 0;
}