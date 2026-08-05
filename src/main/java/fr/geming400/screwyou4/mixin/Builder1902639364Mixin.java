package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LightPredicate.Builder.class)
public class Builder1902639364Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/LightPredicate;", cancellable = true)
    private void build_1069610260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069610260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "light()Lnet/minecraft/advancements/predicates/LightPredicate$Builder;", cancellable = true)
    private static void light__1530054275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530054275L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LightPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setComposite(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/LightPredicate$Builder;", cancellable = true)
    private void setComposite__1711173239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711173239L))
            info.setReturnValue(new net.minecraft.advancements.predicates.LightPredicate.Builder());
    }


}
