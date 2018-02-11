DESCRIPTION = "Project PI Qt image"
LICENSE = "MIT"

inherit pi-project-base-image populate_sdk_qt5

IMAGE_INSTALL += "\
	qt5-env \
	ttf-dejavu-sans \
	packagegroup-qt \
"

export IMAGE_BASENAME = "pi-project-qt-image"
