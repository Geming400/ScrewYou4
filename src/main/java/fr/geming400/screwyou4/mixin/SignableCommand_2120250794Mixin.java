package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignableCommand.class)
public class SignableCommand_2120250794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__789204244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789204244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_984790818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984790818L))
            info.setReturnValue("nn糌dY77ywoT}mBxqxF)Cl&Q퍹{㬗(CMi`PF{:_8)䃝傗jI੧ᬭ+?ళZx]6}3$q>FMSfW?aq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2136453761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136453761L))
            info.setReturnValue(-713260357);
    }

    @Inject(at = @At("HEAD"), method = "of(Lcom/mojang/brigadier/ParseResults;)Lnet/minecraft/network/chat/SignableCommand;", cancellable = true)
    private static void of_1890651426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890651426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arguments()Ljava/util/List;", cancellable = true)
    private void arguments__548379687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548379687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSignableArguments(Lcom/mojang/brigadier/ParseResults;)Z", cancellable = true)
    private static void hasSignableArguments_619512115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619512115L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getArgument(Ljava/lang/String;)Lnet/minecraft/network/chat/SignableCommand$Argument;", cancellable = true)
    private void getArgument__984740056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984740056L))
            info.setReturnValue(null);
    }


}
