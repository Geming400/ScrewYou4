package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C2.class)
public class C2646476990Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiFunction;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate__1506754332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506754332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C2;", cancellable = true)
    private void select_302775130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302775130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties__2022153490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022153490L))
            info.setReturnValue(null);
    }


}
