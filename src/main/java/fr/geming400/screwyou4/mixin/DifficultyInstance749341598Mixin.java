package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.DifficultyInstance.class)
public class DifficultyInstance749341598Mixin {
        @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__322411072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322411072L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "getEffectiveDifficulty()F", cancellable = true)
    private void getEffectiveDifficulty_787600961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787600961L))
            info.setReturnValue(3.299121E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSpecialMultiplier()F", cancellable = true)
    private void getSpecialMultiplier_787600961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787600961L))
            info.setReturnValue(3.299121E8F);
    }

    @Inject(at = @At("HEAD"), method = "isHarderThan(F)Z", cancellable = true)
    private void isHarderThan_1960491851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960491851L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isHard()Z", cancellable = true)
    private void isHard_787620181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787620181L))
            info.setReturnValue(false);
    }


}
