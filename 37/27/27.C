//�ַ����ĸ���strcpy
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char arr1[30];
	char arr2[30];
	printf("�������ַ�����\n");
	gets(arr1);
	printf("�����ַ�����\n");
	gets(arr2);
	printf("������ַ�����\n");
	puts(arr1);
	printf("������ַ�����\n");
	puts(arr2);
		strcpy(arr1, arr2);
		printf("������ַ�����\n");
		puts(arr1);
		system("pause");
		return 0;
}
//�ַ����������strcat
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char arr1[30];
	char arr2[30];
	printf("�������ַ�����\n");
	gets(arr1);
	printf("�����ַ�����\n");
	gets(arr2);
	printf("������ַ�����\n");
	puts(arr1);
	printf("������ַ�����\n");
	puts(arr2);
	strcat(arr1, arr2);
	printf("������ַ�����\n");
	puts(arr1);
	system("pause");
	return 0;
}
//�ַ����ıȽ�strcmp
#define   _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	char a[20] = { "wohaolihai" };
	char b[20] = { "mrkj" };
	char ustr[20];
	char pwstr[20];
	int i = 0;
	while (i < 3){
		printf("����������û�����");
		gets(ustr);
		printf("������������룺");
		gets(pwstr);
		if (strcmp(a, ustr)){
			printf("�û�����������\n");
		}
		else{
			if (strcmp(b, pwstr)){
				printf("������������\n");
			}
			else{
				printf("��ӭʹ��\n");
			}
		}
		i++;
	}
	if (i == 3){
		printf("���ε�¼ʧ�ܣ�\n");
	}
	system("pause");
	return 0;
}*/
//�ַ�����С��ת��strupr and strlwr
//strupr���ַ�����Сд��ĸת��Ϊ��ѧ��ĸ
//atrlwr���ַ����Ĵ�д��ĸת��λСд��ĸ
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char a[20];
	char b[20];
	int num;
	int i = 0;
	printf("������������Ҫת���ķ�����\n");
	scanf("%d", &num);
	while (1){
		if(num == 1){
			printf("��������Ҫת�����ַ�����\n");
			scanf("%s", &a);
			strcpy(b, a);
			strupr(b);
			puts(b);
		}
		else if (num == 2){
			printf("��������Ҫת�����ַ�����\n");
			scanf("%s", &a);
			strcpy(b, a);
			strlwr(b);
			puts(b);
		}
		else if(num == 0)
			break;
		
	}
	system("pause");
	return 0;
}
//����ַ�������
//strlen