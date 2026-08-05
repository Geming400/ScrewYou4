package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.BlockPredicate.class)
public class BlockPredicate_1694009826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1215445212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215445212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_558549850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558549850L))
            info.setReturnValue("|j{QG䬱vCC9BVdjweS<I0E73qRlD4I+wK9X)L!`a{6 7#P浻(꘢_W='ke%o@t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1732272567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732272567L))
            info.setReturnValue(-1274502153);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches_306766139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306766139L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void matches__991692948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991692948L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties_1939471247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939471247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/Optional;", cancellable = true)
    private void blocks_1939471247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939471247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void components__2144043268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144043268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Ljava/util/Optional;", cancellable = true)
    private void nbt_1939471247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939471247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresNbt()Z", cancellable = true)
    private void requiresNbt_1732288408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732288408L))
            info.setReturnValue(false);
    }


}
