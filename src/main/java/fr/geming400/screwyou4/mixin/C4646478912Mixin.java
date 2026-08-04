package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.PropertyDispatch.C4.class)
public class C4646478912Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lcom/mojang/datafixers/util/Function4;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private void generate_463636768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463636768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Object;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch$C4;", cancellable = true)
    private void select__1256241064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256241064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/List;", cancellable = true)
    private void getDefinedProperties__2022151568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022151568L))
            info.setReturnValue(null);
    }


}
