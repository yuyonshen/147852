#include<stdio.h>//指针的基本了解
#include<stdlib.h>
int main(){
	int b = 10;
	int *p = &b;
	printf("*p=%p\n", *p);
	system("pause");
	return 0;

}
#include<stdio.h>
int main(){
	int b = 10;
	char*pc = (char*)&b;
	int *pi = &b;
	printf("%p\n", &b);
	printf("%p\n",pc );
	printf("%p\n",pc+1 );
	printf("%p\n", pi);
	printf("%p\n", pi+1);
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>
int main(){
	int n = 0 * 11223344;
	char*pc = (char*)&n;
	int *pi = &n;
	*pc = 0;
	*pi = 0;
	printf("%p\n", &n);
	printf("%p\n", pc);
	printf("%p\n", pi);
	system("pasue");
	return 0;
}