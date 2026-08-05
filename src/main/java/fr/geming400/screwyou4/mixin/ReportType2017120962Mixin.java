package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportType.class)
public class ReportType2017120962Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private static void values__1444286896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444286896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private static void valueOf_50082985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50082985L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportType.USERNAME);
    }

    @Inject(at = @At("HEAD"), method = "backendName()Ljava/lang/String;", cancellable = true)
    private void backendName__1134750646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134750646L))
            info.setReturnValue(")Gb;.i;90;DUX$;,t/|p%\u8E38j");
    }


}
