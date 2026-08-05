package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.squid.GlowSquid.class)
public class GlowSquid1624391127Mixin {
        @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1174960796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174960796L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1662665866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1662665866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1072916547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072916547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDarkTicksRemaining()I", cancellable = true)
    private void getDarkTicksRemaining_1662653373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662653373L))
            info.setReturnValue(1333580443);
    }

    @Inject(at = @At("HEAD"), method = "checkGlowSquidSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkGlowSquidSpawnRules__160985940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160985940L))
            info.setReturnValue(false);
    }


}
