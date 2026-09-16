package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ResultField.class)
public class ResultField1628181247Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__263922687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263922687L))
            info.setReturnValue(-540897059);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/util/profiling/ResultField;)I", cancellable = true)
    private void compareTo_568250521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568250521L))
            info.setReturnValue(1493242336);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor__1727883432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727883432L))
            info.setReturnValue(950810695);
    }


}
