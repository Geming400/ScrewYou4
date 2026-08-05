package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedRandom.class)
public class WeightedRandom105999470Mixin {
        @Inject(at = @At("HEAD"), method = "getWeightedItem(Ljava/util/List;ILjava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getWeightedItem__2083838862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083838862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalWeight(Ljava/util/List;Ljava/util/function/ToIntFunction;)I", cancellable = true)
    private static void getTotalWeight__976348361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976348361L))
            info.setReturnValue(450158736);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItem(Lnet/minecraft/util/RandomSource;Ljava/util/List;Ljava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItem__23464023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23464023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItem(Lnet/minecraft/util/RandomSource;Ljava/util/List;ILjava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItem__1388680686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388680686L))
            info.setReturnValue(null);
    }


}
