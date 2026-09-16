package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemOxidationLevel.class)
public class CopperGolemOxidationLevel_1558984952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_650358683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650358683L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1965558820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965558820L))
            info.setReturnValue("\uB214c)o=*}_3yAw(KH16/`\u59ED=E|\uD5418XT\"\uC6E2,?\uA919XcPgRNc\u1F3EBw@Y\u4116e0[:f_k^bD;20i7r}C!'6}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2116337042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116337042L))
            info.setReturnValue(281607482);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void deathSound_1292447486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292447486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void hurtSound__478120231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478120231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spinHeadSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void spinHeadSound_1320846412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320846412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void stepSound__973359786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973359786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__1904780711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904780711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void eyeTexture__870530072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870530072L))
            info.setReturnValue(null);
    }


}
