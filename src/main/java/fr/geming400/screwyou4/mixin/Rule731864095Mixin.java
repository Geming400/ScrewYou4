package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.Rule.class)
public class Rule731864095Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2117376354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117376354L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__403595880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403595880L))
            info.setReturnValue("`88)썜vs");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_770126837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770126837L))
            info.setReturnValue(-17682960);
    }

    @Inject(at = @At("HEAD"), method = "ifTrue()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void ifTrue_764632684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764632684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "then()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void then__1200842406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200842406L))
            info.setReturnValue(null);
    }


}
