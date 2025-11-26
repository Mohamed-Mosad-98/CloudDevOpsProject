def call(String imageName, String tag) {
    sh """
        docker build \
        -t ${imageName}:${tag} \
        -f docker/Dockerfile \
        .
    """
}

