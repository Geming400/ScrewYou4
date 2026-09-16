package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.DifficultyInstance.class)
public class DifficultyInstance749341598Mixin {
        @Inject(at = @At("HEAD"), method = "getEffectiveDifficulty()F", cancellable = true)
    private void getEffectiveDifficulty_16529461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16529461L))
            info.setReturnValue(4.502321E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__491597583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491597583L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "getSpecialMultiplier()F", cancellable = true)
    private void getSpecialMultiplier__404681187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404681187L))
            info.setReturnValue(4.502321E8F);
    }

    @Inject(at = @At("HEAD"), method = "isHarderThan(F)Z", cancellable = true)
    private void isHarderThan_1613674094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613674094L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isHard()Z", cancellable = true)
    private void isHard_1182367040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182367040L))
            info.setReturnValue(false);
    }


}
