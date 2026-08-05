package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementType.class)
public class AdvancementType586065148Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private static void values__553052281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553052281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private static void valueOf__1536789362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536789362L))
            info.setReturnValue(net.minecraft.advancements.AdvancementType.CHALLENGE);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1766477318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766477318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_674273770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674273770L))
            info.setReturnValue("@c!ku:Q%lFKzle\u617Boi$.f6P\u4650<jm=0F)");
    }

    @Inject(at = @At("HEAD"), method = "getChatColor()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getChatColor__1046026834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046026834L))
            info.setReturnValue(net.minecraft.ChatFormatting.BLACK);
    }

    @Inject(at = @At("HEAD"), method = "createAnnouncement(Lnet/minecraft/advancements/AdvancementHolder;Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void createAnnouncement__252920689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252920689L))
            info.setReturnValue(null);
    }


}
