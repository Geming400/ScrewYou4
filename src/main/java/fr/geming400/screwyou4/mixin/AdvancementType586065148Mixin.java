package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementType.class)
public class AdvancementType586065148Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private static void values_803538025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803538025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private static void valueOf__1486234778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486234778L))
            info.setReturnValue(net.minecraft.advancements.AdvancementType.GOAL);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1590844017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1590844017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__549395323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549395323L))
            info.setReturnValue("W=bT;:%wⱞ8qᯣ뮿yr(Jk,?XC=₧q:am;G8qO2xK\"\"\".wFnuMF1 1o熔^}Rj>HKWGXwC`3N?썎\"U_G駗3I +l");
    }

    @Inject(at = @At("HEAD"), method = "getChatColor()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getChatColor__1112359239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112359239L))
            info.setReturnValue(net.minecraft.ChatFormatting.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "createAnnouncement(Lnet/minecraft/advancements/AdvancementHolder;Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void createAnnouncement__536651988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536651988L))
            info.setReturnValue(null);
    }


}
