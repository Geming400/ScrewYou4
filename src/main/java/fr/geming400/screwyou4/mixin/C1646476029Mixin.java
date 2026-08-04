package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C1.class)
public class C1646476029Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/Function;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate__841745622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841745622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C1;", cancellable = true)
    private void select_888151803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888151803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties__2022154451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022154451L))
            info.setReturnValue(null);
    }


}
