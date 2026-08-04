package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileSystemCapabilities.class)
public class FileSystemCapabilities_1596346655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1313108383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313108383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_460886679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460886679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1634609396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634609396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atomicMove()Z", cancellable = true)
    private void atomicMove_1634625237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634625237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hardLinks()Z", cancellable = true)
    private void hardLinks_1634625237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634625237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMoveOptions()[Ljava/nio/file/CopyOption;", cancellable = true)
    private void getMoveOptions_1313692208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313692208L))
            info.setReturnValue(null);
    }


}
