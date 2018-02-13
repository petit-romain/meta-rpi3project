DESCRIPTION = "Project PI Qt image"
LICENSE = "MIT"

inherit rpi3project-base-image populate_sdk_qt5

IMAGE_INSTALL += "\
	qt5-env \
	ttf-dejavu-sans \
	packagegroup-qt \
"

export IMAGE_BASENAME = "rpi3project-qt-image"
