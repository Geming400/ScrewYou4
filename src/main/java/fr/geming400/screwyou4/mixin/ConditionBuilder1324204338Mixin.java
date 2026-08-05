package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.blockstates.ConditionBuilder.class)
public class ConditionBuilder1324204338Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private void build_579048525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579048525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "term(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;[Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void term_1075057587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075057587L))
            info.setReturnValue(new net.minecraft.client.data.models.blockstates.ConditionBuilder());
    }

    @Inject(at = @At("HEAD"), method = "term(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void term__657866683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657866683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negatedTerm(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private void negatedTerm_1269807111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269807111L))
            info.setReturnValue(new net.minecraft.client.data.models.blockstates.ConditionBuilder());
    }


}
