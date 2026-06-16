# タスク管理アプリ（Task Management App）

Java（Spring Boot）とSQL（H2 Database）を使用した、シンプルなタスク管理アプリケーションです。
タスクの追加・完了切り替え・削除ができる基本的なCRUD機能を実装しています。

## 使用技術

- 言語：Java 17
- フレームワーク：Spring Boot
- データベース：H2 Database
- 画面：Thymeleaf（HTML）
- ビルドツール：Maven

## 機能一覧

- タスクの新規登録
- タスク一覧の表示
- タスクの完了／未完了の切り替え
- タスクの削除
- データのDB保存（H2ファイルモードによる永続化）

## セットアップ手順

1. このリポジトリをクローン
git clone https://github.com/ユーザー名/task-management-app.git
2. Eclipse（または任意のIDE）でMavenプロジェクトとしてインポート
3. メインクラス（`DemoApplication.java`）を実行
4. ブラウザで以下にアクセス
http://localhost:8080/
## 工夫した点

- Entity・Repository・Controllerという役割ごとにパッケージを分割し、保守性を意識した構成にしました
- REST API用のController（JSON返却）と、画面表示用のController（Thymeleaf）を分けることで、用途に応じた実装の違いを学びながら実装しました
- H2のファイル保存モードを使用し、アプリ再起動後もデータが保持される設定にしました

## 今後追加したい機能

- タスクの期限設定・並び替え機能
- カテゴリ分け機能
- ユーザーごとのタスク管理（ログイン機能）

## 開発背景

実務でのSQLによるデータ抽出・Javaコードの不具合調査経験を踏まえ、Java・SQLの基礎を自走して定着させることを目的に作成しました。