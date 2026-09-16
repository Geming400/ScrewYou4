package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider.Rule.class)
public class Rule731864095Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__176762173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176762173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1502287620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502287620L))
            info.setReturnValue("\u5996");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1289216186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289216186L))
            info.setReturnValue(1121071051);
    }

    @Inject(at = @At("HEAD"), method = "then()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void then_1552093751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552093751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifTrue()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void ifTrue__220185663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220185663L))
            info.setReturnValue(null);
    }


}
