package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.OpenFile.class)
public class OpenFile_1410674142Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1498780896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498780896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_275214166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275214166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1448936883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448936883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "file()Ljava/io/File;", cancellable = true)
    private void file__1503869933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503869933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1070277445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070277445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/lang/String;", cancellable = true)
    private void path_275213670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275213670L))
            info.setReturnValue(null);
    }


}
