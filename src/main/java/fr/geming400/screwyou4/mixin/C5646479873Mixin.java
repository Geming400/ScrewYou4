package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C5.class)
public class C5646479873Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function5;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate__10583189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10583189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C5;", cancellable = true)
    private void select_488669427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488669427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties_575723159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575723159L))
            info.setReturnValue(null);
    }


}
