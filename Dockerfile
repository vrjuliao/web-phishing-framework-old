FROM selenium/standalone-firefox:105.0-geckodriver-0.32 as selenium

USER root

# hadolint ignore=DL3009,DL3015
RUN apt-get update && \
    apt-get install -y maven=3.6.3-1

USER 1200

ENTRYPOINT [ "/bin/bash" ]