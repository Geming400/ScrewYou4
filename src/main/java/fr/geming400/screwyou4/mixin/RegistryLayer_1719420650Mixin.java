package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.RegistryLayer.class)
public class RegistryLayer_1719420650Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/RegistryLayer;", cancellable = true)
    private static void values_58353066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58353066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/RegistryLayer;", cancellable = true)
    private static void valueOf_2022488497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022488497L))
            info.setReturnValue(net.minecraft.server.RegistryLayer.RELOADABLE);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryAccess()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private static void createRegistryAccess__1765972809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765972809L))
            info.setReturnValue(null);
    }


}
