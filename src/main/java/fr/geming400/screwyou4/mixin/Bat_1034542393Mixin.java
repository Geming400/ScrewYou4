package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ambient.Bat.class)
public class Bat_1034542393Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_904858734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(904858734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_219254539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219254539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPushable()Z", cancellable = true)
    private void isPushable__1360876815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360876815L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1885322914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885322914L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers__172526656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172526656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVoicePitch()F", cancellable = true)
    private void getVoicePitch_1775904055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775904055L))
            info.setReturnValue(9.421278E8F);
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_924677086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924677086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkBatSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkBatSpawnRules_798340545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798340545L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAmbientSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAmbientSound__690379347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690379347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setResting(Z)V", cancellable = true)
    private void setResting_1712443329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712443329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isResting()Z", cancellable = true)
    private void isResting_804467307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804467307L))
            info.setReturnValue(false);
    }


}
