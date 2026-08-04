package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.ServerPackManager.PackPromptStatus.class)
public class PackPromptStatus_869958834Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;", cancellable = true)
    private static void values__462933316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462933316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/ServerPackManager$PackPromptStatus;", cancellable = true)
    private static void valueOf__1637846791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637846791L))
            info.setReturnValue(null);
    }


}
