package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.FileId.class)
public class FileId1889772950Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1928035196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928035196L))
            info.setReturnValue(1840605015);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1019682087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019682087L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_754312479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754312479L))
            info.setReturnValue("\"EIP]T2xt聬 Mb廕eK7RS0妽nb'.迸ჼ9I/,㍓OD뜾@站A'=nᔯ^1.HT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1928035692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928035692L))
            info.setReturnValue(1637457595);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/util/eventlog/EventLogDirectory$FileId;", cancellable = true)
    private static void parse__313254418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313254418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "date()Ljava/time/LocalDate;", cancellable = true)
    private void date_45045206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45045206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFileName(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toFileName__1192452523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192452523L))
            info.setReturnValue("Kid>B\"Ⱘ/E5C镺N4믐Q&6AhnsC6ZMpd8䣶-멩-ꄝ;mfC-迬]垦'}붌)X?,2kTOp");
    }


}
