package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SignableCommand.class)
public class SignableCommand_2120250794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1211624525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211624525L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1404292978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404292978L))
            info.setReturnValue("E(ahLPh{A{4}'bb|iBGS_(8gkK\u5A6C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1617364412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617364412L))
            info.setReturnValue(-1825239284);
    }

    @Inject(at = @At("HEAD"), method = "of(Lcom/mojang/brigadier/ParseResults;)Lnet/minecraft/network/chat/SignableCommand;", cancellable = true)
    private static void of__537648661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537648661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arguments()Ljava/util/List;", cancellable = true)
    private void arguments__546777553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546777553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArgument(Ljava/lang/String;)Lnet/minecraft/network/chat/SignableCommand$Argument;", cancellable = true)
    private void getArgument_1087962389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087962389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSignableArguments(Lcom/mojang/brigadier/ParseResults;)Z", cancellable = true)
    private static void hasSignableArguments_323179320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323179320L))
            info.setReturnValue(true);
    }


}
