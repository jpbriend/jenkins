package jenkins.security.s2m.MasterKillSwitchConfiguration

def f=namespace(lib.FormTagLib)

if (instance.isRelevant()) {
    f.optionalBlock(field:"masterToSlaveAccessControl", title:_("slave2masterAccessControl")) {
        f.nested() {
            raw _("Rules can be tweaked <a href='${rootURL}/administrativeMonitor/slaveToMasterAccessControl/'>here</a>")
        }
    }
}
