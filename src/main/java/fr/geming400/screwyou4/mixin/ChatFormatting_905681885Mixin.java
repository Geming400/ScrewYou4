package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ChatFormatting.class)
public class ChatFormatting_905681885Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1676104913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676104913L))
            info.setReturnValue("1{+SWx]'[?zBwxii\u01191u\uAD700hm\u59E1vGF:h/-,EIN\u5DF7*qVj.r.2i=Z>$7L4u,/");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void values__925701976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925701976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void valueOf_1058704879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058704879L))
            info.setReturnValue(net.minecraft.ChatFormatting.BOLD);
    }

    @Inject(at = @At("HEAD"), method = "stripFormatting(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void stripFormatting_952651056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952651056L))
            info.setReturnValue("(ns\u5A0E8Uf/3)IITG\u4F4Emu\"%:Cv]T\u9280p=k\u54D61)\u7938G\u19538\u3AE7 kb\u0C25X\u03B9K$VE%=\uCF8DKJ\u1974\u1B9EaGg\u5E94&Xu2\u527EzY}D&UKDKJ>ou");
    }

    @Inject(at = @At("HEAD"), method = "getByCode(C)Lnet/minecraft/ChatFormatting;", cancellable = true)
    private static void getByCode_1439100900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439100900L))
            info.setReturnValue(net.minecraft.ChatFormatting.WHITE);
    }


}
