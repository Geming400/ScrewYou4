package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ParticleStatus.class)
public class ParticleStatus_1483452608Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private static void values__1881576215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881576215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/level/ParticleStatus;", cancellable = true)
    private static void valueOf_1550373634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550373634L))
            info.setReturnValue(net.minecraft.server.level.ParticleStatus.MINIMAL);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_1892977592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892977592L))
            info.setReturnValue(null);
    }


}
