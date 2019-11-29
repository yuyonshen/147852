#include<stdio.h>
#include<stdlib.h>
void main(){
	int a = 3, b = 4, c = 5, t = 99;
	if (b < a&&a < c)t = a; a = c; c = t;
	if (a>c&&b < c)t = b; b = a; a = t;
	printf("a=%d,b=%d,c=%d\n", a, b, c);
	system("pause");
	return 0;
}