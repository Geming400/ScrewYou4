package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.Builder.class)
public class Builder953706519Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Layer;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void add__1618721140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618721140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void add_192066924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192066924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/world/level/block/entity/BannerPatternLayers;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void addAll_1730151679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730151679L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.BannerPatternLayers.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void build__1022531635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022531635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addIfRegistered(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void addIfRegistered_1009649501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009649501L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.BannerPatternLayers.Builder());
    }


}
