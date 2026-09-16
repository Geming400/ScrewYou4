package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.RawFile.class)
public class RawFile1840961133Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_932334865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932334865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1683582638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683582638L))
            info.setReturnValue("98P[Yp{V_i\u06EDJ7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1896654072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896654072L))
            info.setReturnValue(-23500256);
    }

    @Inject(at = @At("HEAD"), method = "compress()Lnet/minecraft/util/eventlog/EventLogDirectory$CompressedFile;", cancellable = true)
    private void compress_137490387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137490387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private void id_852024562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852024562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path__949921936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949921936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Ljava/io/Reader;", cancellable = true)
    private void openReader_1073608937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073608937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openChannel()Ljava/nio/channels/FileChannel;", cancellable = true)
    private void openChannel__1457281176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457281176L))
            info.setReturnValue(null);
    }


}
