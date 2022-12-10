# Spring-batch

## Implementing

---

- mybatis dynamic sql 導入(Client 部分自動生成)
- Spring Scheduler(定期実行設定)
- Spring Batch
    - tasklet (該当者の情報を取得)
    - chunk (メール送信)
    - リトライエラーが発生した際のことを考えて、Chunkは１件ごとCommitする想定。
    - またStep間のデータ渡しはRedisで実装
    - taskletでデータ検索を行う理由としては、検索するSQLの結果を考慮したためであり、Chunkの設計に沿う形で実装を考えていたため。

## It for What

---

下記該当者に対してメール送信を行い、返却の催促を行う Batch アプリ
・本の貸出期間が迫ったユーザ
・貸出期間が終わったにもかかわらず返却を行っていないユーザ

※図書館等を想定。
