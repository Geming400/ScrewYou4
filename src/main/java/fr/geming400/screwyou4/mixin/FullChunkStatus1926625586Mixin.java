package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.FullChunkStatus.class)
public class FullChunkStatus1926625586Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void values__461624510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461624510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void valueOf__1445361591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445361591L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.FULL);
    }

    @Inject(at = @At("HEAD"), method = "isOrAfter(Lnet/minecraft/server/level/FullChunkStatus;)Z", cancellable = true)
    private void isOrAfter__682080100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682080100L))
            info.setReturnValue(true);
    }


}
