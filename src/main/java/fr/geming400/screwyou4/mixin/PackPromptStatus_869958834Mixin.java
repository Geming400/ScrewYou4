package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.ServerPackManager.PackPromptStatus.class)
public class PackPromptStatus_869958834Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;", cancellable = true)
    private static void values_917536090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917536090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;", cancellable = true)
    private static void valueOf_510301217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510301217L))
            info.setReturnValue(net.minecraft.client.resources.server.ServerPackManager.PackPromptStatus.PENDING);
    }


}
