#include<stdio.h>
int main(){//��������ʱ����������������
	int a = 20;
	int b = 10;
	a = a^b;
	b = a^b;
	a = a^b;
	printf("%d %d", a, b);
	system("pause");
	return 0;
}