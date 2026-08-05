package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerSkin.class)
public class PlayerSkin1317238144Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1592216893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592216893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_181778169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181778169L))
            info.setReturnValue("4B3X&fP.}9=7nEZ<c]#XZqIJ꜒䓱!7syKhႥ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1355500886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355500886L))
            info.setReturnValue(-431078686);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/entity/player/PlayerSkin$Patch;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void with_1817431299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817431299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private void model_2034263701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034263701L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.WIDE);
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void body__2063156754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063156754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secure()Z", cancellable = true)
    private void secure_1355516727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355516727L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cape()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void cape__2063156754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063156754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insecure(Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/core/ClientAsset$Texture;Lnet/minecraft/world/entity/player/PlayerModelType;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void insecure_980890650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980890650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elytra()Lnet/minecraft/core/ClientAsset$Texture;", cancellable = true)
    private void elytra__2063156754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063156754L))
            info.setReturnValue(null);
    }


}
