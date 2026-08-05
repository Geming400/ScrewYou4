package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C1.class)
public class C1646476029Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/Function;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate_800773279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800773279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C1;", cancellable = true)
    private void select__1730929929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730929929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties_575719315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575719315L))
            info.setReturnValue(null);
    }


}
