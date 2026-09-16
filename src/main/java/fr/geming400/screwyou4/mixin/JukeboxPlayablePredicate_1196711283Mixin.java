package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.JukeboxPlayablePredicate.class)
public class JukeboxPlayablePredicate_1196711283Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_288085014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288085014L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1967134807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967134807L))
            info.setReturnValue("Q\uC5A5iEAVf$/l3\u55455");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1754063373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754063373L))
            info.setReturnValue(-1383800112);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1381741480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381741480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/JukeboxPlayable;)Z", cancellable = true)
    private void matches__1797909348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797909348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__271426062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271426062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/core/component/predicates/JukeboxPlayablePredicate;", cancellable = true)
    private static void any_1817400284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817400284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "song()Ljava/util/Optional;", cancellable = true)
    private void song_1490228533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490228533L))
            info.setReturnValue(null);
    }


}
