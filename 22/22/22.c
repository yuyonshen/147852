//. ��ȡһ���������������������е�ż��λ������λ��
//Ҫ�󣺷ֱ��ӡ�����������С�
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int num;
	int i;
	printf("input num:");
	scanf("%d", &num);
	printf("ż��\n");
	for (i = 31; i >= 1; i -= 2){
		if ((num >> i) & 1){
			printf("%d ", 1);
		}
		else
			printf("%d ",0);
	}
	printf("\n");
	printf("����\n");
	for (i = 30; i >= 0; i -= 2){
		if ((num >> i) & 1){
			printf("%d ", 1);
		}
		else
			printf("%d ", 0);
	}
	system("pause");
	return 0;
}