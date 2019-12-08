//循环控制课后题
//输出0-100不能被三整除的数
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	for (i = 0; i <= 100; i++){
		if (i % 3 != 0){
			printf("i=%d\n", i);
		}
	}
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>//使用for循环打印大写字母对应的ASCII码
int main(){
	int i;
	for (i = 0; i < 26; i=i+2){
		printf("字母 %c 对应的ASCII码为 %d  │  ", i + 65, i + 65);

		printf("字母 %c 对应的ASCII码为 %d \n", i + 66, i + 66);
	}
	system("pause");
	return 0;
}