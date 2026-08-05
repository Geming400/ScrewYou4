package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Rarity.class)
public class Rarity1479082471Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private static void values_1671456948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671456948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private static void valueOf__1373893161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373893161L))
            info.setReturnValue(net.minecraft.world.item.Rarity.RARE);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void color__219341916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219341916L))
            info.setReturnValue(net.minecraft.ChatFormatting.LIGHT_PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_343622000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343622000L))
            info.setReturnValue("\uD3E7=aD`*#=-5ee*");
    }


}
