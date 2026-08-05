package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentType.Builder.class)
public class Builder1971203710Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void build__1055444723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055444723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "persistent(Lcom/mojang/serialization/Codec;)Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void persistent__1284315217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284315217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheEncoding()Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void cacheEncoding_1908629718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908629718L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType$Builder());
    }

    @Inject(at = @At("HEAD"), method = "ignoreSwapAnimation()Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void ignoreSwapAnimation_1908629718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908629718L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType$Builder());
    }

    @Inject(at = @At("HEAD"), method = "networkSynchronized(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/core/component/DataComponentType$Builder;", cancellable = true)
    private void networkSynchronized_234909223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234909223L))
            info.setReturnValue(new net.minecraft.core.component.DataComponentType$Builder());
    }


}
