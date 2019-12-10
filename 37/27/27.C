//字符串的复制strcpy
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char arr1[30];
	char arr2[30];
	printf("请输入字符串：\n");
	gets(arr1);
	printf("请入字符串：\n");
	gets(arr2);
	printf("请输出字符串：\n");
	puts(arr1);
	printf("请输出字符串：\n");
	puts(arr2);
		strcpy(arr1, arr2);
		printf("亲输出字符串：\n");
		puts(arr1);
		system("pause");
		return 0;
}
//字符数组的链接strcat
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char arr1[30];
	char arr2[30];
	printf("请输入字符串：\n");
	gets(arr1);
	printf("请入字符串：\n");
	gets(arr2);
	printf("请输出字符串：\n");
	puts(arr1);
	printf("请输出字符串：\n");
	puts(arr2);
	strcat(arr1, arr2);
	printf("亲输出字符串：\n");
	puts(arr1);
	system("pause");
	return 0;
}
//字符串的比较strcmp
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
		printf("请输入你的用户名：");
		gets(ustr);
		printf("请输入你的密码：");
		gets(pwstr);
		if (strcmp(a, ustr)){
			printf("用户名输入有误：\n");
		}
		else{
			if (strcmp(b, pwstr)){
				printf("密码输入有误：\n");
			}
			else{
				printf("欢迎使用\n");
			}
		}
		i++;
	}
	if (i == 3){
		printf("三次登录失败：\n");
	}
	system("pause");
	return 0;
}*/
//字符串大小的转换strupr and strlwr
//strupr将字符串的小写子母转换为大学字母
//atrlwr将字符串的大写字母转换位小写字母
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char a[20];
	char b[20];
	int num;
	int i = 0;
	printf("请输入你们需要转换的方法：\n");
	scanf("%d", &num);
	while (1){
		if(num == 1){
			printf("请输入需要转换的字符串：\n");
			scanf("%s", &a);
			strcpy(b, a);
			strupr(b);
			puts(b);
		}
		else if (num == 2){
			printf("请输入需要转换的字符串：\n");
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
//获得字符串长度
//strlen