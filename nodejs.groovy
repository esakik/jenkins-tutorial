job('NodeJS Job') {
    scm {
        git('https://github.com/esakik/jenkins-tutorial.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@example.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs_v14')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
