//ָ���͵ĺ���
//int *fun(int x,int y)fun�Ǻ��������������Ժ���Եõ�һ��ָ���������͵�ָ��
//x��y�Ǻ���fun����ʽ����
//��ϰ�⣬
/*#define   _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){//ʵ��һ�������Ԫ�������෴��˳������
	int arr1[5];
	int arr2[5];
	printf("������������֣�\n");
	int i;
	for (i = 0; i < 5; i++){
		printf("arr1[%d]=", i);
		scanf("%d", &arr1[i]);
	}
	printf("\n");
	for (i = 0; i < 5; i++){
		arr2[i] = arr1[4 - i];
		printf("%d\t", arr2[i]);
	}
	system("pause");
	return 0;
}
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){//���������ַ���
	char arr1[100];
	char arr2[100];
	printf("�������ַ���arr1\n");
	gets(arr1);
	printf("�������ַ���arr2\n");
	gets(arr2);
	strcat(arr1, arr2);
	puts(arr1);
	system("pause");
	return 0;
}*/
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){//�ַ����ĸ���
	char arr1[30];
	char arr2[30];
	char *p1;
	char *p2;
	printf("�������ַ�����arr1\n");
	gets(arr1);
	p1 = arr1;
	p2 = arr2;
	while (*p1 != '\0'){
		*p2 = *p1;
		p1++;
		p2++;
	}
	*p2 = '\0';
	printf("��ӡarr2\n");
	puts(arr2);
	system("pause");
	return 0;
}