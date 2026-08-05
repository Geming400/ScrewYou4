package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Sheets.class)
public class Sheets789613882Mixin {
        @Inject(at = @At("HEAD"), method = "translucentBlockItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentBlockItemSheet_1874193827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874193827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShulkerBoxSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getShulkerBoxSprite__960222595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960222595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutBlockItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutBlockItemSheet_1874193827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874193827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void cutoutItemSheet_1874193827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874193827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorToShulkerSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void colorToShulkerSprite__1575461440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575461440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShieldSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getShieldSprite_2085713287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085713287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentItemSheet()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void translucentItemSheet_1874193827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874193827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chooseSprite(Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState$ChestMaterialType;Lnet/minecraft/world/level/block/state/properties/ChestType;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void chooseSprite__1803068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShulkerSprite(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void createShulkerSprite__960222595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960222595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "armorTrimsSheet(Z)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void armorTrimsSheet__877966163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877966163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBannerSprite(Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private static void getBannerSprite_2085713287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085713287L))
            info.setReturnValue(null);
    }


}
