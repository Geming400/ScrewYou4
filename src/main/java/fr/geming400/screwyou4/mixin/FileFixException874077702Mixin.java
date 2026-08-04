package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixException.class)
public class FileFixException874077702Mixin {
        @Inject(at = @At("HEAD"), method = "makeReportedException()Lnet/minecraft/ReportedException;", cancellable = true)
    private void makeReportedException__700673950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700673950L))
            info.setReturnValue(null);
    }


}
