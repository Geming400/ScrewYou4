package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.BlockPredicate.Builder.class)
public class Builder1215148077Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of_106457699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106457699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;Ljava/util/Collection;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of__1986118406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986118406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/HolderGetter;[Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void of_1763775822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763775822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProperties(Lnet/minecraft/advancements/predicates/StatePropertiesPredicate$Builder;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void setProperties_1947056917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947056917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private static void block_585205511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585205511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/BlockPredicate;", cancellable = true)
    private void build_258900038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258900038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components(Lnet/minecraft/advancements/predicates/DataComponentMatchers;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void components_1045776865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045776865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNbt(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/advancements/predicates/BlockPredicate$Builder;", cancellable = true)
    private void hasNbt_1716596964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716596964L))
            info.setReturnValue(null);
    }


}
