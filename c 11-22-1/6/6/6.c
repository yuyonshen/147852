#include<stdio.h>//ÕÒÊı×Ö
#include<stdlib.h>
int main(){
int a, b, c;
for (a = 0; a <= 30; a++)
	for (b = 0; b <= 30; b++){
		c = 30 - a - b;
	if (a + 2 * b + 4 * c ==88 && 2 * (a + b) - 3 * c == -15)
		printf("a=%d,b=%d,c=%d", a, b, c);
	}
system("pause");
return 0;
}