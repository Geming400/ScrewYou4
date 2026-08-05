package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ResultField.class)
public class ResultField1628181247Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1281161663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281161663L))
            info.setReturnValue(1815235493);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/util/profiling/ResultField;)I", cancellable = true)
    private void compareTo_603077337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603077337L))
            info.setReturnValue(-725009655);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_1666443493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666443493L))
            info.setReturnValue(331740019);
    }


}
