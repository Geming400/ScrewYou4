package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.squid.GlowSquid.class)
public class GlowSquid1624391127Mixin {
        @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_809103274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809103274L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1039278602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1039278602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1764146267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764146267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDarkTicksRemaining()I", cancellable = true)
    private void getDarkTicksRemaining__1736865775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736865775L))
            info.setReturnValue(-651912853);
    }

    @Inject(at = @At("HEAD"), method = "checkGlowSquidSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGlowSquidSpawnRules_1150400755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150400755L))
            info.setReturnValue(false);
    }


}
