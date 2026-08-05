package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ChatFormatting.class)
public class ChatFormatting_905681885Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__229778587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229778587L))
            info.setReturnValue("zkJeOH{BBg`4矣脮v!휪3M4㫡`鰜ɳ}9B@i蘓4z쯸KDctPiᑤVcE3c");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void values__1277155062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277155062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void valueOf_453791431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453791431L))
            info.setReturnValue(net.minecraft.ChatFormatting.DARK_GREEN);
    }

    @Inject(at = @At("HEAD"), method = "stripFormatting(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void stripFormatting_2118423955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118423955L))
            info.setReturnValue("₪8Q吸Z:?D}4k遦,77邗퇃 u:㍳]rM 7Я4)\"bLP,");
    }

    @Inject(at = @At("HEAD"), method = "getByCode(C)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void getByCode_1425497086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425497086L))
            info.setReturnValue(net.minecraft.ChatFormatting.ITALIC);
    }


}
