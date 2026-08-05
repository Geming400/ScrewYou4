package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockBlobConfiguration.class)
public class BlockBlobConfiguration490905036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__417721232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417721232L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1261328561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261328561L))
            info.setReturnValue("Z\u26F3+6Hj24J;dt\"\u12E8biekn$>RkUksgUl)1`x\u57F9Y'1/\"\u7D99G(K]ZY0nC\uCBC2u2`C@w\uAE0EGufl/sv- kwJLK/n}2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1048257127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048257127L))
            info.setReturnValue(-802536361);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state_159394699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159394699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_552572931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552572931L))
            info.setReturnValue(null);
    }


}
