//��ϵ��������ϵ���ʽ
//>���� ��>=���ڵ��ڣ�<С��
//<=С�ڵ��ڣ�==���ڣ���=������
#define   _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int english;
	int chinese;
	printf("input english and chinses:");
	scanf("%d %d", &english, &chinese);
	int max;
	if (english > chinese){
		max = english;
		printf("max=%d\n", max);
	}
	else if (english == chinese){
		printf("chinese equal english\n");
	}
	else
		printf("max=%d\n", chinese);
	system("pause");
	return 0;
}