def call(String newTag) {

    def filePath = "argocd/application.yaml"

    def content = readFile(filePath)

    // Replace image tag (supports image: repo/name:tag)
    content = content.replaceAll(/(image:\s.*:)[^\s]+/, "\$1${newTag}")

    writeFile(file: filePath, text: content)

    sh """
       git config --global user.email "mosadm637@gmail.com"
       git config --global user.name "Mohamed-Mosad-98"
       git add ${filePath}
       git commit -m "Updated image tag to ${newTag}"
    """
}
