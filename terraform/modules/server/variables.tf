variable "subnet_id" {
  description = "Subnet ID for Jenkins EC2"
  type        = string
}

variable "instance_type" {
  description = "EC2 instance type"
  type        = string
  default     = "t2.micro"
}

variable "key_name" {
  description = "SSH key pair name"
  type        = string
  default     = "my-key"
}
variable "vpc_id" {
  description = "VPC ID"
  type        = string
}
