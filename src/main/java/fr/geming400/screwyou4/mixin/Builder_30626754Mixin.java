package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamageSourcePredicate.Builder.class)
public class Builder_30626754Mixin {
        @Inject(at = @At("HEAD"), method = "isDirect(Z)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void isDirect_1037476521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037476521L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamageSourcePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void source__1299662826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299662826L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamageSourcePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DamageSourcePredicate;", cancellable = true)
    private void build_50196533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50196533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag(Lnet/minecraft/advancements/predicates/TagPredicate;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void tag__2101730695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101730695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direct(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void direct_546475656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546475656L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamageSourcePredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private static void damageType_19599739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19599739L))
            info.setReturnValue(new net.minecraft.advancements.predicates.DamageSourcePredicate.Builder());
    }


}
