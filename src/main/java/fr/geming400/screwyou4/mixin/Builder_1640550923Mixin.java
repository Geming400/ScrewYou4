package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.ItemPredicate.Builder.class)
public class Builder_1640550923Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void of_805271370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805271370L))
            info.setReturnValue(new net.minecraft.advancements.predicates.ItemPredicate$Builder());
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void of__292745010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292745010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/ItemPredicate;", cancellable = true)
    private void build_375226965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375226965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private static void item__1118947562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118947562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withComponents(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void withComponents_558477324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558477324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCount(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/ItemPredicate$Builder;", cancellable = true)
    private void withCount__1764843969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764843969L))
            info.setReturnValue(new net.minecraft.advancements.predicates.ItemPredicate$Builder());
    }


}
