//ָ��
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int a;
	int b;
	int *num1;
	int *num2;
	printf("��������������");
	scanf("%d%d", &a, &b);
	num1 = &a;
	num2 = &b;
	printf("%d,%d\n", *num1, *num2);
	system("pause");
	return 0;
}
//ָ����Լ��Լ������㷽��
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int i;
	int *p;
	printf("������������֣�\n");
	scanf("%d", &i);
	p = &i;
	printf("%d\n", p);
	p++;//p++ָ���ǵ�ַ����һλ���һλ�����������й���intռ�ĸ��ֽ����Լ�����
	printf("%d\n", p);
	system("pause");
	return 0; 
}
//ָ�������һ��ʾ��ַ�Ⱥ��ƶ����������������й���char���� p++�ƶ���һλ
//int���� p++�ƶ����ĸ��ֽ�
#define  _CRT_SECURE_NO_WARNINGS
#include<stdlib.h>
#include<stdio.h>
int main(){
	int *p;
	int *q;
	int a[5], b[5];
	p = &a[0];
	q = b;
	printf("������������֣�\n");
	for (int i = 0; i < 5;i++)
	scanf("%d", p++);
	printf("������������֣�\n");
	for (int i = 0; i < 5; i++)
		scanf("%d\n", q++);
	p = a;
	q = b;
	for (int i = 0; i < 5; i++){
		printf("%d\n", *p++);
	}
	for (int i = 0; i < 5; i++){
		printf("%5d\n", *q++);
	}
	system("pause");
	return 0;
}