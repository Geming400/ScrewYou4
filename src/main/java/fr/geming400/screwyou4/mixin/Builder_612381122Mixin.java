package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder.class)
public class Builder_612381122Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1678027975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678027975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDestination(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setDestination_597157774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597157774L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setSearchRadius(I)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setSearchRadius_987888231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987888231L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setZoom(B)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setZoom__1662826343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662826343L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setMapDecoration(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setMapDecoration_511679179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511679179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSkipKnownStructures(Z)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setSkipKnownStructures__1594041506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594041506L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }


}
