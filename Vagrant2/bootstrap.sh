#!/usr/bin/env bash
#Install Java, maven and git

sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install -y oracle-java8-installer
sudo apt-get install -y oracle-java8-set-default
echo "Java Installer Installed"
echo "All complete"

echo "-------------------Installing MySQL-------------------"
cd /vagrant/shared
sudo cp mysql-server_5.7.15-1ubuntu14.04_amd64.deb-bundle.tar /opt/
cd /opt/
sudo tar -xvf mysql-server_5.7.15-1ubuntu14.04_amd64.deb-bundle.tar
#//sudo apt-get install libaio1
sudo -E dpkg-preconfigure mysql-community-server_5.7.15-1ubuntu14.04_amd64.deb 
sudo dpkg -i {\
mysql-common,\
mysql-community-client,\
mysql-client,\
mysql-community-server,\
mysql-server,\
libmysqlclient20,\
libmysqlclient-dev,\
libmysqld-dev}_*.deb

sudo apt-get -f -y -q install 

sudo dpkg -i {\
mysql-common,\
mysql-community-client,\
mysql-client,\
mysql-community-server,\
mysql-server,\
libmysqlclient20,\
libmysqlclient-dev,\
libmysqld-dev}_*.deb
echo "-------------------MySQL Installed-------------------"