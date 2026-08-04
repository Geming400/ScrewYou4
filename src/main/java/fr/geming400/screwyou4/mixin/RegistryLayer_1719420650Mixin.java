package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.RegistryLayer.class)
public class RegistryLayer_1719420650Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/RegistryLayer;", cancellable = true)
    private static void values_2142917772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142917772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/RegistryLayer;", cancellable = true)
    private static void valueOf_712013961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712013961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryAccess()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private static void createRegistryAccess__142599334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142599334L))
            info.setReturnValue(null);
    }


}
