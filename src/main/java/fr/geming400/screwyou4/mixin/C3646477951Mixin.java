package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C3.class)
public class C3646477951Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function3;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate__964525269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964525269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C3;", cancellable = true)
    private void select_726696053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726696053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties_575721237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575721237L))
            info.setReturnValue(null);
    }


}
