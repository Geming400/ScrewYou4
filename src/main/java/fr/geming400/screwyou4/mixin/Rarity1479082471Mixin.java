package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Rarity.class)
public class Rarity1479082471Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private static void values_680074326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680074326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private static void valueOf__2080137809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080137809L))
            info.setReturnValue(net.minecraft.world.item.Rarity.EPIC);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void color_1608168007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608168007L))
            info.setReturnValue(net.minecraft.ChatFormatting.DARK_AQUA);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1567291093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567291093L))
            info.setReturnValue("2&C\u0C9DzYo\u5074\uD5EDc\u9F53GF,R?rg$MBX)4V@e'j\uC370 ;9w{!9,l;bG\u48110dz=");
    }


}
