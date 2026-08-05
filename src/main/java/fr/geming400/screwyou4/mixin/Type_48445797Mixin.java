package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ServerData.Type.class)
public class Type_48445797Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private static void values_1134628949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134628949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ServerData$Type;", cancellable = true)
    private static void valueOf__451916772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451916772L))
            info.setReturnValue(net.minecraft.client.multiplayer.ServerData.Type.OTHER);
    }


}
