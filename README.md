## 目录
1.	[字串資料之比對(二技四技)](#題目))
2.	因數分解
3.	判斷輸入字串是否連續
4.	計算最大連續非遞減的數字長度
5.	字串之統計
6.	數學算式之求解
7.	楊暉三角塔（或稱巴斯卡三角型）
8.	字串處理
9.	身份證的驗證
10.	隨機選取
11.	3*3的方陣相乘
12.	萬年曆
13.	魔術方塊
14.	給定a, b 計算其最大公因數GCD及最小公倍數 lcm
15.	請寫一個程式，包含一個類別Dates，在建構元中初始化一個含有七個元素的字串陣列，分別對應到週日到週六的中文。提供一個方法String askDate(int d)，可接受1-7的數字，傳此數字對應星期的中文名。
****


### 題目

說明：計算兩等長之字串有多少個字元相同且同位置（以mA表示），以及多少個字元相同但不同位置（以nB表示）；  
	其中m與n為整數。輸入字串的字元範圍為A～Z，輸入的字元不可重覆，若是有小寫的字元，則需將所輸入的字元都轉成大寫來做判斷。兩字串之間以一個空白個區隔。先列A再列B，若無A或B則略之，若均無則輸出“無相同字元”。若是只輸入一個字串，則必須輸出“非兩個字串”，然後要求重新輸入。若是輸入的兩個字串不等長也必須輸出“不等長”。當輸入一字元“0”時即結束此程式。  
畫面輸出結果：

輸入：ABG  BZJG  
輸出：3B  
輸入：ABGJ　CBJG  
輸出：1A2B  
輸入：ABGI　ATGI  
輸出：3A  
輸入：ABGI　CYHK  
輸出：無相同字元  
輸入：ABGJ　BJG  
輸出：不等長  
輸入：ABGJ  
輸出：非兩個字串  
輸入：０ <-代表程式結束。


___
