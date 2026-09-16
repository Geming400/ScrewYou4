package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.DyeColor.class)
public class DyeColor783500751Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1105346151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105346151L))
            info.setReturnValue("\uA1353&5\u2C3F)*H+Lh|Y8Q\uAE4BG*8^'_\uAB7C\uC01D[m`qhOh+6C\u69A5,L@[\u655B7J`[Q6\uADF4tZ\uBEA6\u5426Q&_<;}`h<5OydV+K'\uF9F1\u463A}A'Y){O>u3A\uBE86pyw");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1553923780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553923780L))
            info.setReturnValue("\uA3D4.Hae1oWi:t^r\"E(>En\u209C");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void values_429644758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429644758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void valueOf__2139395345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139395345L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.YELLOW);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__874822844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874822844L))
            info.setReturnValue(-885011720);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byName__1795210978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795210978L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byId_250117016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250117016L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.ORANGE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_871709373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871709373L))
            info.setReturnValue("\u911C{!&X\"i`YBYp\u3B45o>A\u443F_-.7;?\u9E39 tP\u9638kY\u44D7<L,x\uFB53R;oQ_UXdD5S#$k{\u364F,j;GI\u90BEX}>KqUlfTNc[:\u5423\u24B5*T2#0^\u0B6AW6\u52139'2ZCeR:");
    }

    @Inject(at = @At("HEAD"), method = "getTerracottaColor()Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private void getTerracottaColor_1063240440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063240440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapColor()Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private void getMapColor__1159754493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159754493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextColor()I", cancellable = true)
    private void getTextColor_1659513909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659513909L))
            info.setReturnValue(1798567399);
    }

    @Inject(at = @At("HEAD"), method = "byFireworkColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void byFireworkColor_1085242123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085242123L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "getFireworkColor()I", cancellable = true)
    private void getFireworkColor_1652823503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652823503L))
            info.setReturnValue(-1270182653);
    }

    @Inject(at = @At("HEAD"), method = "getTextureDiffuseColor()I", cancellable = true)
    private void getTextureDiffuseColor_1285066959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285066959L))
            info.setReturnValue(1807600540);
    }

    @Inject(at = @At("HEAD"), method = "getMixedColor(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/DyeColor;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getMixedColor__1616567200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616567200L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BROWN);
    }


}
