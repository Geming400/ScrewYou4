package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.BlockStateModelLoader.LoadedModels.class)
public class LoadedModels_1439850173Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_531223904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531223904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2084693599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084693599L))
            info.setReturnValue("z$Lw(&D,H&\u4FA6GvM=IE1 g0e$,faE \uC982\u03C5[PEnB\uA53AlOl<%9\u7A62\u573EzKA'D:\"[l&n23\u7B6AHVA?mdM%np&\uB2A2r&u}\u598E^dh^Mi\u815A6dV\u6E3E:(es\uBE94");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1997202263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997202263L))
            info.setReturnValue(1993005142);
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/Map;", cancellable = true)
    private void models__672049414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672049414L))
            info.setReturnValue(null);
    }


}
