package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileSystemCapabilities.class)
public class FileSystemCapabilities_1596346655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_687720386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687720386L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1928197117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928197117L))
            info.setReturnValue("S5d|U\u93A0\u7BB6&`[?8s\u4C45]!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2141268551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141268551L))
            info.setReturnValue(-238540140);
    }

    @Inject(at = @At("HEAD"), method = "getMoveOptions()[Ljava/nio/file/CopyOption;", cancellable = true)
    private void getMoveOptions_882254585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882254585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hardLinks()Z", cancellable = true)
    private void hardLinks__222841337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222841337L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "atomicMove()Z", cancellable = true)
    private void atomicMove__1284968519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1284968519L))
            info.setReturnValue(true);
    }


}
