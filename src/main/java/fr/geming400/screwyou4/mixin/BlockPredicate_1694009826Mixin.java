package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.BlockPredicate.class)
public class BlockPredicate_1694009826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_785383557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785383557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1830533946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830533946L))
            info.setReturnValue("!\u15EB<o:tua (j:sFgh+QO\uAD5B\uD1A0{Y9.+3x^6*\u9309nI>k#a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2043605380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043605380L))
            info.setReturnValue(-295667865);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches_1199222446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199222446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void matches_1574349977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574349977L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties__714088510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714088510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/Optional;", cancellable = true)
    private void blocks__538175723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538175723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/advancements/predicates/DataComponentMatchers;", cancellable = true)
    private void components_1478364838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478364838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nbt()Ljava/util/Optional;", cancellable = true)
    private void nbt__1350310705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350310705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresNbt()Z", cancellable = true)
    private void requiresNbt_548061222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548061222L))
            info.setReturnValue(false);
    }


}
