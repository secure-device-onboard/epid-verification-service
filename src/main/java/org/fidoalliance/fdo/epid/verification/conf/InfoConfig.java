// Copyright 2021 Intel Corporation
// SPDX-License-Identifier: Apache 2.0

package org.fidoalliance.fdo.epid.verification.conf;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@NoArgsConstructor
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "info.build")
public class InfoConfig {

  @Getter @Setter private String version;
}
