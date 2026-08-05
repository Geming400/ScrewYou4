package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DirectoryLock.class)
public class DirectoryLock_1869819894Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__244755536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-244755536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/nio/file/Path;)Lnet/minecraft/util/DirectoryLock;", cancellable = true)
    private static void create_1246005017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246005017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocked(Ljava/nio/file/Path;)Z", cancellable = true)
    private static void isLocked_294039983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294039983L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__352301062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352301062L))
            info.setReturnValue(false);
    }


}
