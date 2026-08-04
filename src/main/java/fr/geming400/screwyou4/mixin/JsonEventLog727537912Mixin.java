package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.JsonEventLog.class)
public class JsonEventLog727537912Mixin {
        @Inject(at = @At("HEAD"), method = "write(Ljava/lang/Object;)V", cancellable = true)
    private void write_2113045831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2113045831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_765812651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765812651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "open(Lcom/mojang/serialization/Codec;Ljava/nio/file/Path;)Lnet/minecraft/util/eventlog/JsonEventLog;", cancellable = true)
    private static void open__922773254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922773254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openReader()Lnet/minecraft/util/eventlog/JsonEventLogReader;", cancellable = true)
    private void openReader_1288401253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288401253L))
            info.setReturnValue(null);
    }


}
