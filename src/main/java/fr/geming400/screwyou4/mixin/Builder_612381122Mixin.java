package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder.class)
public class Builder_612381122Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__101179033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101179033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZoom(B)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setZoom__1856013564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856013564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSearchRadius(I)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setSearchRadius__1730774645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730774645L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setDestination(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setDestination__1899458238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899458238L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setSkipKnownStructures(Z)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setSkipKnownStructures__813056228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813056228L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setMapDecoration(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/storage/loot/functions/ExplorationMapFunction$Builder;", cancellable = true)
    private void setMapDecoration_1035324641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035324641L))
            info.setReturnValue(null);
    }


}
