//λ���������
//&�������������Ӧ������λ��Ϊһʱ�������Ϊһ���������0��
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a, b;
	printf("please input a;");
	scanf("%d", &a);
	printf("please input b:");
	scanf("%d", &b);
	printf("a=%d,b=%d", a, b);
	result = a&b;
	printf("\na&b=%u\n", result);
	system("pause");
	return 0;
}
//"�������|
//ֻҪ��Ӧ������������һ��λһ�������Ϊһ��
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a, b;
	printf("please input a;");
	scanf("%d", &a);
	printf("please input b:");
	scanf("%d", &b);
	printf("a=%d,b=%d", a, b);
	result = a|b;
	printf("\na|b=%u\n", result);
	system("pause");
	return 0;
}
//��ȡ���������
//~
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	unsigned result;
	int a;
	printf("please input a:");
	scanf("%d", &a);
	printf("a=%d", a);
	result = ~a;
	printf("\n~a=%o\n", result);
	system("pause");
	return 0;
}
//����һλ�൱�ڳ���2������λ�൱�ڳ���4
//���Ʒ���<<
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a = 15;
	a = a << 2;
	printf("the result1 is:%d\n", a);
	a = a << 3;
	printf("the result2 is:%d\n", a);
	system("pause");
	return 0;
}//��߸�λ��ȥ���ұߵ�λ��0��
*/
//���ƶ�ʱ��Ҫע�������������⣬��Ϊ������ʱ���λ��0��Ϊ������ʱ���λʱ��0����1��ȡ���ڱ���ϵͳ
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a = 30;
	int b = -30;
	a = a >> 3;
	b = b >> 3;
	printf("a=%d\n", a);
	printf("b=%d\n", b);
	system("pause");
	return 0;
}