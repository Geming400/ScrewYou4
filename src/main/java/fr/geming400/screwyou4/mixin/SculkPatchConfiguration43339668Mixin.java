package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SculkPatchConfiguration.class)
public class SculkPatchConfiguration43339668Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1428851927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428851927L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1092120307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092120307L))
            info.setReturnValue("ﲑ|QZ ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_81602410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81602410L))
            info.setReturnValue(-2064569373);
    }

    @Inject(at = @At("HEAD"), method = "spreadAttempts()I", cancellable = true)
    private void spreadAttempts_81601914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81601914L))
            info.setReturnValue(-1861421954);
    }

    @Inject(at = @At("HEAD"), method = "spreadRounds()I", cancellable = true)
    private void spreadRounds_81601914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81601914L))
            info.setReturnValue(-1861421954);
    }

    @Inject(at = @At("HEAD"), method = "growthRounds()I", cancellable = true)
    private void growthRounds_81601914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81601914L))
            info.setReturnValue(-1861421954);
    }

    @Inject(at = @At("HEAD"), method = "amountPerCharge()I", cancellable = true)
    private void amountPerCharge_81601914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81601914L))
            info.setReturnValue(-1861421954);
    }

    @Inject(at = @At("HEAD"), method = "extraRareGrowths()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void extraRareGrowths_1868620061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868620061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chargeCount()I", cancellable = true)
    private void chargeCount_81601914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81601914L))
            info.setReturnValue(-1861421954);
    }

    @Inject(at = @At("HEAD"), method = "catalystChance()F", cancellable = true)
    private void catalystChance_81599031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81599031L))
            info.setReturnValue(8.056701E8F);
    }


}
