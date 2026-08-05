package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Endermite.class)
public class Endermite1152262663Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1190537402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1190537402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkEndermiteSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkEndermiteSpawnRules_309998969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309998969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1190537402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1190537402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot__1931558224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931558224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_452044218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452044218L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }


}
