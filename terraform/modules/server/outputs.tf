output "jenkins_public_ip" {
  value = aws_instance.jenkins_ec2.public_ip
}

output "jenkins_security_group" {
  value = aws_security_group.jenkins_sg.id
}
