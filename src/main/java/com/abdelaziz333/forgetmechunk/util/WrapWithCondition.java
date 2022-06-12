package com.abdelaziz333.forgetmechunk.util;

import org.spongepowered.asm.mixin.injection.At;

public @interface WrapWithCondition {

    String[] method();

    At at();
}