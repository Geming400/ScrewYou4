package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.class)
public class OptionInstance_809324306Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/Object;", cancellable = true)
    private void get__644604030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644604030L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1579747334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579747334L))
            info.setReturnValue("E> CFT\u6D6E\uB506NpL/Q2P>SsNC+3Wax!p}n\uA9D1kkC\uCBE2\uC136\u1BE7f>qG\uB392G1]irP\uBFA5<V+");
    }

    @Inject(at = @At("HEAD"), method = "values()Lnet/minecraft/client/OptionInstance$ValueSet;", cancellable = true)
    private void values__402531834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402531834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;)V", cancellable = true)
    private void set__1355419458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1355419458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;Lnet/minecraft/client/OptionInstance$CaptionBasedToString;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean__128619140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128619140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Z)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean__1897485825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897485825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean_412830778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412830778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;Z)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean__559282679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559282679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Ljava/lang/String;Lnet/minecraft/client/OptionInstance$TooltipSupplier;ZLnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private static void createBoolean__70625424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70625424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cachedConstantTooltip(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/OptionInstance$TooltipSupplier;", cancellable = true)
    private static void cachedConstantTooltip_1117214815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117214815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;IIILnet/minecraft/client/OptionInstance$ValueUpdateListener;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton__2023905833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023905833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;III)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton__318559746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318559746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/client/Options;)Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void createButton_1916833329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916833329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTooltip()Lnet/minecraft/client/OptionInstance$TooltipSupplier;", cancellable = true)
    private static void noTooltip_1544061542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544061542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__995385235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995385235L))
            info.setReturnValue(null);
    }


}
