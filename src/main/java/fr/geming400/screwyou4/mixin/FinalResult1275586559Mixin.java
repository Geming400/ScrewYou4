package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackLoadFeedback.FinalResult.class)
public class FinalResult1275586559Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/PackLoadFeedback$FinalResult;", cancellable = true)
    private static void values__1939395271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939395271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/PackLoadFeedback$FinalResult;", cancellable = true)
    private static void valueOf__1140449994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140449994L))
            info.setReturnValue(null);
    }


}
