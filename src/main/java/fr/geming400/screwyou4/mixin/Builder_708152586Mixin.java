package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentMap.Builder.class)
public class Builder_708152586Mixin {
        @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/core/component/DataComponentMap;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void addAll__1787339265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787339265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void set_1750641099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750641099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void build_1911957526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911957526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addValidator(Ljava/util/function/Consumer;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void addValidator__1723905015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723905015L))
            info.setReturnValue(null);
    }


}
