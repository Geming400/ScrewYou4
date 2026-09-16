package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.WardenAi.class)
public class WardenAi1528320815Mixin {
        @Inject(at = @At("HEAD"), method = "setDigCooldown(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private static void setDigCooldown__1400454507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1400454507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDisturbanceLocation(Lnet/minecraft/world/entity/monster/warden/Warden;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void setDisturbanceLocation__40711745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-40711745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/ai/Brain;)V", cancellable = true)
    private static void updateActivity__676120897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-676120897L))
            info.cancel();
    }


}
