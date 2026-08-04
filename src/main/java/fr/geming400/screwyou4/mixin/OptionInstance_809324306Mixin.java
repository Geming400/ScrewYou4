package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.class)
public class OptionInstance_809324306Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/Object;", cancellable = true)
    private void get__1626450772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626450772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__326136166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326136166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Lnet/minecraft/client/OptionInstance$ValueSet;", cancellable = true)
    private void values__1297905308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297905308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set__2100135072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2100135072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton_675906915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675906915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;IIILnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton_708539913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708539913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;III)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton__1973842548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973842548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean_668130374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668130374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;Z)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean_853769237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853769237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean_829863652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829863652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Z)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean_925422707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925422707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;Lnet/minecraft/client/OptionInstance$CaptionBasedToString;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean__2007116816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007116816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cachedConstantTooltip(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/OptionInstance$TooltipSupplier;", cancellable = true)
    private static void cachedConstantTooltip__798250436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798250436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_417358679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417358679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTooltip()Lnet/minecraft/client/OptionInstance$TooltipSupplier;", cancellable = true)
    private static void noTooltip__976092376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976092376L))
            info.setReturnValue(null);
    }


}
