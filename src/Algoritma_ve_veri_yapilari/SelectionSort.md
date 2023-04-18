[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

1.adım [22, 27, 16, 2, 18, 6] 
2.adım [22, 27, 16, 2, 18, 6] n
3.adım [16, 22, 27, 2, 18, 6] n-1
4.adım [2, 16, 22, 27, 18, 6] n-2
5.adım [2, 16, 18, 22, 27, 6] n-3
6.adım [2, 6, 16, 18, 22, 27] 1

Big-O gösterimini yazınız.
n*(n+1)/2  O(n^2)

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.

18 sayısı en başta bulunmadığı için best case değildir. En sonda bulunmadığı içinse worst case değildir.
ortaya daha yakın durduğu için average casedir.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

1.adım [7, 3, 5, 8, 2, 9, 4, 15, 6] -> [2, 3, 5, 8, 7, 9, 4, 15, 6]
2.adım [2, 3, 5, 8, 7, 9, 4, 15, 6] -> [2, 3, 5, 8, 7, 9, 4, 15, 6]
3.adım [2, 3, 5, 8, 7, 9, 4, 15, 6] -> [2, 3, 4, 8, 7, 9, 5, 15, 6]
4.adım [2, 3, 4, 8, 7, 9, 5, 15, 6] -> [2, 3, 4, 5, 7, 9, 8, 15, 6]
