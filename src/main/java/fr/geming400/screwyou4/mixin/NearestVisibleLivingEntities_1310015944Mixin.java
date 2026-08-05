package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.NearestVisibleLivingEntities.class)
public class NearestVisibleLivingEntities_1310015944Mixin {
        @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void contains_1776141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776141L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void contains__727876466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727876466L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/entity/ai/memory/NearestVisibleLivingEntities;", cancellable = true)
    private static void empty_183599158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183599158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", cancellable = true)
    private void find__120156302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120156302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Ljava/util/function/Predicate;)Ljava/lang/Iterable;", cancellable = true)
    private void findAll__2022614968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022614968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearbyEntities()Ljava/util/List;", cancellable = true)
    private void nearbyEntities_1032955735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032955735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private void findClosest__259997210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259997210L))
            info.setReturnValue(null);
    }


}
