package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentMap.Builder.class)
public class Builder_708152586Mixin {
        @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/core/component/DataComponentMap;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void addAll_1374127935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374127935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void set_720451753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720451753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void build__17631512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17631512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addValidator(Ljava/util/function/Consumer;)Lnet/minecraft/core/component/DataComponentMap$Builder;", cancellable = true)
    private void addValidator__659334982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659334982L))
            info.setReturnValue(null);
    }


}
