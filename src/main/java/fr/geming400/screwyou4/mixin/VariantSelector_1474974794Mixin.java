package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.VariantSelector.class)
public class VariantSelector_1474974794Mixin {
        @Inject(at = @At("HEAD"), method = "predicate(Lnet/minecraft/world/level/block/state/StateDefinition;Ljava/lang/String;)Ljava/util/function/Predicate;", cancellable = true)
    private static void predicate_555881503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555881503L))
            info.setReturnValue(null);
    }


}
