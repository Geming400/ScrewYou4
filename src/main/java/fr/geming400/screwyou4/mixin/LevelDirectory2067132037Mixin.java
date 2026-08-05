package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelStorageSource.LevelDirectory.class)
public class LevelDirectory2067132037Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__842323000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842323000L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_931672062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931672062L))
            info.setReturnValue("q[F,L\u6C73\u1421eK )Z\uC7A6BohIx{'I<;b7'\u9C7F\"#YcBjxW&S!i4O\u7A3D+Q+F\u72F17ZnjJUS>'{\uA530LfG:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2105394779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105394779L))
            info.setReturnValue(-1864020573);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourcePath(Lnet/minecraft/world/level/storage/LevelResource;)Ljava/nio/file/Path;", cancellable = true)
    private void resourcePath__954216018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954216018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lockFile()Ljava/nio/file/Path;", cancellable = true)
    private void lockFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataFile()Ljava/nio/file/Path;", cancellable = true)
    private void dataFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iconFile()Ljava/nio/file/Path;", cancellable = true)
    private void iconFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directoryName()Ljava/lang/String;", cancellable = true)
    private void directoryName_931671566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931671566L))
            info.setReturnValue("\u62C5PG}HC|8iRo&d`=\u06F8`b^%\uA415)%}If Y&@y\u8235D+/");
    }

    @Inject(at = @At("HEAD"), method = "rawDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void rawDataFile_1649964138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649964138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oldDataFile()Ljava/nio/file/Path;", cancellable = true)
    private void oldDataFile_932768355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932768355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "corruptedDataFile(Ljava/time/ZonedDateTime;)Ljava/nio/file/Path;", cancellable = true)
    private void corruptedDataFile_1649964138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649964138L))
            info.setReturnValue(null);
    }


}
