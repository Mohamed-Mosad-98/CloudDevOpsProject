📦 📁 بنية الملفات (Directory Structure)
terraform/
│── backend.tf
│── main.tf
│── outputs.tf
│── provider.tf
│── variables.tf
│── README.md
│── modules/
│   ├── network/
│   │   ├── main.tf
│   │   ├── variables.tf
│   │   └── outputs.tf
│   └── server/
│       ├── main.tf
│       ├── variables.tf
│       └── outputs.tf

🏗️ 1. Network Module

هذا الموديول مسؤول عن إنشاء الشبكة الأساسية التي تعمل عليها السيرفرات.

🔧 يقوم بإنشاء:

VPC

Public Subnets

Internet Gateway

Route Table

Route Associations

📥 Inputs:
vpc_cidr
public_subnets

📤 Outputs:
vpc_id
public_subnet_ids

🖥️ 2. Server Module (EC2 + Security Group)

هذا الموديول مسؤول عن نشر سيرفر Jenkins داخل شبكة AWS.

🔧 يقوم بإنشاء:

Security Group لفتح منافذ Jenkins

EC2 Instance مخصوص لتشغيل Jenkins

تفعيل CloudWatch Monitoring
(كود فقط، بدون apply)

📥 Inputs:
subnet_id
vpc_id
instance_type
key_name

📤 Outputs:
jenkins_public_ip
jenkins_security_group

🗂️ 3. Root Module

الملفات الرئيسية التي تربط الموديولات ببعضها وتضبط الـ provider والمتغيرات.

الملفات:

main.tf → يربط Server + Network

provider.tf → إعداد AWS Provider

backend.tf → تسليم backend S3 (بدون apply)

variables.tf → المتغيرات العامة

outputs.tf → جميع المخرجات النهائية

☁️ 4. backend.tf (Code Only – للعرض فقط)
terraform {
  backend "s3" {
    bucket = "terraform-state-bucket"
    key    = "devops/terraform.tfstate"
    region = "us-east-1"
  }
}


❗ هذا الملف تم إضافته لتلبية متطلبات المشروع فقط،
ولا يتم استخدامه فعليًا بسبب عدم توفر حساب AWS مفعل.

▶️ كيفية تشغيل الكود (Code Only بدون Apply)
1. تهيئة Terraform:
terraform init

2. التحقق من صحة الكود:
terraform validate

3. (اختياري) إنشاء مخطط التنفيذ:
terraform plan

🧩 Example for terraform.tfvars (اختياري)
vpc_cidr = "10.0.0.0/16"

public_subnets = [
  "10.0.1.0/24",
  "10.0.2.0/24"
]

instance_type = "t2.micro"
key_name      = "my-key"

📌 ملاحظات مهمة

هذا المشروع مكتمل من ناحية كتابة Terraform Infrastructure Code.

التنفيذ Terraform apply غير مطلوب لأنه يحتاج AWS Activated Account.

الكود مكتوب بأسلوب Production Ready Modules.

جميع الـ Deliverables الخاصة بالتيرافورم متوفرة:
✔ Modules
✔ Backend
✔ Folder Structure
✔ Validation
✔ Documentation

🏁 Status: Terraform – COMPLETED ✓

✔ Network Module
✔ Server Module
✔ Backend
✔ Validation
✔ Documentation
✔ GitHub Ready
