package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.server.PackLoadFeedback.FinalResult.class)
public class FinalResult1275586559Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/server/PackLoadFeedback$FinalResult;", cancellable = true)
    private static void values_585844311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585844311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/server/PackLoadFeedback$FinalResult;", cancellable = true)
    private static void valueOf_177454686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177454686L))
            info.setReturnValue(net.minecraft.client.resources.server.PackLoadFeedback.FinalResult.DOWNLOAD_FAILED);
    }


}
