package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DamageSourcePredicate.Builder.class)
public class Builder_30626754Mixin {
        @Inject(at = @At("HEAD"), method = "isDirect(Z)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void isDirect__298553162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298553162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void source_1581320593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581320593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/DamageSourcePredicate;", cancellable = true)
    private void build__1719371549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719371549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag(Lnet/minecraft/advancements/predicates/TagPredicate;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void tag__145978413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145978413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direct(Lnet/minecraft/advancements/predicates/entity/EntityPredicate$Builder;)Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private void direct_1581320593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581320593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/advancements/predicates/DamageSourcePredicate$Builder;", cancellable = true)
    private static void damageType__331716956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331716956L))
            info.setReturnValue(null);
    }


}
