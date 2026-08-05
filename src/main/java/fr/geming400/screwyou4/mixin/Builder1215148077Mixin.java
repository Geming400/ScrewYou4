package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.BlockPredicate.Builder.class)
public class Builder1215148077Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of_1326420474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326420474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Ljava/util/Collection;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of_1404334851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404334851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of_1163082519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163082519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void setProperties_1295597578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295597578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private static void block_319386708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319386708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/BlockPredicate;", cancellable = true)
    private void build__1748713164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748713164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void components_481061899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481061899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNbt(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void hasNbt__213409442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213409442L))
            info.setReturnValue(null);
    }


}
