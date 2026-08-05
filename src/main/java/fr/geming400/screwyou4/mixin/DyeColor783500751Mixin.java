package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.DyeColor.class)
public class DyeColor783500751Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__351959720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351959720L))
            info.setReturnValue("0svR㭗#;*@|[]>,sMWG+IbEefTU爷!4piḢ>YA}Xb嫌!K銌");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__351959720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351959720L))
            info.setReturnValue("0svR㭗#;*@|[]>,sMWG+IbEefTU爷!4piḢ>YA}Xb嫌!K銌");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void values__334395212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334395212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void valueOf__2043121385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043121385L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.ORANGE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_821762997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821762997L))
            info.setReturnValue(-1337072321);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byName_196202652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196202652L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GREEN);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byId_168679878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168679878L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.ORANGE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__351959720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351959720L))
            info.setReturnValue("0svR㭗#;*@|[]>,sMWG+IbEefTU爷!4piḢ>YA}Xb嫌!K銌");
    }

    @Inject(at = @At("HEAD"), method = "getMapColor()Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private void getMapColor__1270156224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270156224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTerracottaColor()Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private void getTerracottaColor__1270156224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270156224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureDiffuseColor()I", cancellable = true)
    private void getTextureDiffuseColor_821762997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821762997L))
            info.setReturnValue(-1337072321);
    }

    @Inject(at = @At("HEAD"), method = "getFireworkColor()I", cancellable = true)
    private void getFireworkColor_821762997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821762997L))
            info.setReturnValue(-1337072321);
    }

    @Inject(at = @At("HEAD"), method = "getTextColor()I", cancellable = true)
    private void getTextColor_821762997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821762997L))
            info.setReturnValue(-1337072321);
    }

    @Inject(at = @At("HEAD"), method = "byFireworkColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byFireworkColor_168679878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168679878L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.ORANGE);
    }

    @Inject(at = @At("HEAD"), method = "getMixedColor(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/DyeColor;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getMixedColor_687478206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687478206L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }


}
