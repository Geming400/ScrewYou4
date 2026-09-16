package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.GameTypePredicate.class)
public class GameTypePredicate1102778253Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_194151985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194151985L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1873201778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873201778L))
            info.setReturnValue("jaA<S8\"\uD528;\u3A64p+1A;5$,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1660130344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660130344L))
            info.setReturnValue(1004763153);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/world/level/GameType;)Lnet/minecraft/advancements/predicates/GameTypePredicate;", cancellable = true)
    private static void of_1458790034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458790034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void matches_983706840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983706840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "types()Ljava/util/List;", cancellable = true)
    private void types__696885322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696885322L))
            info.setReturnValue(null);
    }


}
