package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.DirectoryValidator.class)
public class DirectoryValidator33412977Mixin {
        @Inject(at = @At("HEAD"), method = "validateDirectory(Ljava/nio/file/Path;Z)Ljava/util/List;", cancellable = true)
    private void validateDirectory_225221558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225221558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateSymlink(Ljava/nio/file/Path;)Ljava/util/List;", cancellable = true)
    private void validateSymlink__632241566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632241566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateSymlink(Ljava/nio/file/Path;Ljava/util/List;)V", cancellable = true)
    private void validateSymlink_1216906292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1216906292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validateKnownDirectory(Ljava/nio/file/Path;Ljava/util/List;)V", cancellable = true)
    private void validateKnownDirectory_1216906292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1216906292L))
            info.cancel();
    }


}
