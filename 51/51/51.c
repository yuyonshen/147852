//指针型的函数
//int *fun(int x,int y)fun是函数名，调用它以后可以得到一个指向整数类型的指针
//x和y是函数fun的形式参数
//练习题，
/*#define   _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){//实现一个数组的元数按照相反的顺序排列
	int arr1[5];
	int arr2[5];
	printf("请输入五个数字：\n");
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
int main(){//链接两个字符串
	char arr1[100];
	char arr2[100];
	printf("亲输入字符串arr1\n");
	gets(arr1);
	printf("请输入字符串arr2\n");
	gets(arr2);
	strcat(arr1, arr2);
	puts(arr1);
	system("pause");
	return 0;
}*/
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){//字符串的复制
	char arr1[30];
	char arr2[30];
	char *p1;
	char *p2;
	printf("请输入字符串啊arr1\n");
	gets(arr1);
	p1 = arr1;
	p2 = arr2;
	while (*p1 != '\0'){
		*p2 = *p1;
		p1++;
		p2++;
	}
	*p2 = '\0';
	printf("打印arr2\n");
	puts(arr2);
	system("pause");
	return 0;
}