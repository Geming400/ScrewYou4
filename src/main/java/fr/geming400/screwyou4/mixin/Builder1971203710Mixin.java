package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentType.Builder.class)
public class Builder1971203710Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void build__743162757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743162757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "persistent(Lcom/mojang/serialization/Codec;)Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void persistent__1864301114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1864301114L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType.Builder());
    }

    @Inject(at = @At("HEAD"), method = "networkSynchronized(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void networkSynchronized__962145019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962145019L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType.Builder());
    }

    @Inject(at = @At("HEAD"), method = "cacheEncoding()Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void cacheEncoding_1291885131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291885131L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType.Builder());
    }

    @Inject(at = @At("HEAD"), method = "ignoreSwapAnimation()Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void ignoreSwapAnimation__841681195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841681195L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType.Builder());
    }


}
