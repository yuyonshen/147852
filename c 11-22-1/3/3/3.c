#include<stdio.h>
#include<stdlib.h>
void main(){
	int a = 0;
	a += (a = 8);
	printf("%d\n", a);
	return 0;

}