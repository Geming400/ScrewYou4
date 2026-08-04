package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.class)
public class EventLogDirectory693758549Mixin {
        @Inject(at = @At("HEAD"), method = "open(Ljava/nio/file/Path;Ljava/lang/String;)Lnet/minecraft/util/eventlog/EventLogDirectory;", cancellable = true)
    private static void open_962037923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962037923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewFile(Ljava/time/LocalDate;)Lnet/minecraft/util/eventlog/EventLogDirectory$RawFile;", cancellable = true)
    private void createNewFile_1232755797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232755797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listFiles()Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void listFiles__398280164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398280164L))
            info.setReturnValue(null);
    }


}
