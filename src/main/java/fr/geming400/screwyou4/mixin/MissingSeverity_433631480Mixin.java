package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.CompressedNbt.MissingSeverity.class)
public class MissingSeverity_433631480Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/filefix/access/CompressedNbt$MissingSeverity;", cancellable = true)
    private static void values_2137691960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137691960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "log(Ljava/lang/String;Ljava/nio/file/Path;)V", cancellable = true)
    private void log_908141587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(908141587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/filefix/access/CompressedNbt$MissingSeverity;", cancellable = true)
    private static void valueOf_1586557019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586557019L))
            info.setReturnValue(null);
    }


}
