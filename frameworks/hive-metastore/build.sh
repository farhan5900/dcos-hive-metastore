#!/usr/bin/env bash
set -e

FRAMEWORK_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
REPO_ROOT_DIR=$(dirname $(dirname $FRAMEWORK_DIR))

# grap TEMPLATE_x vars for use in universe template:
source $FRAMEWORK_DIR/versions.sh

# Build/test scheduler.zip/CLIs
${REPO_ROOT_DIR}/gradlew -p ${FRAMEWORK_DIR} check distZip
$FRAMEWORK_DIR/cli/build.sh

# Build package with our scheduler.zip/CLIs and the SDK artifacts we built:
$REPO_ROOT_DIR/tools/build_package.sh \
    hive-metastore \
    $FRAMEWORK_DIR \
    -a "$FRAMEWORK_DIR/build/distributions/$(basename $FRAMEWORK_DIR)-scheduler.zip" \
    -a "$FRAMEWORK_DIR/cli/dcos-service-cli-linux" \
    -a "$FRAMEWORK_DIR/cli/dcos-service-cli-darwin" \
    -a "$FRAMEWORK_DIR/cli/dcos-service-cli.exe" \
$@
