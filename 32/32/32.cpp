//����������ֵ����Сֵ��������ת��
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int arr [2][3];
	int arr2[3][2];
	int max, min;
	int i, j;
	int h;
	int l;
	for (i = 0; i < 2; i++){
		for (j = 0; j < 3; j++){
			printf("arr[%d][%d]=",i,j);
			scanf("%d", &arr[i][j]);
		}
	}
	printf("�����ά���飺\n");
	for (i = 0; i < 2; i++){
		for (j = 0; j < 3; j++){
			printf("%d ", arr[i][j]);
		}
		putchar('\n');
	}
	max = arr[0][0];
	h = 0;
	l = 0;
	for (i = 0; i < 2; i++){
		for (j = 0; j < 3; j++){
			if (max < arr[i][j]){
				max = arr[i][j];
				h = i;
				l = j;
			}
		}
	}
	printf("����������ԭ������\n");
	printf("max=%d\n", max);
	min = arr[0][0];
	for (i = 0; i < 2; i++){
		for (j = 0; j < 3; j++){
			if (min>arr[i][j]){
				min = arr[i][j];
			}
		}
	}
	printf("��������С��ԭ���ǣ�\n");
	printf("min=%d\n", min);
	for (i = 0; i < 2; i++){
		for (j = 0; j < 3; j++){
			arr2[j][i] = arr[i][j];
		}
	}
	printf("�����ά���飺\n");
	for (i = 0; i < 3; i++){
		for (j = 0; j < 2; j++){
			printf("%d\t",arr2[i][j]);
		}
		putchar('\n');
	}
	system("pause");
	return 0;
}