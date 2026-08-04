package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C5.class)
public class C5646479873Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function5;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate__1206875840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206875840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C5;", cancellable = true)
    private void select_141531383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141531383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties__2022150607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022150607L))
            info.setReturnValue(null);
    }


}
