application {
    title = 'firstclass'
    startupGroups = ['firstproject']
    autoShutdown = true
}
mvcGroups {
    // MVC Group for "firstproject"
    'firstproject' {
        model      = 'org.educlass.FirstprojectModel'
        view       = 'org.educlass.FirstprojectView'
        controller = 'org.educlass.FirstprojectController'
    }
}