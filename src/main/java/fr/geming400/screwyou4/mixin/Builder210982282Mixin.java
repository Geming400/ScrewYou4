package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.linkfs.LinkFileSystem.Builder.class)
public class Builder210982282Mixin {
        @Inject(at = @At("HEAD"), method = "put(Ljava/util/List;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private void put_1079660785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079660785L))
            info.setReturnValue(new net.minecraft.server.packs.linkfs.LinkFileSystem.Builder());
    }

    @Inject(at = @At("HEAD"), method = "put(Ljava/util/List;Ljava/lang/String;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private void put__418535577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418535577L))
            info.setReturnValue(new net.minecraft.server.packs.linkfs.LinkFileSystem.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build(Ljava/lang/String;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void build__1626439496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626439496L))
            info.setReturnValue(null);
    }


}
