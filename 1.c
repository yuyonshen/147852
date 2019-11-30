#include<stdio.h>
int main(){//不创建零时变量，交换两个数
	int a = 20;
	int b = 10;
	a = a^b;
	b = a^b;
	a = a^b;
	printf("%d %d", a, b);
	system("pause");
	return 0;
}