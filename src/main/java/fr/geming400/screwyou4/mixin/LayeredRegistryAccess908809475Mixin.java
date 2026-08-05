package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.LayeredRegistryAccess.class)
public class LayeredRegistryAccess908809475Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getLayer__201028050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201028050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compositeAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void compositeAccess_660059210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660059210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccessForLoading(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getAccessForLoading__201028050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201028050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Ljava/lang/Object;Ljava/util/List;)Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void replaceFrom_953854671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953854671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Ljava/lang/Object;[Lnet/minecraft/core/RegistryAccess$Frozen;)Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void replaceFrom__941391899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941391899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccessFrom(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getAccessFrom__201028050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201028050L))
            info.setReturnValue(null);
    }


}
