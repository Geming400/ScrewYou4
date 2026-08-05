package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DirectoryLock.LockException.class)
public class LockException_550422222Mixin {
        @Inject(at = @At("HEAD"), method = "alreadyLocked(Ljava/nio/file/Path;)Lnet/minecraft/util/DirectoryLock$LockException;", cancellable = true)
    private static void alreadyLocked__1930689129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930689129L))
            info.setReturnValue(null);
    }


}
