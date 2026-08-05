package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.Builder.class)
public class Builder953706519Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Layer;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void add__737338899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737338899L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.BannerPatternLayers.Builder());
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void add__77176499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77176499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAll(Lnet/minecraft/world/level/block/entity/BannerPatternLayers;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void addAll__947708353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947708353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void build__272712133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272712133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addIfRegistered(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/block/entity/BannerPatternLayers$Builder;", cancellable = true)
    private void addIfRegistered__703138659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703138659L))
            info.setReturnValue(null);
    }


}
