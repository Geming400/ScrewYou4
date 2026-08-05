package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.cubemob.MagmaCube.class)
public class MagmaCube634594190Mixin {
        @Inject(at = @At("HEAD"), method = "setSize(IZ)V", cancellable = true)
    private void setSize__345585422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-345585422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_672872773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672872773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1811641168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811641168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_672868929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672868929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__65624255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65624255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_672853553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672853553L))
            info.setReturnValue(7.506161E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkMagmaCubeSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkMagmaCubeSpawnRules__207669504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207669504L))
            info.setReturnValue(false);
    }


}
