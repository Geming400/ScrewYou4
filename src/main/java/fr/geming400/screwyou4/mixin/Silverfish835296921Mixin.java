package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Silverfish.class)
public class Silverfish835296921Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_873571660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(873571660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot_2046443330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2046443330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_135078476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135078476L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_385866590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385866590L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkSilverfishSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSilverfishSpawnRules__6966773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6966773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1049607892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049607892L))
            info.setReturnValue(3.0536E8F);
    }


}
