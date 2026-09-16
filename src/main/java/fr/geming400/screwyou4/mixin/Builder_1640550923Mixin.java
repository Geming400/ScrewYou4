package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.ItemPredicate.Builder.class)
public class Builder_1640550923Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void of__125206317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125206317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void of__884767977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884767977L))
            info.setReturnValue(new net.minecraft.advancements.predicates.ItemPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/ItemPredicate;", cancellable = true)
    private void build__1629197401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629197401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private static void item__2094320029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094320029L))
            info.setReturnValue(new net.minecraft.advancements.predicates.ItemPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withCount(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void withCount_478588136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478588136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withComponents(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void withComponents_1523330952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523330952L))
            info.setReturnValue(null);
    }


}
