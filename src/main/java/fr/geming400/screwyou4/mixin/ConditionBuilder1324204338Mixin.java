package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.ConditionBuilder.class)
public class ConditionBuilder1324204338Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private void build__339916705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339916705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "term(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;[Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void term_509977503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509977503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "term(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void term__1666668071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666668071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negatedTerm(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void negatedTerm__1666668071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666668071L))
            info.setReturnValue(null);
    }


}
