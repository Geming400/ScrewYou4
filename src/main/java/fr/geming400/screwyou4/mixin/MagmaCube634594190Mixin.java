package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.MagmaCube.class)
public class MagmaCube634594190Mixin {
        @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize_351391759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(351391759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_2009696180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009696180L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__1587290094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587290094L))
            info.setReturnValue(3.026008E8F);
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_1157124354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157124354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire__1145467354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145467354L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkMagmaCubeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkMagmaCubeSpawnRules_1695687888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695687888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1384692499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384692499L))
            info.setReturnValue(null);
    }


}
