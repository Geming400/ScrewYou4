package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.JukeboxPlayablePredicate.class)
public class JukeboxPlayablePredicate_1196711283Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1712743755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712743755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_61251307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61251307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1234974024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234974024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1829937151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829937151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/JukeboxPlayable;)Z", cancellable = true)
    private void matches_448101935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448101935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1712615291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712615291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/core/component/predicates/JukeboxPlayablePredicate;", cancellable = true)
    private static void any__1525720336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525720336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "song()Ljava/util/Optional;", cancellable = true)
    private void song_1442172704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442172704L))
            info.setReturnValue(null);
    }


}
