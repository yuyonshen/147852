#include<stdio.h>
#include<stdlib.h>
int cnt = 0;
       int fib(int n){
	cnt++;
	if (n == 0)
		return 1;
	else if (n == 1)
		return 2;
	else
		return fib(n - 1) + fib(n - 2);
}  
	   int main(){
	fib(8);
	printf("%d\n", fib(8));
	system("pause");
	return 0;
}

#include<stdio.h>
#include<stdlib.h>
	   int a = 1;
void test(){
	int a = 2;
	a += 1;
}
int main(){
	test();
	printf("%d\n", a);
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>
int main(){//ÏİÈëËÀÑ­»·
	int x = 1;
	do{
		printf("%2d\n", x++);
	} while (x--);
	system("pause");
	return 0;
}