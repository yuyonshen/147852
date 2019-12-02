#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>//函数练习题
#include<stdlib.h>
int a = 5;
void fun(int b){
	static int a = 10;
	a += b++;
	printf("%d\n", a);
}
void main(){
	int c = 20;
	fun(c);
	a += ++c;
	printf("%d\n", a);
	system("pause");
	return 0;
}
void fun(char *c, int d){
	*c = *c + 1;
	d = d + 1;
	printf("%c,%c\n", *c, d);
}
void main(){
	char a = 'A', b = 'a';
	fun(&b, a);
	printf("%c,%c\n", a, b);
	system("pause");
	return 0;
}
char fun(char x, char y){
	if (x < y)
		return x;
	else
		return y;
}
void main(){
	int a = '9';
	int b = '8';
	int c = '7';
	printf("%c\n", fun(fun(a, b), fun(b, c)));
	system("pause");
}
void fun(int *s){
	static int j = 0;
	do{
		s[j] += s[j + 1];
	} while (++j < 2);
}
void main(){
	int k, a[10] = { 0, 1, 2, 3, 4 };
	for (k = 1; k < 3; k++)
		fun(a);
	for (k = 0; k < 5; k++)
		printf("%d", a[k]);
	system("pause");
}
int func(int x){
	int p;
	if (x == 0 || x == 1)
		return 3;
	p = x + func(x - 3);
	return p;
}
void main(){
	int num;
	num=func(12);
	printf("num=%d",num);
	system("pause");
}
int fa(int x){
	return x*x;
}
int fb(int x){
	return x*x*x;
}
int f(int(*f1)(), int(*f2)(),int x){
	return f2(x) - f1(x);
}
void main(){
	int i;
	i = f(fa, fb, 2);
	printf("%d\n", i);
	system("pause");
	return 0;
}
int fun(int n){//调用fun函数实现m=1-2+3-4+5-6
	int m = 0;
	int f = 1;
	int i;
	for (i = 1; i <= n; i++){
		m += i*f;
		f = (-1)*f;
	}
	return m;
}
void main(){
	printf("m=%d\n", fun(10));
	system("pause");
}
int  main(){
	int i;
	int n;
	int j;
	printf("input n:");
	scanf("%d",&n);
	for (i = 1; i <= n; i++){
		for (j = 1; j <= 2 * i- 1; j++){
			printf("*");
		}
		printf("\n");
	}
	system("pause");
	return 0;
}