package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.class)
public class RandomSpreadType_1222312338Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private static void values__2140531271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140531271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/placement/RandomSpreadType;", cancellable = true)
    private static void valueOf__214005230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214005230L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType.TRIANGULAR);
    }

    @Inject(at = @At("HEAD"), method = "evaluate(Lnet/minecraft/util/RandomSource;I)I", cancellable = true)
    private void evaluate_1291007895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291007895L))
            info.setReturnValue(2118253087);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1310520959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310520959L))
            info.setReturnValue("w$\u91D7X<FSj\uB0944cT{{-zzc[\u7D96Ij<x-\u3177O+\u42B2I@Raj3pDG$ \u9D91y\u6045G");
    }


}
