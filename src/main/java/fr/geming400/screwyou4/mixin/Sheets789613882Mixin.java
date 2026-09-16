package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Sheets.class)
public class Sheets789613882Mixin {
        @Inject(at = @At("HEAD"), method = "getBannerSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getBannerSprite__1365374880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365374880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutItemSheet__722656253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722656253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorTrimsSheet(Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorTrimsSheet_1722852442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722852442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutBlockItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutBlockItemSheet_409793304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409793304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShulkerSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void createShulkerSprite__1254069976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254069976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chooseSprite(Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState$ChestMaterialType;Lnet/minecraft/world/level/block/state/properties/ChestType;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void chooseSprite_17930624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17930624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShulkerBoxSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getShulkerBoxSprite_392051363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392051363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentBlockItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentBlockItemSheet__1104125717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104125717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShieldSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getShieldSprite_969380355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969380355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentItemSheet_372973136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372973136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorToShulkerSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void colorToShulkerSprite_1672517485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672517485L))
            info.setReturnValue(null);
    }


}
