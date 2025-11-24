def call(String newTag) {

    def filePath = "k8s/deployment.yaml"

    // Read YAML file
    def content = readFile(filePath)

    // Replace old image tag with new tag
    content = content.replaceAll(/(image:\s.*:)[^\s]+/, "\$1${newTag}")

    // Write updated content back to file
    writeFile(file: filePath, text: content)

    sh """
       git config --global user.email "mosadm637@gmail.com"
       git config --global user.name "Mohamed-Mosad-98"
       git add ${filePath}
       git commit -m "Updated deployment image tag to ${newTag}"
    """
}
