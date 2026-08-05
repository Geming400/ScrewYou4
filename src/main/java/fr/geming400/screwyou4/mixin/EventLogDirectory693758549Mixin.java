package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.class)
public class EventLogDirectory693758549Mixin {
        @Inject(at = @At("HEAD"), method = "open(Ljava/nio/file/Path;Ljava/lang/String;)Lnet/minecraft/util/eventlog/EventLogDirectory;", cancellable = true)
    private static void open__1479968359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479968359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewFile(Ljava/time/LocalDate;)Lnet/minecraft/util/eventlog/EventLogDirectory$RawFile;", cancellable = true)
    private void createNewFile__915373323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915373323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listFiles()Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void listFiles__848927979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848927979L))
            info.setReturnValue(null);
    }


}
