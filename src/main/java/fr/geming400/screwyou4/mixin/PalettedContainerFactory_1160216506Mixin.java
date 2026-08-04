package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainerFactory.class)
public class PalettedContainerFactory_1160216506Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1749238532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749238532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_24756530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24756530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1198479247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198479247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/world/level/chunk/PalettedContainerFactory;", cancellable = true)
    private static void create_2111296437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111296437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlockState__1135542361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135542361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBiome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void defaultBiome__1585875019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585875019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForBlockStates()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void createForBlockStates__334532349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334532349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForBiomes()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void createForBiomes__334532349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334532349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStatesContainerCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void blockStatesContainerCodec_768250879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768250879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeStrategy()Lnet/minecraft/world/level/chunk/Strategy;", cancellable = true)
    private void biomeStrategy__1334614090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334614090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeContainerCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void biomeContainerCodec_768250879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768250879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStatesStrategy()Lnet/minecraft/world/level/chunk/Strategy;", cancellable = true)
    private void blockStatesStrategy__1334614090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334614090L))
            info.setReturnValue(null);
    }


}
