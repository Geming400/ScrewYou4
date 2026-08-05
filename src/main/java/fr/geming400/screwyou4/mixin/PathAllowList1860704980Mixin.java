package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.PathAllowList.class)
public class PathAllowList1860704980Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Ljava/nio/file/Path;)Z", cancellable = true)
    private void matches_1176408087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176408087L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readPlain(Ljava/io/BufferedReader;)Lnet/minecraft/world/level/validation/PathAllowList;", cancellable = true)
    private static void readPlain__1716190987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716190987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForFileSystem(Ljava/nio/file/FileSystem;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void getForFileSystem__471195023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471195023L))
            info.setReturnValue(null);
    }


}
