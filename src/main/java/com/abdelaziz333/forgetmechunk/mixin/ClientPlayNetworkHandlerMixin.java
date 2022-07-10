package com.abdelaziz333.forgetmechunk.mixin;

import com.abdelaziz333.forgetmechunk.util.WrapWithCondition;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.world.chunk.light.LightingProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
    @WrapWithCondition(method = "method_38546", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/chunk/light/LightingProvider;setSectionStatus(Lnet/minecraft/util/math/ChunkSectionPos;Z)V"))
    private boolean shouldDoUselessLightUpdate(LightingProvider instance, ChunkSectionPos pos, boolean notReady) {
        return false;
    }
}