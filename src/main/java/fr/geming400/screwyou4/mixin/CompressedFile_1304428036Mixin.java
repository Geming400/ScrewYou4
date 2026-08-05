package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.CompressedFile.class)
public class CompressedFile_1304428036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_395801767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395801767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2074851560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074851560L))
            info.setReturnValue("dy|0\uD3C4,!TxyY.T!P\u7ECA\u81E86@h\uFD82ScTT^VMW:\u6919V+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1861780126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861780126L))
            info.setReturnValue(496562893);
    }

    @Inject(at = @At("HEAD"), method = "compress()Lnet/minecraft/util/eventlog/EventLogDirectory$CompressedFile;", cancellable = true)
    private void compress__399042711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399042711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private void id_315491464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315491464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path__1486455034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486455034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Ljava/io/Reader;", cancellable = true)
    private void openReader_537075839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537075839L))
            info.setReturnValue(null);
    }


}
