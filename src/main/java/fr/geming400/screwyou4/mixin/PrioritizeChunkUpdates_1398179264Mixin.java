package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PrioritizeChunkUpdates.class)
public class PrioritizeChunkUpdates_1398179264Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PrioritizeChunkUpdates;", cancellable = true)
    private static void values__1954392266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954392266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PrioritizeChunkUpdates;", cancellable = true)
    private static void valueOf_77094873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77094873L))
            info.setReturnValue(net.minecraft.client.PrioritizeChunkUpdates.NONE);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__778729902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778729902L))
            info.setReturnValue(null);
    }


}
