package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.linkfs.LinkFileSystem.Builder.class)
public class Builder210982282Mixin {
        @Inject(at = @At("HEAD"), method = "put(Ljava/util/List;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private void put_2046855232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046855232L))
            info.setReturnValue(new net.minecraft.server.packs.linkfs.LinkFileSystem.Builder());
    }

    @Inject(at = @At("HEAD"), method = "put(Ljava/util/List;Ljava/lang/String;Ljava/nio/file/Path;)Lnet/minecraft/server/packs/linkfs/LinkFileSystem$Builder;", cancellable = true)
    private void put_1439189238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439189238L))
            info.setReturnValue(new net.minecraft.server.packs.linkfs.LinkFileSystem.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build(Ljava/lang/String;)Ljava/nio/file/FileSystem;", cancellable = true)
    private void build_484864806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484864806L))
            info.setReturnValue(null);
    }


}
