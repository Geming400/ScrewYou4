package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.PathAllowList.class)
public class PathAllowList1860704980Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Ljava/nio/file/Path;)Z", cancellable = true)
    private void matches__826971670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826971670L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getForFileSystem(Ljava/nio/file/FileSystem;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getForFileSystem_846019951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846019951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readPlain(Ljava/io/BufferedReader;)Lnet/minecraft/world/level/validation/PathAllowList;", cancellable = true)
    private static void readPlain_129018657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129018657L))
            info.setReturnValue(null);
    }


}
