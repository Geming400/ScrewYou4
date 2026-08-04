package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffectUtil.class)
public class MobEffectUtil1144767445Mixin {
        @Inject(at = @At("HEAD"), method = "formatDuration(Lnet/minecraft/world/effect/MobEffectInstance;FF)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatDuration__1133581238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133581238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasWaterBreathing(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void hasWaterBreathing_1466434868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466434868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDigSpeedAmplification(Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getDigSpeedAmplification_1466418531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466418531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasDigSpeed(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void hasDigSpeed_1466434868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466434868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldEffectsRefillAirsupply(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void shouldEffectsRefillAirsupply_1466434868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466434868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEffectToPlayersAround(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;DLnet/minecraft/world/effect/MobEffectInstance;I)Ljava/util/List;", cancellable = true)
    private static void addEffectToPlayersAround__1216256566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216256566L))
            info.setReturnValue(null);
    }


}
