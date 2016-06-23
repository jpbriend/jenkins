package jenkins.security.DownloadSettings

def f = namespace(lib.FormTagLib)

f.section(title:_("pluginManager")) {
	f.entry(field: "useBrowser") {
		f.checkbox(title: _("browserForMetadataDownload"))
	}
}
