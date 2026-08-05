package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.JsonEventLog.class)
public class JsonEventLog727537912Mixin {
        @Inject(at = @At("HEAD"), method = "write(Ljava/lang/Object;)V", cancellable = true)
    private void write_165266056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165266056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1387037517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1387037517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "open(Lcom/mojang/serialization/Codec;Ljava/nio/file/Path;)Lnet/minecraft/util/eventlog/JsonEventLog;", cancellable = true)
    private static void open__1571922748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571922748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Lnet/minecraft/util/eventlog/JsonEventLogReader;", cancellable = true)
    private void openReader_2009919634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009919634L))
            info.setReturnValue(null);
    }


}
