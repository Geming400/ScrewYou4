package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.FullChunkStatus.class)
public class FullChunkStatus1926625586Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void values_894965796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894965796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void valueOf__1394807007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394807007L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.INACCESSIBLE);
    }

    @Inject(at = @At("HEAD"), method = "isOrAfter(Lnet/minecraft/server/level/FullChunkStatus;)Z", cancellable = true)
    private void isOrAfter_1901440491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901440491L))
            info.setReturnValue(false);
    }


}
