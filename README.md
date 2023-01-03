# dai7kadai-RESTAPI
　授業で扱った実装例を参考にHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装
 
# 実行内容
　http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする
 
# 実行結果
　①GET
 ![スクリーンショット_20230103_094625](https://user-images.githubusercontent.com/114993632/210287775-fbe71e1d-36bf-4b0c-9501-a84ff16b087b.png)

　②POST
 ![スクリーンショット_20221231_145245](https://user-images.githubusercontent.com/114993632/210287788-ebc8dd07-d140-4580-b3bd-477210c2a71b.png)

 
　③PATCH
 ![スクリーンショット_20221231_184619](https://user-images.githubusercontent.com/114993632/210287807-5d1fb3c4-d5a1-4e48-9aa2-d9dbca441f16.png)

 
　④DELETE
 ![スクリーンショット_20221231_185417](https://user-images.githubusercontent.com/114993632/210287814-37f6f1dc-1a2f-48eb-ac50-e1cdc94c3273.png)

# できないこと
　・名前：20文字以下での入力、空白・null入力の制限
 
　・生年月日：成立しない日付ができない（例：：1996/7/33）、空白・null入力の制限
 
![スクリーンショット_20230103_095309](https://user-images.githubusercontent.com/114993632/210288004-92cbf175-6ea4-4d0c-94cf-d5ea0187dcbc.png)
![スクリーンショット_20230103_095730](https://user-images.githubusercontent.com/114993632/210288371-09899aeb-2ae5-4bf4-85ae-a8dd92cd22e7.png)

