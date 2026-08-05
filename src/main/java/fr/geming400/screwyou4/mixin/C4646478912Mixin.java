package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C4.class)
public class C4646478912Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function4;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate_1659929419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659929419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C4;", cancellable = true)
    private void select_453924180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453924180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties_575722198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575722198L))
            info.setReturnValue(null);
    }


}
