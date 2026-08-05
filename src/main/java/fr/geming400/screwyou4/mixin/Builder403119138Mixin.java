package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.Builder.class)
public class Builder403119138Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void remove__1726403624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726403624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Iterable;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set__1930383949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930383949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set_300746190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300746190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentPatch$Builder;", cancellable = true)
    private void set_550025942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550025942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void build__231249131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231249131L))
            info.setReturnValue(null);
    }


}
