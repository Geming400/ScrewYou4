package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LightPredicate.Builder.class)
public class Builder1902639364Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/LightPredicate;", cancellable = true)
    private void build__1217743834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217743834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setComposite(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/LightPredicate$Builder;", cancellable = true)
    private void setComposite__1732821778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732821778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "light()Lnet/minecraft/advancements/predicates/LightPredicate$Builder;", cancellable = true)
    private static void light_1110090215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110090215L))
            info.setReturnValue(null);
    }


}
