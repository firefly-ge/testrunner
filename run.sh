# run.sh
# 切换到jar包目录下
cd /root/GitHub_Action 
# 停5秒
sleep 5s
# 使环境变量生效
source /root/.bash_profile
# 运行项目
nohup java -jar demo-0.0.1-SNAPSHOT.jar >/root/cicd.log 2>&1 &
