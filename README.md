#  CloudDevOpsProject

![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Terraform](https://img.shields.io/badge/Terraform-7B42BC?style=for-the-badge&logo=terraform&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/Kubernetes-326CE5?style=for-the-badge&logo=kubernetes&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
![Ansible](https://img.shields.io/badge/Ansible-EE0000?style=for-the-badge&logo=ansible&logoColor=white)
![ArgoCD](https://img.shields.io/badge/ArgoCD-EF7B4D?style=for-the-badge&logo=argo&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)

## 📌 Project Overview

A complete **End-to-End DevOps Graduation Project** demonstrating real-world DevOps practices using automation, Infrastructure as Code, CI/CD pipelines, container orchestration, and GitOps deployment.

This project simulates a production-ready workflow where infrastructure is provisioned on AWS, servers are configured automatically, applications are containerized, deployed to Kubernetes, and continuously delivered using Jenkins and ArgoCD.

The project demonstrates hands-on experience using:

- GitHub for version control
- Docker for containerization
- Kubernetes for orchestration
- Terraform for Infrastructure as Code
- Ansible for configuration management
- Jenkins for CI/CD automation
- ArgoCD for GitOps continuous deployment
- AWS Cloud services

---

## 🏗️ Architecture

Developer Push Code  
⬇️  
GitHub Repository  
⬇️  
Jenkins Pipeline  
⬇️  
Build Docker Image  
⬇️  
Scan Image with Trivy  
⬇️  
Push to DockerHub  
⬇️  
Update Kubernetes Manifests  
⬇️  
Push Changes to GitHub  
⬇️  
ArgoCD Sync  
⬇️  
Kubernetes Cluster on AWS

---

## 🛠️ Technologies Used

- AWS (EC2, VPC, S3, CloudWatch)
- Terraform
- Docker
- Kubernetes
- Jenkins
- Ansible
- ArgoCD
- Trivy
- Linux
- Git & GitHub

---

## 📁 Project Structure
ظ
CloudDevOpsProject/  
├── Dockerfile  
├── Jenkinsfile  
├── README.md  
│  
├── terraform/  
│   ├── backend.tf  
│   ├── main.tf  
│   ├── variables.tf  
│   └── modules/  
│       ├── network/  
│       └── server/  
│  
├── ansible/  
│   ├── inventory/  
│   ├── playbook.yml  
│   └── roles/  
│  
├── kubernetes/  
│   ├── namespace.yml  
│   ├── deployment.yml  
│   └── service.yml  
│  
├── argocd/  
│   └── application.yml  
│  
└── screenshots/

---

## ☁️ AWS Infrastructure Provisioned

- Custom VPC
- Public Subnets
- Internet Gateway
- Network ACL
- Security Groups
- Jenkins EC2 Instance
- S3 Remote Backend
- CloudWatch Monitoring
- Reusable Terraform Modules

---

## ⚙️ Configuration Management (Ansible)

- Install Git
- Install Docker
- Install Java
- Install Jenkins
- Configure EC2 automatically
- Dynamic Inventory
- Role-based structure

---

## 🔄 Jenkins CI/CD Pipeline

### Pipeline Stages

- Checkout Source Code
- Build Docker Image
- Scan Image using Trivy
- Push Image to DockerHub
- Remove Local Image
- Update Kubernetes Manifests
- Push Updated Files to GitHub
- Trigger ArgoCD Deployment

---

## ☸️ Kubernetes Deployment

### Resources Used

- Namespace: **iVolve**
- Deployment
- Service
- Pods
- ReplicaSets

### Cluster Options

- Minikube
- Kubeadm
- Amazon EKS

---

## 🚀 Continuous Deployment with ArgoCD

- GitOps deployment model
- Automatic sync from GitHub repository
- Declarative Kubernetes delivery
- Easy rollback support

---

## 📷 Screenshots

### 🔹 Jenkins Pipeline Success

(Add screenshot here)

### 🔹 Terraform Apply Output

(Add screenshot here)

### 🔹 Running Kubernetes Pods

(Add screenshot here)

### 🔹 ArgoCD Dashboard

(Add screenshot here)

### 🔹 AWS EC2 Jenkins Server

(Add screenshot here)

---

## ✅ Project Results

- Infrastructure provisioned automatically on AWS
- Jenkins server deployed successfully
- Docker images built and pushed
- Security scan completed
- Kubernetes application deployed
- ArgoCD synchronized successfully
- Full CI/CD pipeline automated

---

## 🎯 Skills Demonstrated

- DevOps Engineering
- Cloud Infrastructure (AWS)
- CI/CD Automation
- Infrastructure as Code
- Configuration Management
- Kubernetes Administration
- Containerization
- Monitoring & Logging
- Linux Administration
- GitOps Practices

---

## 💼 Why This Project Matters

This project reflects practical hands-on experience with technologies commonly required in:

- DevOps Engineer Roles
- Cloud Engineer Roles
- Site Reliability Engineer (SRE)
- Platform Engineer Roles
- Infrastructure Automation Roles

---

## 👨‍💻 Author

**Mohamed Mosad**

🔗 GitHub: https://github.com/Mohamed-Mosad-98  
🔗 LinkedIn: https://www.linkedin.com/in/mohamed-mosad-fahmy/

---

