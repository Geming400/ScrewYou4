package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C3.class)
public class C3646477951Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function3;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate_2134149376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134149376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C3;", cancellable = true)
    private void select__84308359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84308359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties__2022152529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022152529L))
            info.setReturnValue(null);
    }


}
