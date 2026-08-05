package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixException.class)
public class FileFixException874077702Mixin {
        @Inject(at = @At("HEAD"), method = "makeReportedException()Lnet/minecraft/ReportedException;", cancellable = true)
    private void makeReportedException_1606058164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606058164L))
            info.setReturnValue(null);
    }


}
