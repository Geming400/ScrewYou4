package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.CompressedNbt.MissingSeverity.class)
public class MissingSeverity_433631480Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/filefix/access/CompressedNbt$MissingSeverity;", cancellable = true)
    private static void values_525091546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525091546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "log(Ljava/lang/String;Ljava/nio/file/Path;)V", cancellable = true)
    private void log__312238513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-312238513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/filefix/access/CompressedNbt$MissingSeverity;", cancellable = true)
    private static void valueOf__2004672461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004672461L))
            info.setReturnValue(net.minecraft.util.filefix.access.CompressedNbt.MissingSeverity.IMPORTANT);
    }


}
