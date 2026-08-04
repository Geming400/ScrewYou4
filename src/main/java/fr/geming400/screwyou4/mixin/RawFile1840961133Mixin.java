package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.RawFile.class)
public class RawFile1840961133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1068493904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068493904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_705501158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705501158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1879223875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879223875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compress()Lnet/minecraft/util/eventlog/EventLogDirectory$CompressedFile;", cancellable = true)
    private void compress_486499569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486499569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private void id_875984791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875984791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path_706597451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706597451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Ljava/io/Reader;", cancellable = true)
    private void openReader_1499235772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499235772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openChannel()Ljava/nio/channels/FileChannel;", cancellable = true)
    private void openChannel_534943073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534943073L))
            info.setReturnValue(null);
    }


}
