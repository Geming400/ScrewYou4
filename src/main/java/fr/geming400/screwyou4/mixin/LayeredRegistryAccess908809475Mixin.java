package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.LayeredRegistryAccess.class)
public class LayeredRegistryAccess908809475Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getLayer_307737033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307737033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Ljava/lang/Object;Ljava/util/List;)Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void replaceFrom_1913176909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913176909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceFrom(Ljava/lang/Object;[Lnet/minecraft/core/RegistryAccess$Frozen;)Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void replaceFrom_1636305063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636305063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compositeAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void compositeAccess__1090626603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090626603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccessFrom(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getAccessFrom_878843218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878843218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAccessForLoading(Ljava/lang/Object;)Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void getAccessForLoading__1135289765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135289765L))
            info.setReturnValue(null);
    }


}
