/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
//输出系统日期和时间
int main(){
	int command[4] = { 0, 1, 2, 3 };
	int num;
	struct tm *systime;
	printf("需要帮助请输入0\n");
	printf("请输入你的指令\n");
	while (1){
		scanf("%d", &num);
		if (command[0] == num){
			printf("输入数字1显示系统日期，输入数字2显示系统时间，输入数字3退出系统\n");

		}
		else if (command[1] == num){
			time_t nowtime;
			time(&nowtime);
			systime = localtime(&nowtime);
			printf("系统日期:%d-%d-%d\n", 1900 + systime->tm_year, systime->tm_mon, systime->tm_mday);
		}
		else if (command[2] = num){
			time_t nowtime;
			time(&nowtime);
			systime = localtime(&nowtime);
			printf("%d:%d:%d\n", systime->tm_hour, systime->tm_min, systime->tm_sec);
		}
		else if (command[3] == num){
			return 0;
		}
		printf("请输入命令符：\n");
	}
	system("pause");
	return 0;
}*/
