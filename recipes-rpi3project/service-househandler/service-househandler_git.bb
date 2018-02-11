SUMMARY = "Qt App to handle our connected house"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " \
	git://github.com/petit-romain/Service-HouseHandler;protocol=git \
	file://init-service-househandler.init \
"

SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

DEPENDS += " qtbase qtquickcontrols2 qtquick1 qmqtt" 

INSANE_SKIP_${PN} += "installed-vs-shipped"

inherit qmake5 update-rc.d

do_install_append() {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/init-service-househandler.init ${D}${sysconfdir}/init.d/init-service-househandler
}

FILE_${PN} = "/usr/share /etc /usr/bin"

INITSCRIPT_NAME = "init-service-househandler"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 19 0 1 6 ."
