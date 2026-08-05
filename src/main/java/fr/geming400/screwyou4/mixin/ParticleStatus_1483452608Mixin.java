package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ParticleStatus.class)
public class ParticleStatus_1483452608Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private static void values__1422173241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1422173241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private static void valueOf_443625770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443625770L))
            info.setReturnValue(net.minecraft.server.level.ParticleStatus.DECREASED);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__693456558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693456558L))
            info.setReturnValue(null);
    }


}
