package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerSkin.class)
public class PlayerSkin1317238144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_408611876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408611876L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2087661669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087661669L))
            info.setReturnValue("1:V+K(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1874590235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874590235L))
            info.setReturnValue(-917299275);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/entity/player/PlayerSkin$Patch;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void with__519993015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519993015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private void model__1432268468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432268468L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.SLIM);
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void body_490637456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490637456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cape()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void cape__2023324607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023324607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insecure(Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/world/entity/player/PlayerModelType;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void insecure__180610882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180610882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elytra()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void elytra_1699272735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699272735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secure()Z", cancellable = true)
    private void secure__1614691808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614691808L))
            info.setReturnValue(true);
    }


}
