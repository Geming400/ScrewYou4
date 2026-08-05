package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.CompressedFile.class)
public class CompressedFile_1304428036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1605027002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605027002L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_168968060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168968060L))
            info.setReturnValue("\u47F0\u15A3V[WU&\u7765pT/MU\u3320j%xO_T+M;T0o-+emD\uCE5C}o*\u96AB6w<\u5BF53A5Mg];kn0l;LUG\u740D/Egp?\u017Chp[{U{^UId\u362Efm!nQb{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1342690777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342690777L))
            info.setReturnValue(-431521256);
    }

    @Inject(at = @At("HEAD"), method = "compress()Lnet/minecraft/util/eventlog/EventLogDirectory$CompressedFile;", cancellable = true)
    private void compress__50033529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50033529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private void id_339451693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339451693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "path()Ljava/nio/file/Path;", cancellable = true)
    private void path_170064353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170064353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Ljava/io/Reader;", cancellable = true)
    private void openReader_962702674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962702674L))
            info.setReturnValue(null);
    }


}
