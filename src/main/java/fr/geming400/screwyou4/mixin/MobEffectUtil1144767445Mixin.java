package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffectUtil.class)
public class MobEffectUtil1144767445Mixin {
        @Inject(at = @At("HEAD"), method = "getDigSpeedAmplification(Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private static void getDigSpeedAmplification_451838910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451838910L))
            info.setReturnValue(562672192);
    }

    @Inject(at = @At("HEAD"), method = "hasDigSpeed(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void hasDigSpeed_315609235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315609235L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasWaterBreathing(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void hasWaterBreathing__516178471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516178471L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldEffectsRefillAirsupply(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void shouldEffectsRefillAirsupply_457368456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457368456L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addEffectToPlayersAround(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;DLnet/minecraft/world/effect/MobEffectInstance;I)Ljava/util/List;", cancellable = true)
    private static void addEffectToPlayersAround_1665168828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665168828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatDuration(Lnet/minecraft/world/effect/MobEffectInstance;FF)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void formatDuration__2070378699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070378699L))
            info.setReturnValue(null);
    }


}
