package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.Type.class)
public class Type_48445797Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private static void values_907824055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907824055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private static void valueOf__1213124364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213124364L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.Type.REALM);
    }


}
