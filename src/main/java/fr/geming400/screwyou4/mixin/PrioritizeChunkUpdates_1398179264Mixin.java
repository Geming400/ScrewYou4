package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PrioritizeChunkUpdates.class)
public class PrioritizeChunkUpdates_1398179264Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PrioritizeChunkUpdates;", cancellable = true)
    private static void values__1059018792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059018792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PrioritizeChunkUpdates;", cancellable = true)
    private static void valueOf__1490097231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490097231L))
            info.setReturnValue(net.minecraft.client.PrioritizeChunkUpdates.NONE);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_1807704248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807704248L))
            info.setReturnValue(null);
    }


}
