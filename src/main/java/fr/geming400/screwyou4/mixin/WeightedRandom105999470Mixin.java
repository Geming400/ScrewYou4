package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedRandom.class)
public class WeightedRandom105999470Mixin {
        @Inject(at = @At("HEAD"), method = "getTotalWeight(Ljava/util/List;Ljava/util/function/ToIntFunction;)I", cancellable = true)
    private static void getTotalWeight__366318895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366318895L))
            info.setReturnValue(-2083974530);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItem(Lnet/minecraft/util/RandomSource;Ljava/util/List;Ljava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItem__2079843907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079843907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItem(Lnet/minecraft/util/RandomSource;Ljava/util/List;ILjava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomItem__711947650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711947650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeightedItem(Ljava/util/List;ILjava/util/function/ToIntFunction;)Ljava/util/Optional;", cancellable = true)
    private static void getWeightedItem_1099394354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099394354L))
            info.setReturnValue(null);
    }


}
